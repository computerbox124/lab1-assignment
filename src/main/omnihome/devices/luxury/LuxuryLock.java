package main.omnihome.devices.luxury;

import main.omnihome.devices.SmartLock;

public class LuxuryLock implements SmartLock {
    @Override
    public void lock() {
        System.out.println("Face Scanning process happens by LuxuryLock (Face ID)...... Access Granted. At the moment is LOCKED.");
    }
}