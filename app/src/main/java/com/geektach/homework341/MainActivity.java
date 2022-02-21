package com.geektach.homework341;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PeopleAdapter peopleAdapter;
    private ArrayList<String> peoples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();
        recyclerView = findViewById(R.id.recycler);
        peopleAdapter = new PeopleAdapter(peoples);
        recyclerView.setAdapter(peopleAdapter);
    }

    private void loadData() {
        peoples = new ArrayList<>();
        peoples.add("Марат");
        peoples.add("Азамат");
        peoples.add("Бекзат");
        peoples.add("Марлен");
        peoples.add("Ислам");
        peoples.add("Матай");
        peoples.add("Кайрат");
        peoples.add("Бека");
        peoples.add("Алдияр");
        peoples.add("Максим");
        peoples.add("Медина");
        peoples.add("Нургул");
        peoples.add("Гульмира");
        peoples.add("Айжана");
        peoples.add("Рустам");
        peoples.add("Руслан");
        peoples.add("Зарема");
        peoples.add("Баха");
        peoples.add("Питер");
        peoples.add("Марк");
        peoples.add("Азат");
        peoples.add("Самат");
        peoples.add("Айгерим");
        peoples.add("Улук");
    }

}