package com.example.david.viewfromcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // skapa en textview
        TextView myTextView = new TextView(this);

        // lägg till text
        myTextView.setText("Hej världen");

        // skapa object för parametrar och ange storlek
        RelativeLayout.LayoutParams myParams =
                new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT);

        // lägg till regler för placering
        myParams.addRule(RelativeLayout.BELOW, R.id.hello_world);


        // lägg till parameterobject till textview
        myTextView.setLayoutParams(myParams);


        // leta reda på aktiv layout som skapats i xml
        RelativeLayout myLayout = findViewById(R.id.layout);

        // lägg till textview till layouten
        myLayout.addView(myTextView);




    }
}
