package main.omnihome.automation;

import main.omnihome.devices.SmartDevice;

import java.util.ArrayList;
import java.util.List;

public class RoutineBuilder {
    private String name;
    private final List<SmartDevice> devices;
    private String triggerTime;
    private boolean sendNotification;

    public RoutineBuilder() {
        this.devices = new ArrayList<>();
        this.sendNotification = false;
    }

    public RoutineBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public RoutineBuilder addDevice(SmartDevice device) {
        if (device != null) {
            this.devices.add(device);
        }
        return this;
    }

    public RoutineBuilder atTime(String triggerTime) {
        this.triggerTime = triggerTime;
        return this;
    }

    public RoutineBuilder toggleNotification(boolean sendNotification) {
        this.sendNotification = sendNotification;
        return this;
    }

    public AutomationRoutine build() {
        if (this.name == null || this.name.isEmpty()) {
            throw new IllegalStateException("AutomationRoutine must have a name.");
        }
        return new AutomationRoutine(this);
    }

    String getName() { return name; }
    List<SmartDevice> getDevices() { return devices; }
    String getTriggerTime() { return triggerTime; }
    boolean isSendNotification() { return sendNotification; }
}
