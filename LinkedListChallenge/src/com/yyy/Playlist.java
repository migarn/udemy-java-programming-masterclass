package com.yyy;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String name;
    private LinkedList<Song> playlist = new LinkedList<>();

    public Playlist(String name) {
        this.name = name;
    }

    public void addSong(Collection collection, String albumTitle, String songTitle) {
        if (collection.returnAlbum(albumTitle) == null) {
            System.out.println("Album not found");
        }
        else if (collection.returnSong(albumTitle,songTitle) == null) {
            System.out.println("Song not found");
        }
        else {
            playlist.add(collection.returnSong(albumTitle,songTitle));
            System.out.println("Song \"" + songTitle + "\"" + " from album \"" + albumTitle + "\" has been added to the " + name);
        }
    }

    public void operatePlaylist() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        // Zakładamy ruch do przodu
        boolean beginningReached = false;
        boolean endReached = false;
        boolean isPlaying = true;


        ListIterator<Song> listIterator = this.playlist.listIterator();

        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }

        else {
            System.out.println("\nNow listening \"" + listIterator.next().getTitle() + "\".");
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    quit = true;
                    break;

                case 1:

                    //Jeśli poruszamy się do tyłu, a chcemy przejść do przodu, musimy zrobić dwa kroki
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if (listIterator.hasNext()) {
                        System.out.println("\nNow listening \"" + listIterator.next().getTitle() + "\".");
                        endReached = false;
                        beginningReached = false;
                        isPlaying = true;
                        printMenu();
                    }
                    else {
                        System.out.println("\nReached the end of the list.");
                        goingForward = false;
                        endReached = true;
                        isPlaying = false;
                        printMenu();
                    }
                    break;

                case 2:

                    //Jeśli poruszamy się do przodu, a chcemy przejść do tyłu, musimy zrobić dwa kroki
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("\nNow listening \"" + listIterator.previous().getTitle() + "\".");
                        endReached = false;
                        beginningReached = false;
                        isPlaying = true;
                        printMenu();
                    }
                    else {
                        System.out.println("\nReached the beginning of the list.");
                        goingForward = true;
                        beginningReached = true;
                        isPlaying = false;
                        printMenu();
                    }
                    break;

                case 3:
                    if (beginningReached) {
                        System.out.println("\nNow listening \"" + listIterator.next().getTitle() + "\".");
                        endReached = false;
                        beginningReached = false;
                        goingForward = true;
                        isPlaying = true;
                        printMenu();
                    }
                    else if (endReached) {
                        System.out.println("\nNow listening \"" + listIterator.previous().getTitle() + "\".");
                        endReached = false;
                        beginningReached = false;
                        goingForward = false;
                        isPlaying = true;
                        printMenu();
                    }
                    else if (goingForward) {
                        System.out.println("\nNow listening \"" + listIterator.previous().getTitle() + "\".");
                        goingForward = false;
                        isPlaying = true;
                        printMenu();
                    }
                    else {
                        System.out.println("\nNow listening \"" + listIterator.next().getTitle() + "\".");
                        goingForward = true;
                        isPlaying = true;
                        printMenu();
                    }
                    break;

                case 4:
                    printPlaylist();
                    printMenu();
                    isPlaying = false;
                    break;

                case 5:
                    if (!isPlaying) {
                        System.out.println("No song is being listened at the moment. Please select a song to remove one.");
                        printMenu();
                    }
                    else if (goingForward) {
                        listIterator.previous();
                        System.out.println("\"" + listIterator.next().getTitle() + "\" has been removed from the playlist.");
                        listIterator.remove();
                        isPlaying = false;
                        printMenu();
                    }
                    else {
                        listIterator.next();
                        System.out.println("\"" + listIterator.previous().getTitle() + "\" has been removed from the playlist.");
                        listIterator.remove();
                        isPlaying = false;
                        printMenu();
                    }
                    break;
            }
        }

    }

    public void printMenu() {
        System.out.println("\n\tPress:\n" +
                "\t- 0 - to quit the playlist,\n" +
                "\t- 1 - to skip forward to the next song,\n" +
                "\t- 2 - to skip backward to the previous song,\n" +
                "\t- 3 - to replay the current song,\n" +
                "\t- 4 - to print list of the songs,\n" +
                "\t- 5 - to remove current song from the playlist.\n");
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void printPlaylist() {
        ListIterator<Song> listIterator = this.playlist.listIterator();
        int count = 1;
        System.out.println("\nPlaylist:");
        while (listIterator.hasNext()) {
            System.out.println("- " + count + " - " + listIterator.next().getTitle());
            count++;
        }
    }
}
