package com.geektach.homework341;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PeopleViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public PeopleViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_item);
    }

    public void bind(String people) {
        textView.setText(people);
    }
}
