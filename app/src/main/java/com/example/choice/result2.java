package com.example.choice;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result2 extends AppCompatActivity {
    public String resultname;
    public int randnum0;
    public int randnum;
    public int randnum2;
    public int randnum3;
    public int randage;
    public int rande;
    public int randk1;
    public int randk2;

    public Random rand = new Random();
    public boolean a = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);

        TextView rer = (TextView) findViewById(R.id.finalr);
        TextView age = (TextView) findViewById(R.id.age); //get age textview
        TextView job = (TextView) findViewById(R.id.job); //get age textview
        TextView descri = (TextView) findViewById(R.id.descri); //get age textview
        TextView favor = (TextView) findViewById(R.id.favor); //get age textview
        TextView appear = (TextView) findViewById(R.id.appear); //get age textview
        TextView keyword1 = (TextView) findViewById(R.id.keyword1); //get age textview
        TextView keyword2 = (TextView) findViewById(R.id.keyword2); //get age textview

        if (getIntent().hasExtra("key")){
            String mark = getIntent().getExtras().getString("key");
            boolean singlename = getIntent().getBooleanExtra("sin",false);
            boolean doublename = getIntent().getBooleanExtra("dou",false);


            if(mark.equals ("乡村故事土就完事儿了风")) {
                //土味模拟器
                setting_tu tu = new setting_tu();
                if(singlename == false){

                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                        randnum = rand.nextInt(tu.content1_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);




                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(60)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);


                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        randnum = rand.nextInt(tu.content1_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(60)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);


                            }
                        });

                    }
                }else{
                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                        randnum2 = rand.nextInt(tu.content2_size-1);

                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(60)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);


                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(60)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);


                            }
                        });

                    }

                }


                randage = rand.nextInt(60)+14;
                String s=String.valueOf(randage);
                age.setText(s);  //setting the age

                rande = rand.nextInt(tu.job_size);
                String jobe = tu.job[rande];
                job.setText(jobe);
                randk2 = rand.nextInt(tu.keyword1_size);
                String keyword1s = tu.keyword1[randk2];
                keyword1.setText(keyword1s);
                randk1 = rand.nextInt(tu.keyword2_size);
                String keyword2s = tu.keyword2[randk1];
                keyword2.setText(keyword2s);
                randk1 = rand.nextInt(tu.appear_size);
                randk2 = rand.nextInt(tu.appear2_size);
                String ap = tu.appear[randk1];
                String ap2 = tu.appear2[randk2];
                appear.setText(ap+ap2);
                randk1 = rand.nextInt(tu.favor_size);
                String fav = tu.favor[randk1];
                favor.setText(fav);
                randk1 = rand.nextInt(tu.desc_size);
                randk2 = rand.nextInt(tu.desc2_size);
                ap = tu.desc[randk1];
                ap2 = tu.desc2[randk2];
                descri.setText("在" +ap+ap2);

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result2.this, randname.class);
                        startActivity(nexta);

                    }
                });



            }//土味模拟器结束

            if(mark.equals ("古风原耽男主风")) {
                //土味模拟器
                setting_yuandan yuan = new setting_yuandan();
                if(singlename == false){

                    if(doublename == true) {
                        randnum0 = rand.nextInt(yuan.surname2_size-1);
                        resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);
                        randnum = rand.nextInt(yuan.content1_size-1);
                        randnum2 = rand.nextInt(yuan.content2_size-1);
                        resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(yuan.content2_size-1);
                                randnum0 = rand.nextInt(yuan.surname2_size-1);
                                resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);
                                randnum = rand.nextInt(yuan.content1_size-1);
                                resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(yuan.job_size);
                                String jobe = yuan.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(yuan.keyword1_size);
                                String keyword1s = yuan.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(yuan.keyword2_size);
                                String keyword2s = yuan.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(yuan.appear_size);
                                randk2 = rand.nextInt(yuan.appear2_size);
                                String ap = yuan.appear[randk1];
                                String ap2 = yuan.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(yuan.favor_size);
                                String fav = yuan.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(yuan.desc_size);
                                randk2 = rand.nextInt(yuan.desc2_size);
                                ap = yuan.desc[randk1];
                                ap2 = yuan.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(yuan.surname_size-1);
                        randnum2 = rand.nextInt(yuan.content2_size-1);
                        resultname = yuan.surname.substring(randnum0, randnum0 + 1);
                        randnum = rand.nextInt(yuan.content1_size-1);
                        resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(yuan.content2_size-1);
                                randnum0 = rand.nextInt(yuan.surname_size-1);
                                resultname = yuan.surname.substring(randnum0, randnum0 + 1);
                                randnum = rand.nextInt(yuan.content1_size-1);
                                resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(yuan.job_size);
                                String jobe = yuan.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(yuan.keyword1_size);
                                String keyword1s = yuan.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(yuan.keyword2_size);
                                String keyword2s = yuan.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(yuan.appear_size);
                                randk2 = rand.nextInt(yuan.appear2_size);
                                String ap = yuan.appear[randk1];
                                String ap2 = yuan.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(yuan.favor_size);
                                String fav = yuan.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(yuan.desc_size);
                                randk2 = rand.nextInt(yuan.desc2_size);
                                ap = yuan.desc[randk1];
                                ap2 = yuan.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });

                    }
                }else{
                    if(doublename == true) {
                        randnum0 = rand.nextInt(yuan.surname2_size-1);
                        resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);

                        randnum2 = rand.nextInt(yuan.content2_size-1);

                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(yuan.content2_size-1);
                                randnum0 = rand.nextInt(yuan.surname2_size-1);
                                resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);

                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(yuan.job_size);
                                String jobe = yuan.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(yuan.keyword1_size);
                                String keyword1s = yuan.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(yuan.keyword2_size);
                                String keyword2s = yuan.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(yuan.appear_size);
                                randk2 = rand.nextInt(yuan.appear2_size);
                                String ap = yuan.appear[randk1];
                                String ap2 = yuan.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(yuan.favor_size);
                                String fav = yuan.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(yuan.desc_size);
                                randk2 = rand.nextInt(yuan.desc2_size);
                                ap = yuan.desc[randk1];
                                ap2 = yuan.desc2[randk2];
                                descri.setText("在" +ap+ap2);
                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(yuan.surname_size-1);
                        randnum2 = rand.nextInt(yuan.content2_size-1);
                        resultname = yuan.surname.substring(randnum0, randnum0 + 1);
                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(yuan.content2_size-1);
                                randnum0 = rand.nextInt(yuan.surname_size-1);
                                resultname = yuan.surname.substring(randnum0, randnum0 + 1);

                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(yuan.job_size);
                                String jobe = yuan.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(yuan.keyword1_size);
                                String keyword1s = yuan.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(yuan.keyword2_size);
                                String keyword2s = yuan.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(yuan.appear_size);
                                randk2 = rand.nextInt(yuan.appear2_size);
                                String ap = yuan.appear[randk1];
                                String ap2 = yuan.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(yuan.favor_size);
                                String fav = yuan.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(yuan.desc_size);
                                randk2 = rand.nextInt(yuan.desc2_size);
                                ap = yuan.desc[randk1];
                                ap2 = yuan.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });

                    }

                }
                randage = rand.nextInt(40)+14;
                String s=String.valueOf(randage);
                age.setText(s);
                rande = rand.nextInt(yuan.job_size);
                String jobe = yuan.job[rande];
                job.setText(jobe);
                randk2 = rand.nextInt(yuan.keyword1_size);
                String keyword1s = yuan.keyword1[randk2];
                keyword1.setText(keyword1s);
                randk1 = rand.nextInt(yuan.keyword2_size);
                String keyword2s = yuan.keyword2[randk1];
                keyword2.setText(keyword2s);
                randk1 = rand.nextInt(yuan.appear_size);
                randk2 = rand.nextInt(yuan.appear2_size);
                String ap = yuan.appear[randk1];
                String ap2 = yuan.appear2[randk2];
                appear.setText(ap+ap2);
                randk1 = rand.nextInt(yuan.favor_size);
                String fav = yuan.favor[randk1];
                favor.setText(fav);
                randk1 = rand.nextInt(yuan.desc_size);
                randk2 = rand.nextInt(yuan.desc2_size);
                ap = yuan.desc[randk1];
                ap2 = yuan.desc2[randk2];
                descri.setText("在" +ap+ap2);

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result2.this,randname.class);
                        startActivity(nexta);

                    }
                });



            }//原耽模拟器结束

            if(mark.equals ("玛丽苏现世风")) {
                //土味模拟器


                setting_marrysue tu = new setting_marrysue();
                if(singlename == false){

                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                        randnum = rand.nextInt(tu.content1_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(50)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        randnum = rand.nextInt(tu.content1_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(50)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });

                    }
                }else{
                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                        randnum2 = rand.nextInt(tu.content2_size-1);

                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(50)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(50)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });

                    }

                }
                randage = rand.nextInt(50)+14;
                String s=String.valueOf(randage);
                age.setText(s);
                rande = rand.nextInt(tu.job_size);
                String jobe = tu.job[rande];
                job.setText(jobe);
                randk2 = rand.nextInt(tu.keyword1_size);
                String keyword1s = tu.keyword1[randk2];
                keyword1.setText(keyword1s);
                randk1 = rand.nextInt(tu.keyword2_size);
                String keyword2s = tu.keyword2[randk1];
                keyword2.setText(keyword2s);
                randk1 = rand.nextInt(tu.appear_size);
                randk2 = rand.nextInt(tu.appear2_size);
                String ap = tu.appear[randk1];
                String ap2 = tu.appear2[randk2];
                appear.setText(ap+ap2);
                randk1 = rand.nextInt(tu.favor_size);
                String fav = tu.favor[randk1];
                favor.setText(fav);
                randk1 = rand.nextInt(tu.desc_size);
                randk2 = rand.nextInt(tu.desc2_size);
                ap = tu.desc[randk1];
                ap2 = tu.desc2[randk2];
                descri.setText("在" +ap+ap2);

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result2.this, randname.class);
                        startActivity(nexta);

                    }
                });



            }//玛丽苏模拟器结束

            if(mark.equals ("泯然众人配角风")) {
                //土味模拟器
                setting_peijue tu = new setting_peijue();
                if(singlename == false){

                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                        randnum = rand.nextInt(tu.content1_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(80)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        randnum = rand.nextInt(tu.content1_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(80)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });

                    }
                }else{
                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                        randnum2 = rand.nextInt(tu.content2_size-1);

                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(80)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(80)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);
                                randk2 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk2];
                                keyword1.setText(keyword1s);
                                randk1 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk1];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);

                            }
                        });

                    }

                }

                randage = rand.nextInt(80)+14;
                String s=String.valueOf(randage);
                age.setText(s);
                rande = rand.nextInt(tu.job_size);
                String jobe = tu.job[rande];
                job.setText(jobe);
                randk2 = rand.nextInt(tu.keyword1_size);
                String keyword1s = tu.keyword1[randk2];
                keyword1.setText(keyword1s);
                randk1 = rand.nextInt(tu.keyword2_size);
                String keyword2s = tu.keyword2[randk1];
                keyword2.setText(keyword2s);
                randk1 = rand.nextInt(tu.appear_size);
                randk2 = rand.nextInt(tu.appear2_size);
                String ap = tu.appear[randk1];
                String ap2 = tu.appear2[randk2];
                appear.setText(ap+ap2);
                randk1 = rand.nextInt(tu.favor_size);
                String fav = tu.favor[randk1];
                favor.setText(fav);
                randk1 = rand.nextInt(tu.desc_size);
                randk2 = rand.nextInt(tu.desc2_size);
                ap = tu.desc[randk1];
                ap2 = tu.desc2[randk2];
                descri.setText("在" +ap+ap2);

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result2.this,randname.class);
                        startActivity(nexta);

                    }
                });



            }//配角模拟器结束


            if(mark.equals ("不知所云奇奇怪怪风")) {
                //土味模拟器
                setting_weird tu = new setting_weird();
                if(singlename == false){

                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                        randnum = rand.nextInt(tu.content1_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);

                                randk1 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk1];
                                keyword1.setText(keyword1s);
                                randk2 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk2];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);



                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        randnum = rand.nextInt(tu.content1_size-1);
                        resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);
                                randnum = rand.nextInt(tu.content1_size-1);
                                resultname = resultname + tu.content1.substring(randnum, randnum + 1);
                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);

                                randk1 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk1];
                                keyword1.setText(keyword1s);
                                randk2= rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk2];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);



                            }
                        });

                    }
                }else{
                    if(doublename == true) {
                        randnum0 = rand.nextInt(tu.surname2_size-1);
                        resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                        randnum2 = rand.nextInt(tu.content2_size-1);

                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname2_size-1);
                                resultname = tu.surname2.substring(randnum0*2, randnum0*2+2);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);

                                randk1 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk1];
                                keyword1.setText(keyword1s);
                                randk2 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk2];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);


                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(tu.surname_size-1);
                        randnum2 = rand.nextInt(tu.content2_size-1);
                        resultname = tu.surname.substring(randnum0, randnum0 + 1);
                        resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(tu.content2_size-1);
                                randnum0 = rand.nextInt(tu.surname_size-1);
                                resultname = tu.surname.substring(randnum0, randnum0 + 1);

                                resultname = resultname + tu.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);
                                randage = rand.nextInt(40)+14;
                                String s=String.valueOf(randage);
                                age.setText(s);
                                rande = rand.nextInt(tu.job_size);
                                String jobe = tu.job[rande];
                                job.setText(jobe);

                                randk1 = rand.nextInt(tu.keyword1_size);
                                String keyword1s = tu.keyword1[randk1];
                                keyword1.setText(keyword1s);
                                randk2 = rand.nextInt(tu.keyword2_size);
                                String keyword2s = tu.keyword2[randk2];
                                keyword2.setText(keyword2s);
                                randk1 = rand.nextInt(tu.appear_size);
                                randk2 = rand.nextInt(tu.appear2_size);
                                String ap = tu.appear[randk1];
                                String ap2 = tu.appear2[randk2];
                                appear.setText(ap+ap2);
                                randk1 = rand.nextInt(tu.favor_size);
                                String fav = tu.favor[randk1];
                                favor.setText(fav);
                                randk1 = rand.nextInt(tu.desc_size);
                                randk2 = rand.nextInt(tu.desc2_size);
                                ap = tu.desc[randk1];
                                ap2 = tu.desc2[randk2];
                                descri.setText("在" +ap+ap2);



                            }
                        });

                    }

                }
                randage = rand.nextInt(40)+14;
                String s=String.valueOf(randage);
                age.setText(s);
                rande = rand.nextInt(tu.job_size);
                String jobe = tu.job[rande];
                job.setText(jobe);

                randk2 = rand.nextInt(tu.keyword1_size);
                String keyword1s = tu.keyword1[randk2];
                keyword1.setText(keyword1s);
                randk1 = rand.nextInt(tu.keyword2_size);
                String keyword2s = tu.keyword2[randk1];
                keyword2.setText(keyword2s);
                randk1 = rand.nextInt(tu.appear_size);
                randk2 = rand.nextInt(tu.appear2_size);
                String ap = tu.appear[randk1];
                String ap2 = tu.appear2[randk2];
                appear.setText(ap+ap2);
                randk1 = rand.nextInt(tu.favor_size);
                String fav = tu.favor[randk1];
                favor.setText(fav);
                randk1 = rand.nextInt(tu.desc_size);
                randk2 = rand.nextInt(tu.desc2_size);
                ap = tu.desc[randk1];
                ap2 = tu.desc2[randk2];
                descri.setText("在" +ap+ap2);


                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result2.this,randname.class);
                        startActivity(nexta);

                    }
                });



            }//配角模拟器结束
        } // 检查key结束

        Button exit = (Button) findViewById(R.id.exit); // initilization:
        exit.setOnClickListener(new View.OnClickListener() { // what happens when click
            @Override
            public void onClick(View v) {
                Intent nexta = new Intent(result2.this,randname.class);
                startActivity(nexta);

            }
        });
    }
}