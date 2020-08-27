package com.learning.lifehacks.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.learning.lifehacks.R;
import com.learning.lifehacks.adapters.TopicsAdapter;
import com.learning.lifehacks.datawarehouse.DataStore;
import com.learning.lifehacks.models.TopicClassPojo;

import java.util.List;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //recycler view related settings
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        // fetching topic list from Data Store Class
        DataStore dataStore = new DataStore(this);

        List<TopicClassPojo> list = dataStore.getTopicList();


        // setting adapter in recycler view
        recyclerView.setAdapter(new TopicsAdapter(this,list));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.animate_swipe_right_enter,R.anim.animate_swipe_right_exit);
    }
}