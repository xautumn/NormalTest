package com.xtc.normaltest;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.xtc.normaltest.view.EraserView;

/**
 * mask效果
 */
public class MaskActivity extends AppCompatActivity {

    private EraserView eraserView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mask);
        //ImageView imageView = findViewById(R.id.iv_mask);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        getSupportActionBar().hide();
        eraserView = findViewById(R.id.ev);

        ValueAnimator valueAnimator = ValueAnimator.ofInt(0, 230);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int animatedValue = (int) valueAnimator.getAnimatedValue();
                Log.i("wq","animatedValue = "+animatedValue);
                eraserView.setCir(animatedValue);
            }
        });
        valueAnimator.setDuration(1000);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(ObjectAnimator.RESTART);
        valueAnimator.start();

    /*    objectAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1, 0);
        objectAnimator.setDuration(1000);
        objectAnimator.setRepeatCount(-1);
        objectAnimator.setRepeatMode(ObjectAnimator.RESTART);
        objectAnimator.start();*/
    }
}
