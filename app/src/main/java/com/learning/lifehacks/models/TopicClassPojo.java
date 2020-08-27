package com.learning.lifehacks.models;

import android.graphics.drawable.Drawable;

public class TopicClassPojo {

    private String topicName;
    private Drawable topicDrawable;
    private String imagePath;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public TopicClassPojo(String topicName, Drawable topicDrawable, String imagePath){

        this.topicDrawable = topicDrawable;
        this.topicName = topicName;
        this.imagePath = imagePath;
    }

    public TopicClassPojo(){

    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public Drawable getTopicDrawable() {
        return topicDrawable;
    }

    public void setTopicDrawable(Drawable topicDrawable) {
        this.topicDrawable = topicDrawable;
    }
}
