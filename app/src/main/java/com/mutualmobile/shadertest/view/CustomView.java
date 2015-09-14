package com.mutualmobile.shadertest.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 *
 * Created by Ronald Lovejoy (ronald.lovejoy@mutualmobile.com) on 9/13/15.
 *
 */
public class CustomView extends View {
    protected final Paint mBlackPen = new Paint();

    public CustomView(Context context) {
        super(context);
        init(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mBlackPen.setStyle(Paint.Style.STROKE);
        mBlackPen.setColor(context.getResources().getColor(android.R.color.black));
        mBlackPen.setAntiAlias(true);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(0, 0, getWidth() - 1, getHeight() - 1, mBlackPen);
    }
}
