package com.zyc.nevergiveup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;


public class WelcomeActivity extends AppCompatActivity{

        private final long SPLASH_LENGTH = 2000;
        Handler handler = new Handler();
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_welcome);
            handler.postDelayed(new Runnable() {  //使用handler的postDelayed实现延时跳转

                public void run() {
                    Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, SPLASH_LENGTH);//2秒后跳转至应用主界面MainActivity

        }
    }


