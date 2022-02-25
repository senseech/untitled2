package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static org.example.MusicPlayer.Janr.CLASSIC;
import static org.example.MusicPlayer.Janr.ROCK;

@Component
public class MusicPlayer {
    private Music music1;
    enum Janr{
        ROCK,
        CLASSIC
    }
    String s;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,@Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    private Music music2;

    public String playMusic(Enum Janr) {
        if (ROCK.equals(Janr)) {
            s = "Playing: " + music1.getSong();
        } else if (CLASSIC.equals(Janr)) {
            s = "Playing: " + music2.getSong();
        }

        return s;
    }
}
