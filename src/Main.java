import main.omnihome.connection.CloudConnection;
import main.omnihome.devices.SmartLight;
import main.omnihome.devices.SmartLock;
import main.omnihome.devices.SmartThermostat;
import main.omnihome.devices.factory.DeviceFactory;
import main.omnihome.devices.factory.LuxuryFactory;

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
    }
}