package com.learning.lifehacks.models;

public class Topic_Description_POJO {

    private String title;
    private String sub_title;

    Topic_Description_POJO(String title, String sub_title){

        this.title = title;
        this.sub_title = sub_title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub_title() {
        return sub_title;
    }

    public void setSub_title(String sub_title) {
        this.sub_title = sub_title;
    }
}
