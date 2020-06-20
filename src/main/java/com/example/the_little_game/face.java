package com.example.the_little_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class face extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face);

        Button btn = findViewById(R.id.button25);
        Button btn2 = findViewById(R.id.button26);
        Button btn3 = findViewById(R.id.button27);
        Button btn4 = findViewById(R.id.button28);
        Button btn5 = findViewById(R.id.button29);
        Button btn6 = findViewById(R.id.button24);
        Button btn7 = findViewById(R.id.button22);
        Button btn8 = findViewById(R.id.button23);

        //隱藏狀態列
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //不要自動休眠
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StartPlay(view);

            }
        });


    }


    public void StartPlay(View v){
        switch (v.getId()){
            case R.id.button25:
                mp = MediaPlayer.create(this, R.raw.horse_w_3);
                mp.start();
                break;
            case R.id.button24:
                mp = MediaPlayer.create(this, R.raw.dog2);
                mp.start();
                break;
            case R.id.button22:
                mp = MediaPlayer.create(this, R.raw.ribbit);
                mp.start();
                break;
            case R.id.button23:
                mp = MediaPlayer.create(this, R.raw.chicken_3);
                mp.start();
                break;
            case R.id.button26:
                mp = MediaPlayer.create(this, R.raw.sheep_baa);
                mp.start();
                break;
            case R.id.button27:
                mp = MediaPlayer.create(this, R.raw.cow);
                mp.start();
                break;
            case R.id.button28:
                mp = MediaPlayer.create(this, R.raw.duck);
                mp.start();
                break;
            case R.id.button29:
                mp = MediaPlayer.create(this, R.raw.pig);
                mp.start();
                break;
        }
    }
}



