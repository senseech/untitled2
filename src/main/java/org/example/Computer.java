package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.example.MusicPlayer.Janr.CLASSIC;
import static org.example.MusicPlayer.Janr.ROCK;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer" +
                "id=" + id +
                musicPlayer.playMusic(CLASSIC);
    }
}
