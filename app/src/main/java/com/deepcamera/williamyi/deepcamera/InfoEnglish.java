package com.deepcamera.williamyi.deepcamera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by williamyi on 2017/6/18.
 * Email: williamyi96@gmail.com
 */


public class InfoEnglish extends AppCompatActivity {

    private Button backCamera_en;
    private Button toChinese_en;

    private Button mgithub;
    private Button mproject;
    private Button mweibo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_en);

        backCamera_en = (Button) findViewById(R.id.back_camera);
        toChinese_en = (Button) findViewById(R.id.change_to_Chinese);

        mgithub = (Button) findViewById(R.id.github_location);
        mproject = (Button) findViewById(R.id.project_location);
        mweibo = (Button) findViewById(R.id.weibo_location);

        backCamera_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(InfoEnglish.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        toChinese_en.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setClass(InfoEnglish.this, InfoChinese.class);
                startActivity(intent2);
            }
        });

        mgithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.setClass(InfoEnglish.this, ToWebView.class);
                intent1.putExtra("mwebsite", "https://github.com/WilliamYi96");
                startActivity(intent1);
            }
        });

        mproject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setClass(InfoEnglish.this, ToWebView.class);
                intent2.putExtra("mwebsite", "https://github.com/WilliamYi96/DeepCamera");
                startActivity(intent2);
            }
        });

        mweibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent();
                intent3.setClass(InfoEnglish.this, ToWebView.class);
                intent3.putExtra("mwebsite", "http://www.weibo.com/u/5794337545?from=page_100505_profile&wvr=6&mod=like&is_all=1");
                startActivity(intent3);
            }
        });
    }
}
