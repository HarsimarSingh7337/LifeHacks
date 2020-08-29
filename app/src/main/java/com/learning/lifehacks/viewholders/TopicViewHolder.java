package com.learning.lifehacks.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learning.lifehacks.R;

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