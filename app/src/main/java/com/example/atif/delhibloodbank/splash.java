package com.example.atif.delhibloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.romainpiel.shimmer.Shimmer;
import com.romainpiel.shimmer.ShimmerTextView;

public class splash extends AppCompatActivity  {

    private static int SPLASH_TIME_OUT = 2000;
    ShimmerTextView tv;
    Shimmer shimmer;




    Boolean choice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tv = (ShimmerTextView) findViewById(R.id.shimmer_tv);
        toggleAnimation(null);


        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity




                    Intent i = new Intent(splash.this, OnBoardingActivit.class);
                    startActivity(i);





            }
        }, SPLASH_TIME_OUT);

    }

   public void toggleAnimation(View target) {
        if (shimmer != null && shimmer.isAnimating()) {
            shimmer.cancel();
        } else {
            shimmer = new Shimmer();
            shimmer.start(tv);
        }
    }

}
