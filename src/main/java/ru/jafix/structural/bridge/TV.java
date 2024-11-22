package ru.jafix.structural.bridge;

public class TV implements Device {
    private boolean isOn = false;
    private int volume = 50;

    @Override
    public void on() {
        isOn = true;
        System.out.println("TV is ON");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("TV is OFF");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("TV volume = " + this.volume);
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
