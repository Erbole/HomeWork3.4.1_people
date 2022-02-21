package com.geektach.homework341;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleViewHolder>{
    private ArrayList<String> people = new ArrayList<>();
    public PeopleAdapter(ArrayList<String> people) {
        this.people = people;
    }
    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PeopleViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_people, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        holder.bind(people.get(position));
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
