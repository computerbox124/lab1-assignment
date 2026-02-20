package main.omnihome.devices.factory;


import main.omnihome.devices.SmartLight;
import main.omnihome.devices.SmartLock;
import main.omnihome.devices.SmartThermostat;
import main.omnihome.devices.budget.BudgetLight;
import main.omnihome.devices.budget.BudgetLock;
import main.omnihome.devices.budget.BudgetThermostat;

public class BudgetFactory implements DeviceFactory {
    @Override
    public SmartLight createLight() {
        return new BudgetLight();
    }

    @Override
    public SmartLock createLock() {
        return new BudgetLock();
    }

    @Override
    public SmartThermostat createThermostat() {
        return new BudgetThermostat();
    }
}