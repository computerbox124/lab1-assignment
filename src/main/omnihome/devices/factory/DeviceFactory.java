package main.omnihome.devices.factory;

import main.omnihome.devices.SmartLight;
import main.omnihome.devices.SmartLock;
import main.omnihome.devices.SmartThermostat;

public interface DeviceFactory {
    SmartLight createLight();
    SmartLock createLock();
    SmartThermostat createThermostat();
}
