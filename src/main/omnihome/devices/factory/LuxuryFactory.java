package main.omnihome.devices.factory;

import main.omnihome.devices.SmartLight;
import main.omnihome.devices.SmartLock;
import main.omnihome.devices.SmartThermostat;
import main.omnihome.devices.luxury.LuxuryLight;
import main.omnihome.devices.luxury.LuxuryLock;
import main.omnihome.devices.luxury.LuxuryThermostat;

public class LuxuryFactory implements DeviceFactory {
    @Override
    public SmartLight createLight() {
        return new LuxuryLight();
    }

    @Override
    public SmartLock createLock() {
        return new LuxuryLock();
    }

    @Override
    public SmartThermostat createThermostat() {
        return new LuxuryThermostat();
    }
}
