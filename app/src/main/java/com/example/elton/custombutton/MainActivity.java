package com.example.elton.custombutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button rect, round, oval, circle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rect = (Button) findViewById(R.id.rect);
        round = (Button) findViewById(R.id.rou);
        oval = (Button) findViewById(R.id.oval);
        circle = (Button) findViewById(R.id.cir);

        rect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Rectangle Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Round Button Clicked!",Toast.LENGTH_SHORT).show();
            }
        });

        oval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Oval Button Clicked!", Toast.LENGTH_SHORT).show();

            }
        });

        circle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Circle Button Clicked!",Toast.LENGTH_SHORT).show();
            }
        });



    }
    }




