package com.example.choice;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    public String resultname;
    public int randnum;
    public int randnum2;
    public Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);



        randnum = rand.nextInt(2);
        randnum2 = rand.nextInt(2);

        setting_tu tu1 =new setting_tu();


        resultname = tu1.content1.substring(randnum,randnum+1);
        resultname = resultname+ tu1.content2.substring(randnum2,randnum2+1);

        TextView rer = (TextView) findViewById(R.id.finalr);
        rer.setText(resultname);



    }
}