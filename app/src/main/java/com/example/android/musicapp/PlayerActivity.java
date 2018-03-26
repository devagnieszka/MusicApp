package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        ImageView playlistImage = findViewById(R.id.imagePlaylist);
        playlistImage.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View view) {
              Intent i = new Intent(PlayerActivity.this, PlaylistActivity.class);
                startActivity(i);
           }
         });
    }
}
