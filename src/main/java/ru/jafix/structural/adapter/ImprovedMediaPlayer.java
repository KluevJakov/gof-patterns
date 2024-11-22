package ru.jafix.structural.adapter;

/*
* Умеет играть НЕ только MP3
* */
public class ImprovedMediaPlayer implements MediaPlayerAdapter {
    private MediaPlayer adaptee;

    public ImprovedMediaPlayer(MediaPlayer adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void play(String type, String filename) {
        if (type.equalsIgnoreCase("mp3")) {
            adaptee.play(filename);
            return;
        }

        System.out.printf("Новый плеер играет песню из файла %s типа %s%n", filename, type);
    }
}
