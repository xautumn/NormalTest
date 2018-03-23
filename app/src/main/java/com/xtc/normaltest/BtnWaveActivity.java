package com.xtc.normaltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.xtc.normaltest.view.ButtonView;

public class BtnWaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn_wave);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getSupportActionBar().hide();
        final ButtonView rippleBackground=(ButtonView)findViewById(R.id.content);
        rippleBackground.startRippleAnimation();

    }
}
