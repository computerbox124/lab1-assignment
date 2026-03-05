package main.omnihome.automation;

import main.omnihome.devices.SmartDevice;

import java.util.List;

public class AutomationRoutine {
    private final String name;
    private final List<SmartDevice> devices;
    private final String triggerTime;
    private final boolean sendNotification;

    AutomationRoutine(RoutineBuilder builder) {
        this.name = builder.getName();
        this.devices = builder.getDevices();
        this.triggerTime = builder.getTriggerTime();
        this.sendNotification = builder.isSendNotification();
    }

    public String getName() {
        return name;
    }

    public List<SmartDevice> getDevices() {
        return devices;
    }

    public String getTriggerTime() {
        return triggerTime;
    }

    public boolean isSendNotification() {
        return sendNotification;
    }

    @Override
    public String toString() {
        return "AutomationRoutine{" +
                "name='" + name + '\'' +
                ", devicesCount=" + (devices != null ? devices.size() : 0) +
                ", triggerTime='" + triggerTime + '\'' +
                ", sendNotification=" + sendNotification +
                '}';
    }
}
