package com.example.the_little_game;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Set;

public class food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        Button btn = findViewById(R.id.button11);
        Button btn2 = findViewById(R.id.button5);
        Button btn3 = findViewById(R.id.button6);
        Button btn4 = findViewById(R.id.button7);
        Button btn5 = findViewById(R.id.button9);
        Button btn6 = findViewById(R.id.button10);
        Button btn7 = findViewById(R.id.button12);
        Button btn8 = findViewById(R.id.button13);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","1");
                startActivity(it);

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","2");
                startActivity(it);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","3");
                startActivity(it);

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","4");
                startActivity(it);

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","5");
                startActivity(it);

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","6");
                startActivity(it);

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","7");
                startActivity(it);

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent it = new Intent(food.this,face_gif.class);
                it.putExtra("x","8");
                startActivity(it);

            }
        });

    }
}