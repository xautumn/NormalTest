package com.xtc.normaltest.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.xtc.normaltest.R;

/**
 * Created by wuqi on 2018/3/22.
 */

public class MaskView extends View {

    private Bitmap mBitmapSRC;
    private Bitmap mBitmapDST;
    private Paint mPaint;

    public MaskView(Context context) {
        this(context,null);
    }

    public MaskView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MaskView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setLayerType(LAYER_TYPE_SOFTWARE,null);
        mBitmapSRC = BitmapFactory.decodeResource(getResources(),R.drawable.mask_ba);
        //mBitmapDST = Bitmap.createBitmap(30,30,Bitmap.Config.ARGB_8888);
        mBitmapDST = BitmapFactory.decodeResource(getResources(),R.drawable.hhh);
        mPaint = new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = new Rect(0,0,30,30);
        RectF rectF = new RectF(0,0,30,30);

        Canvas c = new Canvas(mBitmapDST);
        c.drawRect(0,0,0,0,mPaint);
        //c.drawBitmap();

        canvas.drawBitmap(mBitmapSRC,0,0,mPaint);

        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        //canvas.drawRect(0,0,0,0,mPaint);
        canvas.drawBitmap(mBitmapDST,0,0,mPaint);


        mPaint.setXfermode(null);
    }

    /*  @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
                 int height = getHeight();

                 float strokeWidth = 8;
                 float pointRadius = 8;
                 float gap = 8;
                 float monthRadius = height * 0.2f;
                 float textSize = 28;

                 int color = getResources().getColor(R.color.carnation);
                 int lightColor = getResources().getColor(R.color.carnation_light);
                 int lighterColor = getResources().getColor(R.color.carnation_lighter);

                 float degree = 360*1;

                 Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

                 //new layer
                 int save = canvas.saveLayer(0, 0, width, height, null, Canvas.ALL_SAVE_FLAG);

                 //draw percent
                 canvas.save();
                 float fillDistance = pointRadius+gap+strokeWidth/2;
                 canvas.translate(fillDistance,fillDistance);
                 RectF fillRect = new RectF(0,0,width-2*fillDistance,height-2*fillDistance);
                 paint.setColor(lightColor);
                 paint.setStyle(Paint.Style.FILL);
                 canvas.drawOval(fillRect,paint);
                 //mix rect
                 paint.setColor(color);
                 paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                 canvas.drawRect(0, (1 - mPercent) * (height-2*fillDistance), width-2*fillDistance, height-2*fillDistance, paint);
                 canvas.restore();

                 //border
                 paint.setXfermode(null);
                 paint.setStrokeWidth(strokeWidth);
                 paint.setStyle(Paint.Style.STROKE);
                 paint.setColor(lighterColor);
                 RectF borderRect = new RectF(pointRadius,pointRadius,width-pointRadius,height-pointRadius);
                 canvas.drawOval(borderRect, paint);
                 paint.setColor(color);
                 canvas.drawArc(borderRect,270,degree,false,paint);
                 //draw point
                 canvas.save();
                 paint.setStyle(Paint.Style.FILL);
                 canvas.translate(width/2,height/2);
                 canvas.rotate(degree);
                 canvas.drawCircle(0,pointRadius-height/2,pointRadius,paint);
                 canvas.restore();

                 //draw month
                 canvas.save();
                 canvas.translate(width*0.7f,height*0.8f);
                 paint.setColor(Color.BLACK);
                 paint.setStyle(Paint.Style.STROKE);
                 paint.setStrokeWidth(gap);
                 paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                 canvas.drawCircle(0,0,monthRadius+gap/2,paint);
                 paint.setXfermode(null);
                 paint.setStyle(Paint.Style.FILL);
            paint.setColor(getResources().getColor(R.color.orange));
        canvas.drawCircle(0,0,monthRadius,paint);
        canvas.restoreToCount(save);
    }*/
}
