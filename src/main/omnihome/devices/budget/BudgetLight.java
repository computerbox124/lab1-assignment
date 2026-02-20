package main.omnihome.devices.budget;

import main.omnihome.devices.SmartLight;

public class BudgetLight implements SmartLight {
    @Override
    public void turnOn() {
        System.out.println("At the moment BudgetLight (Plastic) is ON.");
    }
}