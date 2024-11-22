package ru.jafix.structural.adapter;

/*
* Умеет играть только MP3
* */
public class MediaPlayer {
    public void play(String filename) {
        System.out.println("Старый плеер играет песню из файла " + filename);
    }
}
