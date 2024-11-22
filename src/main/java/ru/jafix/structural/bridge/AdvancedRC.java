package ru.jafix.structural.bridge;

public class AdvancedRC extends RemoteControl {
    public AdvancedRC(Device device) {
        super(device);
    }

    public void mute() {
        device.setVolume(0);
        System.out.println("MUTE DEVICE");
    }
}
