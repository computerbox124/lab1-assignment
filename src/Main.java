import main.omnihome.automation.AutomationRoutine;
import main.omnihome.automation.RoutineBuilder;
import main.omnihome.config.Configuration;
import main.omnihome.connection.CloudConnection;
import main.omnihome.devices.SmartLight;
import main.omnihome.devices.SmartLock;
import main.omnihome.devices.SmartThermostat;
import main.omnihome.devices.factory.DeviceFactory;
import main.omnihome.devices.factory.LuxuryFactory;
import main.omnihome.legacy.GlorbAdapter;
import main.omnihome.legacy.GlorbThermostat;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Smart Hub OmniHome initialization starts ------ ");
        CloudConnection connection1 = CloudConnection.getInstance();
        CloudConnection connection2 = CloudConnection.getInstance();

        System.out.println("First CloudConnection instance memory address at: " + connection1);
        System.out.println("Second CloudConnection instance memory address at: " + connection2);
        if (connection1 == connection2) {
            System.out.println("Both instances are the same object.");
        }

        connection1.connect();


        System.out.println("Initializing Luxury Home...");
        DeviceFactory factory = new LuxuryFactory();

        SmartLight kitchenroomLight = factory.createLight();
        SmartLock frontDoorLock = factory.createLock();
        SmartThermostat basicThermostat = factory.createThermostat();

        kitchenroomLight.turnOn();
        frontDoorLock.lock();
        basicThermostat.setTemperature(24.0);

        System.out.println("After analyze Glorb Legacy Thermostat was found");
        GlorbThermostat ther = new GlorbThermostat();

        System.out.println("Plugging it into the Smart Hub by using GlorbAdapter...");
        SmartThermostat adaptedThermostat = new GlorbAdapter(ther);

        System.out.println("Command setTemperature(25.0°C) is activating");
        adaptedThermostat.setTemperature(25.0);

        AutomationRoutine vacationMode = new RoutineBuilder()
                .withName("Vacation Mode")
                .addDevice(kitchenroomLight)
                .addDevice(frontDoorLock)
                .addDevice(basicThermostat)
                .addDevice(adaptedThermostat)
                .atTime("08:30 AM")
                .toggleNotification(true)
                .build();

        System.out.println("Successfully built routine:");
        System.out.println(vacationMode);

        Configuration livingRoomConfig = new Configuration("172.30.20.250", 8000, "v0.0.1");
        System.out.println("Living room's original config is: " + livingRoomConfig);

        Configuration guestRoomConfig = livingRoomConfig.clone();
        System.out.println("Guest room's original config is: " + guestRoomConfig);

        System.out.println("Changing Guest Room IP to 172.30.20.249...");
        guestRoomConfig.setIpAddress("172.30.20.249");

        System.out.println("After Change - Original Config: " + livingRoomConfig.getIpAddress());
        System.out.println("After Change - Cloned Config:   " + guestRoomConfig.getIpAddress());

        if (!livingRoomConfig.getIpAddress().equals(guestRoomConfig.getIpAddress())) {
            System.out.println("Changing duplicate did NOT affect the original! - SUCCESS!!!!");
        } else {
            System.out.println("Changing duplicate affected the original! - FAILED!!!!");
        }
    }
}