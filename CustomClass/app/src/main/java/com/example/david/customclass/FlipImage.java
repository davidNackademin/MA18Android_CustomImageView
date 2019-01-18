package com.example.david.customclass;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class FlipImage extends AppCompatImageView {

    private Drawable defaultImage;
    private int onDownImage;

    public FlipImage(Context context) {
        super(context);
        init();
    }

    public FlipImage(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FlipImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        defaultImage = getDrawable();
    }

    public void setOnDownImage(int onDownImage) {
        this.onDownImage = onDownImage;
    }


    @Override
    public void setImageResource(int resId) {
        super.setImageResource(resId);

        if (resId != onDownImage )
            defaultImage = getResources().getDrawable(resId);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

       // Log.d("FlipImage", "TOUCH");

        int action = event.getActionMasked();

        switch (action) {
            case (MotionEvent.ACTION_DOWN) :
               // Log.d("FlipImage", "DOWN");

                setImageResource(onDownImage);
                return true;
            case (MotionEvent.ACTION_UP) :
               // Log.d("FlipImage", "UP");

                setImageDrawable(defaultImage);
                return true;
        }

        return super.onTouchEvent(event);
    }
}
