package com.learning.lifehacks.viewholders;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learning.lifehacks.R;

public class Topic_Description_ViewHolder extends RecyclerView.ViewHolder {

    public TextView title,sub_title;
    public LinearLayout sub_title_container;

    public Topic_Description_ViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        sub_title = itemView.findViewById(R.id.sub_title);
        sub_title_container = itemView.findViewById(R.id.sub_title_container);
    }
}
