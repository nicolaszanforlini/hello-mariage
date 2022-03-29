package com.example.hello_mariage.View.Activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

import com.example.hello_mariage.R;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        ImageView splashImage = findViewById(R.id.splash_image);

        Animation animation = new AlphaAnimation(1, 0); //to change visibility from visible to invisible
        animation.setDuration(1000); //1 second duration for each animation cycle
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE); //repeating indefinitely
        animation.setRepeatMode(Animation.REVERSE);
        splashImage.startAnimation(animation);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                LaunchApp();
            }
        }, 3000);

    }

    public void LaunchApp()
    {
        Thread background = new Thread() {
            public void run() {

                try {
                    // Thread will sleep for 10 seconds
                    sleep(4*1000);

                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();

                } catch (Exception e) {

                }
            }
        };

        // start thread
        background.start();


    }
}
