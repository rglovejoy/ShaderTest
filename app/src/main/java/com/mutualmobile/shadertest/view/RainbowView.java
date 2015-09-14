package com.mutualmobile.shadertest.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ronald.lovejoy on 9/13/15.
 */
public class RainbowView extends CustomView {

    private final int[] colors = {
            0xff7f00ff, // violet
            0xff4b0082, // indigo
            0xff0000ff, // blue
            0xff00ff00, // green
            0xffffff00, // yellow
            0xffff8000, // orange
            0xffff0000  // red
    };

    private final float[] positions = {
            0.5f,
            0.583f,
            0.666f,
            0.75f,
            0.832f,
            0.915f,
            1.0f
    };

    private final Paint mGradientPaint = new Paint();
    private final Path mPath = new Path();
    private final RectF mRect = new RectF();

    public RainbowView(Context context) {
        super(context);
    }

    public RainbowView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RainbowView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        int dimension = 0;
        if (width > height) {
            dimension = height;
        } else {
            dimension = width;
        }
        dimension -= 40;
        int innerDimension = dimension / 2;

        RadialGradient gradient =
                new RadialGradient(width / 2, height / 2, dimension / 2, colors, positions,
                        Shader.TileMode.CLAMP);

        mGradientPaint.setShader(gradient);
        mGradientPaint.setStyle(Paint.Style.FILL);

        mPath.reset();
        mRect.set((width - dimension) / 2, (height - dimension) / 2,
                  (width + dimension) / 2, (height + dimension) / 2);
        mPath.addArc(mRect, 0, -180);
        mPath.lineTo(width / 2 - innerDimension, height / 2);
        mRect.set((width - innerDimension) / 2, (height - innerDimension) / 2,
                  (width + innerDimension) / 2, (height + innerDimension) / 2);
        mPath.arcTo(mRect, -180, 180);
        mPath.close();

        canvas.drawPath(mPath, mGradientPaint);
        canvas.drawPath(mPath, mBlackPen);
    }
}
