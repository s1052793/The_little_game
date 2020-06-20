package com.example.the_little_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class face_gif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_gif);
        ImageView img = findViewById(R.id.imageView6);
        TextView tv = findViewById(R.id.textView);
        Intent it = getIntent();
        String s = it.getStringExtra("x");
        System.out.println(s);
        if (s.equals("1")){
            img.setBackgroundResource(R.drawable.face4);
            tv.setText("我現在很開心");

        }
        if (s.equals("2")){
            img.setBackgroundResource(R.drawable.face7);
            tv.setText("我現在生病了");
        }
        if (s.equals("3")){
            img.setBackgroundResource(R.drawable.face8);
            tv.setText("我受傷了");
        }
        if (s.equals("4")){
            img.setBackgroundResource(R.drawable.face3);
            tv.setText("我現在很害羞");
        }
        if (s.equals("5")){
            img.setBackgroundResource(R.drawable.face6);
            tv.setText("我現在很害怕");
        }
        if (s.equals("6")){
            img.setBackgroundResource(R.drawable.face5);
            tv.setText("我現在很想睡覺");
        }
        if (s.equals("7")){
            img.setBackgroundResource(R.drawable.face2);
            tv.setText("我現在很生氣");
        }
        if (s.equals("8")){
            img.setBackgroundResource(R.drawable.face1);
            tv.setText("我現在很難過");
        }



    }
}