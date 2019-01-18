package com.example.david.customclass;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class FlipImage extends AppCompatImageView {

    //håål reda på två bilder: den som skall visas som default
    // och den som skall visas om vi håller på bilden
    private Drawable defaultImage;
    private int onDownImage;

    // skriv motsvarighet till ImagViews konstruktörer
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

    // gemensam kod som skall finnas i alla konstruktörer (en vanlig metod)
    private void init() {
        defaultImage = getDrawable();
    }

    // setter för ondownImage
    public void setOnDownImage(int onDownImage) {
        this.onDownImage = onDownImage;
    }


    // om vi vill ändra bild efter att vår FlipImage är skapad behöver vi ändra vår default image
    // ändra inte default image om det är ondownimage som skall visas
    @Override
    public void setImageResource(int resId) {
        super.setImageResource(resId);

        if (resId != onDownImage )
            defaultImage = getResources().getDrawable(resId);

    }


    //ta emot touch i vår view
    // trycker vi ner skall ondownimage visas
    // när vi släpper upp skall defaultimage visas
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
