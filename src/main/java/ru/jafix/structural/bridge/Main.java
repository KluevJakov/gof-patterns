package ru.jafix.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl tvRemote = new RemoteControl(tv);

        tvRemote.toggle();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.volumeDown();

        Device fm = new FM();
        AdvancedRC fmRemote = new AdvancedRC(fm);

        fmRemote.toggle();
        fmRemote.volumeUp();
        fmRemote.volumeUp();
        fmRemote.volumeDown();
        fmRemote.mute();
    }
}