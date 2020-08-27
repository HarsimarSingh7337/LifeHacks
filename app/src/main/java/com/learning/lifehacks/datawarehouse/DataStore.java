package com.learning.lifehacks.datawarehouse;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.res.ResourcesCompat;

import com.learning.lifehacks.R;
import com.learning.lifehacks.models.TopicClassPojo;
import com.learning.lifehacks.models.Topic_Description_POJO;

import java.util.ArrayList;
import java.util.List;

public class DataStore {

    private List<TopicClassPojo> topicList = new ArrayList<>();
    private List<Topic_Description_POJO> menClothingList = new ArrayList<>();
    private Context c;

    public DataStore(Context c){
        this.c = c;
    }

    public void prepareTopicList(){

        String[] topicName = new String[]{"Men Clothing","Women Clothing","Kids Clothing","Cooking","Education","Love",
                "Husband","Wife","Boyfriend","Girlfriend","Food","Business","Travel","Driving","Beauty"};

        Drawable[] topicImage = new Drawable[]{
                ResourcesCompat.getDrawable(c.getResources(), R.drawable.clothes_menn,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.clothes_women,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.clothes_kids,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.cooking,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.education,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.love,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.husband,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.wife,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.boyfriend,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.girlfriend,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.food,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.business,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.travel,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.driving,c.getTheme()),
                ResourcesCompat.getDrawable(c.getResources(),R.drawable.beauty,c.getTheme())};

        String[] topicImgPath = new String[]{"clothes_menn","clothes_women","clothes_kids","cooking","education","love","husband","wife","boyfriend","girlfriend","food","business","travel","driving","beauty"};



        for (int i=0; i<topicName.length; i++){

            TopicClassPojo topicClassPojo = new TopicClassPojo();

            topicClassPojo.setTopicName(topicName[i]);
            topicClassPojo.setTopicDrawable(topicImage[i]);
            topicClassPojo.setImagePath(topicImgPath[i]);

            topicList.add(i,topicClassPojo);
            topicClassPojo = null;
        }
    }

    public List<TopicClassPojo> getTopicList(){

        prepareTopicList();
        return topicList;
    }

    public List<Topic_Description_POJO> getMenClothingList() {

        return menClothingList;
    }
}