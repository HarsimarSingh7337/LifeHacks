package com.learning.lifehacks.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.blogspot.atifsoftwares.animatoolib.Animatoo;
import com.learning.lifehacks.R;

public class SplashScreen extends AppCompatActivity {

    private LottieAnimationView lottieAnimationView;
    private boolean bulbState = false;
    private LinearLayout bulbContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        lottieAnimationView = findViewById(R.id.lottie_anim_view);
        bulbContainer = findViewById(R.id.bulb_container);

        bulbContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!bulbState){
                    bulbContainer.setBackground(getResources().getDrawable(R.drawable.custom_bg_main_logo_1));
                    lottieAnimationView.setAnimation(R.raw.bulb_black);
                    lottieAnimationView.loop(true);
                    lottieAnimationView.playAnimation();
                    bulbState = true;
                }
                else{
                    bulbContainer.setBackground(getResources().getDrawable(R.drawable.custom_bg_main_logo));
                    lottieAnimationView.setAnimation(R.raw.bulb_white);
                    lottieAnimationView.loop(true);
                    lottieAnimationView.playAnimation();
                    bulbState = false;
                }
            }
        });
    }


    public void exploreApp(View v){
        startActivity(new Intent(getApplicationContext(),HomeScreen.class));
        overridePendingTransition(R.anim.animate_swipe_left_enter,R.anim.animate_swipe_left_exit);

    }
}