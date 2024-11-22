package ru.jafix.structural.adapter;

public class Main {
    public static void main(String[] args) {
        MediaPlayerAdapter mediaPlayerAdapter = new ImprovedMediaPlayer(new MediaPlayer());

        mediaPlayerAdapter.play("mp3", "song.mp3");
        mediaPlayerAdapter.play("wav", "song.wav");
        mediaPlayerAdapter.play("flac", "song.flac");
    }
}