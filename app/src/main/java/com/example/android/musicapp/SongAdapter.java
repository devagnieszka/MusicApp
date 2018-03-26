package com.example.android.musicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Agnieszka on 24.03.2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context,0, songs);

    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        Song currentSong = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.titleText);
        titleTextView.setText(currentSong.getmTitle());

        TextView artistTextView = listItemView.findViewById(R.id.artistText);
        artistTextView.setText(currentSong.getmArtist());

        ImageView albumView = listItemView.findViewById(R.id.musicIcon);
        if (currentSong.hasImage()) {
          albumView.setImageResource(currentSong.getmImageResourceId());
        }

        return listItemView;
    }
}
