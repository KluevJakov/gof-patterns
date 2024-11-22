package ru.jafix.structural.bridge;

public interface Device {
    void on();
    void off();
    boolean isOn();
    void setVolume(int volume);
    int getVolume();
}
