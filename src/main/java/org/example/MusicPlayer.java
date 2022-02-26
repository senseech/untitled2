package org.example;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;
    private List<Music> musicList;
    Random random;



    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public MusicPlayer(List <Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic(){
        Random random = new Random();
        return "Playing " + musicList.get(random.nextInt(musicList.size())).getSong();
    }



}
