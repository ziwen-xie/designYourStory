package com.example.choice;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class result extends AppCompatActivity {
    public String resultname;
    public int randnum0;
    public int randnum;
    public int randnum2;
    public Random rand = new Random();
    public boolean a = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView rer = (TextView) findViewById(R.id.finalr);

        if (getIntent().hasExtra("key")){
            String mark = getIntent().getExtras().getString("key");
            boolean singlename = getIntent().getBooleanExtra("sin",false);
            boolean doublename = getIntent().getBooleanExtra("dou",false);


            if(mark.equals ("乡村故事土就完事儿了风")) {
        //土味模拟器
                if(singlename == false) {
                    setting_tu tu1 = new setting_tu();

                    randnum0 = rand.nextInt(15);
                    resultname = tu1.surname.substring(randnum0, randnum0 + 1);
                    randnum = rand.nextInt(15);
                    randnum2 = rand.nextInt(15);
                    resultname = resultname + tu1.content1.substring(randnum, randnum + 1);
                    resultname = resultname + tu1.content2.substring(randnum2, randnum2 + 1);


                    rer.setText(resultname);


                    Button retry = (Button) findViewById(R.id.retry); // initilization:
                    retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                        @Override
                        public void onClick(View v) {
                            randnum2 = rand.nextInt(15);
                            randnum0 = rand.nextInt(15);
                            resultname = tu1.surname.substring(randnum0, randnum0 + 1);
                            randnum = rand.nextInt(15);
                            resultname = resultname + tu1.content1.substring(randnum, randnum + 1);
                            resultname = resultname + tu1.content2.substring(randnum2, randnum2 + 1);

                            rer.setText(resultname);

                        }
                    });
                }else {
                    setting_tu tu1 = new setting_tu();

                    randnum0 = rand.nextInt(15);
                    resultname = tu1.surname.substring(randnum0, randnum0 + 1);
                    randnum2 = rand.nextInt(15);
                    resultname = resultname + tu1.content2.substring(randnum2, randnum2 + 1);


                    rer.setText(resultname);


                    Button retry = (Button) findViewById(R.id.retry); // initilization:
                    retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                        @Override
                        public void onClick(View v) {

                            randnum0 = rand.nextInt(15);
                            resultname = tu1.surname.substring(randnum0, randnum0 + 1);
                            randnum2 = rand.nextInt(15);
                            resultname = resultname + tu1.content2.substring(randnum2, randnum2 + 1);

                            rer.setText(resultname);

                        }
                    });
                }
        Button exit = (Button) findViewById(R.id.exit); // initilization:
        exit.setOnClickListener(new View.OnClickListener() { // what happens when click
            @Override
            public void onClick(View v) {
                Intent nexta = new Intent(result.this, randname.class);
                startActivity(nexta);

            }
        });



            }//土味模拟器结束

            if(mark.equals ("古风原耽男主风")) {
                //土味模拟器
                setting_yuandan yuan = new setting_yuandan();
                if(singlename == false){

                    if(doublename == true) {
                        randnum0 = rand.nextInt(16);
                        resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);
                        randnum = rand.nextInt(16);
                        randnum2 = rand.nextInt(16);
                        resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(16);
                                randnum0 = rand.nextInt(16);
                                resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);
                                randnum = rand.nextInt(16);
                                resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);

                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(16);
                        randnum2 = rand.nextInt(16);
                        resultname = yuan.surname.substring(randnum0, randnum0 + 1);
                        randnum = rand.nextInt(16);
                        resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(16);
                                randnum0 = rand.nextInt(16);
                                resultname = yuan.surname.substring(randnum0, randnum0 + 1);
                                randnum = rand.nextInt(16);
                                resultname = resultname + yuan.content1.substring(randnum, randnum + 1);
                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);

                            }
                        });

                    }
                }else{
                    if(doublename == true) {
                        randnum0 = rand.nextInt(16);
                        resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);

                        randnum2 = rand.nextInt(16);

                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(16);
                                randnum0 = rand.nextInt(16);
                                resultname = yuan.surname2.substring(randnum0*2, randnum0*2+2);

                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);

                            }
                        });
                    }else{
                        randnum0 = rand.nextInt(16);
                        randnum2 = rand.nextInt(16);
                        resultname = yuan.surname.substring(randnum0, randnum0 + 1);
                        resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);


                        rer.setText(resultname);


                        Button retry = (Button) findViewById(R.id.retry); // initilization:
                        retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                            @Override
                            public void onClick(View v) {
                                randnum2 = rand.nextInt(16);
                                randnum0 = rand.nextInt(16);
                                resultname = yuan.surname.substring(randnum0, randnum0 + 1);

                                resultname = resultname + yuan.content2.substring(randnum2, randnum2 + 1);

                                rer.setText(resultname);

                            }
                        });

                    }

                }

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result.this,randname.class);
                        startActivity(nexta);

                    }
                });



            }//原耽模拟器结束

            if(mark.equals ("玛丽苏现世风")) {
                //土味模拟器
                setting_marrysue ms =new setting_marrysue();

                randnum0 = rand.nextInt(16);
                resultname = ms.surname.substring(randnum0,randnum0+1);
                randnum = rand.nextInt(16);
                resultname = resultname + ms.content1.substring(randnum,randnum+1);
                resultname = resultname+ ms.content2.substring(randnum2,randnum2+1);


                rer.setText(resultname);


                Button retry = (Button) findViewById(R.id.retry); // initilization:
                retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        randnum2 = rand.nextInt(15);
                        randnum0 = rand.nextInt(15);
                        resultname = ms.surname.substring(randnum0,randnum0+1);
                        randnum = rand.nextInt(15);
                        resultname = resultname + ms.content1.substring(randnum,randnum+1);
                        resultname = resultname+ ms.content2.substring(randnum2,randnum2+1);

                        rer.setText(resultname);

                    }
                });

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result.this, randname.class);
                        startActivity(nexta);

                    }
                });



            }//玛丽苏模拟器结束

            if(mark.equals ("泯然众人配角风")) {
                //土味模拟器
                setting_peijue pj =new setting_peijue();

                randnum0 = rand.nextInt(16);
                resultname = pj.surname.substring(randnum0,randnum0+1);
                randnum = rand.nextInt(16);
                resultname = resultname + pj.content1.substring(randnum,randnum+1);
                resultname = resultname+ pj.content2.substring(randnum2,randnum2+1);


                rer.setText(resultname);


                Button retry = (Button) findViewById(R.id.retry); // initilization:
                retry.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        randnum2 = rand.nextInt(15);
                        randnum0 = rand.nextInt(15);
                        resultname = pj.surname.substring(randnum0,randnum0+1);
                        randnum = rand.nextInt(15);
                        resultname = resultname + pj.content1.substring(randnum,randnum+1);
                        resultname = resultname+ pj.content2.substring(randnum2,randnum2+1);

                        rer.setText(resultname);

                    }
                });

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result.this,randname.class);
                        startActivity(nexta);

                    }
                });



            }//配角模拟器结束


            if(mark.equals ("不知所云奇奇怪怪风")) {
                //土味模拟器
                setting_weird wd =new setting_weird();

                randnum0 = rand.nextInt(16);
                resultname = wd.surname.substring(randnum0,randnum0+1);
                randnum = rand.nextInt(16);
                resultname = resultname + wd.content1.substring(randnum,randnum+1);
                resultname = resultname+ wd.content2.substring(randnum2,randnum2+1);


                rer.setText(resultname);


                Button retry = (Button) findViewById(R.id.retry); // initilization:
                retry.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        randnum2 = rand.nextInt(15);
                        randnum0 = rand.nextInt(15);
                        resultname = wd.surname.substring(randnum0,randnum0+1);
                        randnum = rand.nextInt(15);
                        resultname = resultname + wd.content1.substring(randnum,randnum+1);
                        resultname = resultname+ wd.content2.substring(randnum2,randnum2+1);

                        rer.setText(resultname);

                    }
                });

                Button exit = (Button) findViewById(R.id.exit); // initilization:
                exit.setOnClickListener(new View.OnClickListener() { // what happens when click
                    @Override
                    public void onClick(View v) {
                        Intent nexta = new Intent(result.this,randname.class);
                        startActivity(nexta);

                    }
                });



            }//配角模拟器结束
        } // 检查key结束

        Button exit = (Button) findViewById(R.id.exit); // initilization:
        exit.setOnClickListener(new View.OnClickListener() { // what happens when click
            @Override
            public void onClick(View v) {
                Intent nexta = new Intent(result.this,randname.class);
                startActivity(nexta);

            }
        });
    }
}