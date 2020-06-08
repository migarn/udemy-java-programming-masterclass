package com.yyy;

import java.util.ArrayList;

public class Collection {
    private String name;
    private ArrayList<Album> albumList = new ArrayList<>();

    public Collection(String name) {
        this.name = name;
    }

    public void addAlbum(Album album) {
        albumList.add(album);
    }

    public Album returnAlbum(String albumTitle) {
        for (int i = 0; i < albumList.size(); i++) {
            if (albumTitle.equals(albumList.get(i).getTitle())) {
                return albumList.get(i);
            }
        }
        return null;
    }

    public Song returnSong(String albumTitle, String SongTitle) {
        return returnAlbum(albumTitle).returnSong(SongTitle);
    }
}
