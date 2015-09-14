package com.mutualmobile.shadertest.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;

import com.mutualmobile.shadertest.R;

/**
 * Created by ronald.lovejoy on 9/14/15.
 */
public class BitmapRepeatView extends CustomView {

    private final Bitmap mLincolnBitmap =
            BitmapFactory.decodeResource(getResources(), R.drawable.lincoln);
    private final Paint mLincolnPaint = new Paint();

    public BitmapRepeatView(Context context) {
        super(context);
        init();
    }

    public BitmapRepeatView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BitmapRepeatView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mLincolnPaint.setStyle(Paint.Style.FILL_AND_STROKE);

        BitmapShader lincolnShader =
                new BitmapShader(mLincolnBitmap, Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
        mLincolnPaint.setShader(lincolnShader);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(0, 0, getWidth(), getHeight(), mLincolnPaint);
    }
}
