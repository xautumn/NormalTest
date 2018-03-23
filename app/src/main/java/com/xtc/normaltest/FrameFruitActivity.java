package com.xtc.normaltest;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

public class FrameFruitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_fruit);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        ImageView iv_frame = findViewById(R.id.iv_frame);

        iv_frame.setImageResource(R.drawable.frame_fruits);
        AnimationDrawable animationDrawable = (AnimationDrawable) iv_frame.getDrawable();
        animationDrawable.start();
    }
}
