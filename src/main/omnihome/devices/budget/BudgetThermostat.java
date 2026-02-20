package main.omnihome.devices.budget;

import main.omnihome.devices.SmartThermostat;

public class BudgetThermostat implements SmartThermostat {
    @Override
    public void setTemperature(double temp) {
        System.out.println("At the moment BudgetThermostat (Slow) is at the " + temp + "°C.");
    }
}