package com.example.atif.delhibloodbank;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import java.util.HashMap;


public class launch extends AppCompatActivity {
    Button skip;
    private static int SPLASH_TIME_OUT = 18000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_launch);
        skip=(Button)findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(launch.this,MainActivity.class);
                startActivity(i);
            }
        });
        startImageSlider();

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(launch.this, MainActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);


    }
    public void startImageSlider()
    {

        SliderLayout sliderLayout=(SliderLayout) findViewById(R.id.slider2);

        HashMap<String,Integer> images_map=new HashMap<>();
        images_map.put("1",R.drawable.blood1);
        images_map.put("2",R.drawable.blood2);
        images_map.put("3",R.drawable.blood1);
        images_map.put("4",R.drawable.blood3);

           for (String i : images_map.keySet()) {

                TextSliderView sliderView = new TextSliderView(this);
                sliderView.image(images_map.get(i))
                        .setScaleType(BaseSliderView.ScaleType.Fit);
                sliderLayout.addSlider(sliderView);




            }




        //sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);

        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Tablet);
        //sliderLayout.setCustomAnimation(new );
        sliderLayout.setDuration(6000);

    }


}
