package com.learning.lifehacks.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learning.lifehacks.R;
import com.learning.lifehacks.TopicDescription;
import com.learning.lifehacks.models.TopicClassPojo;
import com.learning.lifehacks.models.Topic_Description_POJO;
import com.learning.lifehacks.viewholders.Topic_Description_ViewHolder;

import java.util.List;

public class Topic_Description_Adapter extends RecyclerView.Adapter<Topic_Description_ViewHolder> {

    private List<Topic_Description_POJO> list;
    private Context c;
    private LayoutInflater inflater;

    public Topic_Description_Adapter(Context c, List<Topic_Description_POJO> list){

        this.list = list;
        this.inflater = LayoutInflater.from(c);
        this.c = c;
    }

    @NonNull
    @Override
    public Topic_Description_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.cardview_topic_description,parent,false);
        return new Topic_Description_ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Topic_Description_ViewHolder holder, int position) {

        holder.title.setText(list.get(position).getTitle());
        holder.sub_title.setText(list.get(position).getSub_title());

        if(holder.getBindingAdapterPosition() == position){
            holder.sub_title_container.setVisibility(View.VISIBLE);
        }
        else{
            holder.sub_title_container.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}