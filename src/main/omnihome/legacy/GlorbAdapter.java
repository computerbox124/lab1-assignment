package main.omnihome.legacy;

import main.omnihome.devices.SmartThermostat;

public class GlorbAdapter implements SmartThermostat {
    private final GlorbThermostat glorbThermostat;

    public GlorbAdapter(GlorbThermostat glorbThermostat) {
        this.glorbThermostat = glorbThermostat;
    }

    @Override
    public void setTemperature(double celsius) {
        int fahrenheit = (int) Math.round((celsius * 9.0 / 5.0) + 32.0);
        System.out.println("At the moment, GlorbAdapter is converting " + celsius + "°C to " + fahrenheit + "°F...");
        glorbThermostat.setHeatIndex(fahrenheit);
    }
}