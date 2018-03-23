package com.xtc.normaltest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_loading:
                startActivity(new Intent(this,LoadingActivity.class));
                break;
            case R.id.btn_voice:
                startActivity(new Intent(this,BtnWaveActivity.class));
                break;
            case R.id.btn_frame_animation:
                startActivity(new Intent(this,FrameActivity.class));
                break;
            case R.id.btn_frame_fruit_animation:
                startActivity(new Intent(this,FrameFruitActivity.class));
                break;
            case R.id.btn_object_trans:
                startActivity(new Intent(this,ObTransActivity.class));
                break;
            case R.id.btn_object_scale:
                startActivity(new Intent(this,ObScaleActivity.class));
                break;
            case R.id.btn_object_rota:
                startActivity(new Intent(this,ObRotaActivity.class));
                break;
            case R.id.btn_object_alpha:
                startActivity(new Intent(this,ObAlphaActivity.class));
                break;
            case R.id.btn_no_com:
                startActivity(new Intent(this,BtnWaveActivity.class));
                break;
            case R.id.btn_mask_com:
                startActivity(new Intent(this,MaskActivity.class));
                break;
            default:
                break;
        }
    }
}
