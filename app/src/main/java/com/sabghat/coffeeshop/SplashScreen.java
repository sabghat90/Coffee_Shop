package com.sabghat.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private static final int SPLASH_SCREEN = 2000;

    Animation topAnimation, bottomAnimation;
    ImageView image;
    TextView appName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        // Hooks
        image = findViewById(R.id.action_image);
        appName = findViewById(R.id.txtAppName);

        image.setAnimation(topAnimation);
        appName.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent lunchDashboard = new Intent(SplashScreen.this, Dashboard.class);
                startActivity(lunchDashboard);
                finish();
            }
        },SPLASH_SCREEN);
    }
}