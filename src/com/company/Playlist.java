package com.company;

import java.util.*;
import java.io.*;

public class Playlist implements Serializable {
    private ArrayList<Music> playlist;

    //Creates a Playlist object that contains an ArrayList for Songs.
    public Playlist() {
        playlist = new ArrayList<Music>();
    }

    //Adds a Song to a Playlist.
    public void addSong(Music Musique) {
        playlist.add(Musique);
    }

    //Returns the size of a Playlist.
    public int getPlaylistSize() {
        return playlist.size();
    }

    //Returns the artist of the Song at position (index) of a Playlist.
    public String getArtist(int index) {
        return playlist.get(index).getArtist();
    }

    //Returns the title of the Song at position (index) of a Playlist.
    public String getTitle(int index) {
        return playlist.get(index).getTitle();
    }

    //Returns the length of the Song at position (index) of a Playlist.
    public String getLength(int index) {
        return playlist.get(index).getLength();
    }

    //Sets the artist of the Song at position (index) to artist.
    public void updateArtist(int index, String artist) {
        playlist.get(--index).setArtist(artist);
    }

    //Sets the title of the Song at position (index) to the title.
    public void updateTitle(int index, String title) {
        playlist.get(--index).setTitle(title);
    }

    //Sets the length of the Song at position (index) to length; throws InvalidLengthException.
    public void updateLength(int index, String length) throws ExeptionTime {
        if (length.matches("(\\d.*):(\\d.*)")) {
            playlist.get(--index).setLength(length);
        } else {
            throw new ExeptionTime(length);
        }
    }

    //Removes the song located at the specified index from the Playlist.
    public void removeSong(int index) {
        playlist.remove(index);
    }

    //Clears the Playlist of all Songs by invoking clear() on a Playlist.
    public void deletePlaylist() {
        if (playlist.size() == 0) {
            System.out.print("Playlist is empty!\n");
        } else {
            playlist.clear();
            System.out.print("Playlist has been deleted.\n");
        }
    }

} //End class