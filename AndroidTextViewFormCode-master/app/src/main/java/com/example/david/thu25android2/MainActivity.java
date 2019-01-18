package com.example.david.thu25android2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hej Välden text view
        TextView myTextView = new TextView(this);
        myTextView.setText("Hej Världen");

        RelativeLayout.LayoutParams myParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        myParams.addRule(RelativeLayout.BELOW, R.id.hello_world);

        myTextView.setLayoutParams(myParams);

        // lägg in textview i layout
        RelativeLayout myLayout = findViewById(R.id.main_layout);
        myLayout.addView(myTextView);

        // HEj då textview
        TextView byTextView = new TextView(this);

        RelativeLayout.LayoutParams byParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);

        byParams.addRule(RelativeLayout.RIGHT_OF, R.id.hello_world);
        byTextView.setLayoutParams(byParams);

        byTextView.setText("Hej då världen");

        myLayout.addView(byTextView);


    }
}
