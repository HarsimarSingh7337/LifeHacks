package com.learning.lifehacks.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityOptionsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.learning.lifehacks.R;
import com.learning.lifehacks.activities.TopicDescription;
import com.learning.lifehacks.models.TopicClassPojo;
import com.learning.lifehacks.viewholders.TopicViewHolder;

import java.util.List;

public class TopicsAdapter extends RecyclerView.Adapter<TopicViewHolder> {

    private List<TopicClassPojo> list;
    private LayoutInflater inflater;
    private Context c;

    public TopicsAdapter(Context c, List<TopicClassPojo> list){
        this.inflater = LayoutInflater.from(c);
        this.list = list;
        this.c = c;
    }

    @NonNull
    @Override
    public TopicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.cardview_topics,parent,false);
        return new TopicViewHolder(v,c);
    }

    @Override
    public void onBindViewHolder(@NonNull final TopicViewHolder holder, final int position) {


        final TopicClassPojo topicClassPojo = list.get(position);

        holder.topicName.setText(list.get(position).getTopicName());
        holder.topicImage.setImageDrawable(list.get(position).getTopicDrawable());

        holder.topicImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(c, TopicDescription.class);
                intent.putExtra("imgPath",list.get(position).getImagePath());

                ActivityOptionsCompat options = ActivityOptionsCompat.
                        makeSceneTransitionAnimation((Activity) c,v, holder.topicImage.getTransitionName());
                c.startActivity(intent, options.toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}