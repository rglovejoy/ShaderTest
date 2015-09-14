package com.mutualmobile.shadertest.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class ModifiedRainbowLinearGradientView extends CustomView {

    private final Paint mGradientPaint = new Paint();

    private final int[] mRainbowColors = {
            0xffff0000,
            0xff00ff00,
            0xff0000ff
    };

    private final float[] mRainbowPositions = {
            0.0f,
            0.2f,
            1.0f
    };

    public ModifiedRainbowLinearGradientView(Context context) {
        super(context);
        init();
    }

    public ModifiedRainbowLinearGradientView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ModifiedRainbowLinearGradientView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mGradientPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override
    public void onDraw(Canvas canvas) {

        int width = getWidth() - 1;
        int height = getHeight() - 1;

        LinearGradient gradient = new LinearGradient(0, height / 2,
                width, height / 2,
                mRainbowColors,
                mRainbowPositions,
                Shader.TileMode.MIRROR);
        mGradientPaint.setShader(gradient);

        canvas.drawRect(0, 0, width, height, mGradientPaint);

        super.onDraw(canvas);
    }
}