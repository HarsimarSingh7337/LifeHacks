package com.learning.lifehacks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.learning.lifehacks.adapters.Topic_Description_Adapter;
import com.learning.lifehacks.models.Topic_Description_POJO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TopicDescription extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Topic_Description_POJO> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_description);
        setTopicImage();

        recyclerView = findViewById(R.id.recycle_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new Topic_Description_Adapter(this,list));


    }

    public void setTopicImage(){

        Bundle bundle = getIntent().getExtras();

        ImageView imageView = findViewById(R.id.topic_image);
        String temp = bundle.getString("imgPath");

        int id = getResources().getIdentifier(temp,"drawable",getPackageName());
        imageView.setImageResource(id);
    }
}