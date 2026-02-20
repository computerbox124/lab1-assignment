package main.omnihome.devices.budget;

import main.omnihome.devices.SmartLock;

public class BudgetLock implements SmartLock {
    @Override
    public void lock() {
        System.out.println("At the moment BudgetLock (No camera) is LOCKED.");
    }
}