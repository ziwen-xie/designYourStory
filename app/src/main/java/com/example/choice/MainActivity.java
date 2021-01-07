package com.example.choice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button name = (Button) findViewById(R.id.name); // initilization: get the start button

        name.setOnClickListener(new View.OnClickListener() { // what happens when click
            @Override
            public void onClick(View v) {
                Intent next = new Intent(MainActivity.this,randname.class); //set intent for going to playerinfo class
                startActivity(next); // click to continue to the next activity
                //player.pause();
            }
        });
    }
}