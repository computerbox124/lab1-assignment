package main.omnihome.devices.luxury;

import main.omnihome.devices.SmartLight;

public class LuxuryLight implements SmartLight {
    @Override
    public void turnOn() {
        System.out.println("At the moment LuxuryLight (Glass) is ON.");
    }
}