package com.example.david.customclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Person person = new Person("David", 41);

        FlipImage catFlip = findViewById(R.id.catFlip);
        catFlip.setOnDownImage(R.drawable.dog);


        FlipImage dogFlip = findViewById(R.id.dogFlip);
        dogFlip.setOnDownImage(R.drawable.cat);


        catFlip.setImageResource(R.drawable.turtle);


    }
}
