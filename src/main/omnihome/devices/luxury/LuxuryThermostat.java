package main.omnihome.devices.luxury;

import main.omnihome.devices.SmartThermostat;

public class LuxuryThermostat implements SmartThermostat {
    @Override
    public void setTemperature(double temp) {
        System.out.println("Predicting comfort tool is activate by LuxuryThermostat (AI-powered)... At the moment setting temperature to " + temp + "°C instantly.");
    }
}
