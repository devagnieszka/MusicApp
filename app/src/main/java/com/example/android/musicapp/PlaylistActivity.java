package com.example.android.musicapp;

import android.content.ContentUris;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        ImageButton playButton = findViewById(R.id.playMediaImage);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PlaylistActivity.this, PlayerActivity.class);
                startActivity(i);
            }
        });

        Song song = new Song();
        ArrayList<Song> songs = song.getmSongs();
        SongAdapter adapter = new SongAdapter(this,    songs);
        ListView listOfSongsView = (ListView) findViewById(R.id.listOfSongs);
        listOfSongsView.setAdapter(adapter);

        listOfSongsView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3)
            {
                Intent i = new Intent(PlaylistActivity.this, PlayerActivity.class);
                startActivity(i);
            }
        });
    }
}
