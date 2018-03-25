package com.example.android.musicapp;

import android.content.ContentUris;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);


/*        ArrayList<Song> mSongs = new ArrayList<Song>();

        mSongs.add(new Song("New Rules", "Dua Lipa", R.drawable.newrules));
        mSongs.add(new Song("Havana", "Camilla Cabello", R.drawable.havana));
        mSongs.add(new Song("Blank Space", "Taylor Swift"));


        SongAdapter adapter = new SongAdapter(this, mSongs);
        final ListView listOfSongsView = (ListView) findViewById(R.id.listOfSongs);
        listOfSongsView.setAdapter(adapter);

        long d;

        listOfSongsView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position,
                                    long arg3)
            {
                Song song = (Song)listOfSongsView.getAdapter().getItem(position);
               // String value = (String)adapter.getItemAtPosition(position);
                // assuming string and if you want to get the value on click of list item
                // do what you intend to do on click of listview row


                Intent i = new Intent(PlaylistActivity.this, PlayerActivity.class);
                i.putExtra("MyCSong", song);
                startActivity(i);


            }
        });*/
    }

}
