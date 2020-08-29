package com.learning.lifehacks.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.learning.lifehacks.R;
import com.learning.lifehacks.adapters.ViewPager_Adapter;

public class TopicDescription extends AppCompatActivity {

    private ViewPager2 viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_description);

        viewPager = findViewById(R.id.view_pager);

        // Disable clip to padding
        viewPager.setClipToPadding(false);

        //Pages to render offscreen
        viewPager.setOffscreenPageLimit(3);

        // set padding manually, the more you set the padding the more you see of prev & next page
        viewPager.setPadding(100,100,100,100);

//        viewPager.setAdapter();
    }
}