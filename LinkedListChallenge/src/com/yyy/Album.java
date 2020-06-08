package com.yyy;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private String title;
    private ArrayList<Song> albumSongList = new ArrayList<>();

    public Album(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void addSong(String songTitle, double duration) {
        albumSongList.add(new Song(songTitle,duration));
    }

    public Song returnSong(String songTitle) {
        for (int i = 0; i < albumSongList.size(); i++) {
            if (songTitle.equals(albumSongList.get(i).getTitle())) {
                return albumSongList.get(i);
            }
        }
        return null;
    }
}


