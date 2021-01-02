package ru.onyxone;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musics = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {
    }

    // IoC
    public MusicPlayer(List<Music> musics) {
        this.musics = musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music music : musics) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
