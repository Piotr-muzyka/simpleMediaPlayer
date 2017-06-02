package com.example.pmuzyka.mediaplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public MediaPlayer mediaPlayer;
    private Button play;
    private Button pause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.button);
        pause = (Button) findViewById(R.id.button2);
        mediaPlayer = MediaPlayer.create(this, R.raw.sleep);

        play.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing sound",Toast.LENGTH_SHORT).show();
                        mediaPlayer.start();
                play.setEnabled(false);
                pause.setEnabled(true);
        }});

        pause.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Pausing sound",Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
                play.setEnabled(true);
                pause.setEnabled(false);

            }

        });
        }
}
