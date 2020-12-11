package com.company;

import java.io.*;

public class Music implements Serializable
{
    private String artist;
    private String title;
    private String length;


    //Creates a playlist object with an artist, title, length, genre, and rating.
    public Music(String artist, String title, String length)
    {
        this.artist = artist;
        this.title = title;
        this.length = length;
    }

    //Sets Song's artist to argument artist.
    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    //Return the value of artist in a Song.
    public String getArtist()
    {
        return artist;
    }

    //Sets Song's title to argument title.
    public void setTitle(String title)
    {
        this.title = title;
    }

    //Returns the value of title in a Song.
    public String getTitle()
    {
        return this.title;
    }

    //Sets song's length to length argument; creates InvalidLengthException.
    /* This is not exactly how I wanted to do this, instead
     * this checks for validity by seeing if the argument String
     * contains both a colon and only numbers.*/
    public void setLength(String length) throws ExeptionTime
    {
        if(length.matches("(\\d.*):(\\d.*)"))
        {
            this.length = length;
        }
        else
        {
            throw new ExeptionTime(length);
        }
    }

    //Returns the value of length in a Song.
    public String getLength()
    {
        return this.length;

    }

} //End class
