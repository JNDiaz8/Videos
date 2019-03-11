package com.example.matinal.videoii;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URL;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class MainActivity extends AppCompatActivity {
    private MediaController mediaController;
    VideoView reproductor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reproductor = findViewById(R.id.videoView);

        reproductor.setVideoURI(Uri.parse("http://www.androidbegin.com/tutorial/AndroidCommercial.3gp"));

        mediaController.setAnchorView(reproductor);

        reproductor.setMediaController(mediaController);

        reproductor.start();

        reproductor.requestFocus();
    }
}
