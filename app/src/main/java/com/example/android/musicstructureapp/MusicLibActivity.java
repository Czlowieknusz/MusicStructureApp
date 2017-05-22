package com.example.android.musicstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MusicLibActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_lib);
        View musicLibButton = findViewById(R.id.listOfSongsView);
        musicLibButton.setOnClickListener(this);
        View infoButton = findViewById(R.id.infoView);
        infoButton.setOnClickListener(this);
        View lyricsButton = findViewById(R.id.lyricsView);
        lyricsButton.setOnClickListener(this);
        View nowPlaying = findViewById(R.id.currentlyPlaying);
        nowPlaying.setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.infoView:
                i = new Intent(this, aboutSong.class);
                startActivity(i);
                break;
            case R.id.lyricsView:
                i = new Intent(this, LyricsActivity.class);
                startActivity(i);
                break;
            case R.id.currentlyPlaying:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
        }
    }
}
