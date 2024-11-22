package ru.jafix.structural.bridge;

public class FM implements Device {
    private boolean isOn = false;
    private int volume = 30;

    @Override
    public void on() {
        isOn = true;
        System.out.println("FM is ON");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("FM is OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("FM volume = " + this.volume);
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
