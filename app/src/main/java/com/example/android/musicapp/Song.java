package com.example.android.musicapp;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Agnieszka on 24.03.2018.
 */

public class Song implements Serializable{
    private String mTitle;
    private String mArtist;
    private int mImageResourceId=-1;

    private ArrayList<Song> mSongs = new ArrayList<Song>();

        mSongs.add(new Song("New Rules", "Dua Lipa", R.drawable.newrules));
        mSongs.add(new Song("Havana", "Camilla Cabello", R.drawable.havana));
        mSongs.add(new Song("Blank Space", "Taylor Swift"));

    public Song(String title, String artist) {
        mTitle = title;
        mArtist = artist;
    }

    public Song(String title, String artist, int imageResourceId) {
        mTitle = title;
        mArtist = artist;
        mImageResourceId = imageResourceId;

    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmArtist() {
        return mArtist;
    }

    public ArrayList<Song> getmSongs() {
        return mSongs;
    }

    public int getmImageResourceId() {
        return mImageResourceId;    }

    public boolean hasImage() {
        if (mImageResourceId!=-1) return true;
        else return false;
    }
}
