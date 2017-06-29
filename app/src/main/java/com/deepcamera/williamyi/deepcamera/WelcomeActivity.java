package com.deepcamera.williamyi.deepcamera;

/**
 * Created by williamyi on 2017/6/14.
 * Email: williamyi96@gmail.com
 */

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        handler=new Handler(){
            @Override
            public void handleMessage(Message msg) {
                Intent intent=new Intent(WelcomeActivity.this,MainActivity.class);
                startActivity(intent);
                WelcomeActivity.this.finish();
            }
        };

        if(!isShowWelcome(this)) {
            Intent intent=new Intent(this,MainActivity.class);
            startActivity(intent);
            this.finish();
        }
        else{
            new Thread(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                        handler.sendEmptyMessage(0);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }

    }


    public static final String APP_NAME="myapplication";
    public static final String KEY_SHOW_WELCOME="show_welcome";
    public static boolean isShowWelcome(Context context){
        //1.GET SP
        SharedPreferences sp=context.getSharedPreferences(APP_NAME,MODE_PRIVATE);
        //2.GET DATA BY AND SET THE DEFAULT VALUE
        return sp.getBoolean(KEY_SHOW_WELCOME,true);
    }

}
