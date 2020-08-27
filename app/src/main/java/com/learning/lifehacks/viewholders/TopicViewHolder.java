package com.learning.lifehacks.viewholders;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.learning.lifehacks.R;
import com.learning.lifehacks.TopicDescription;

public class TopicViewHolder extends RecyclerView.ViewHolder {

    public TextView topicName;
    public ImageView topicImage;
    public Context c;

    public TopicViewHolder(@NonNull final View itemView, final Context c) {
        super(itemView);
        this.c = c;

        topicName = itemView.findViewById(R.id.topic_name);
        topicImage = itemView.findViewById(R.id.topic_image);

    }
}