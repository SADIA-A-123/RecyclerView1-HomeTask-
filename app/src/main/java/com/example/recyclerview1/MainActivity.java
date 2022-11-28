package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
  //
    RecyclerView recyclerView;

    String s1[], s2[];

    int images[] = {R.drawable.download, R.drawable.java, R.drawable.kotlin, R.drawable.python,
    R.drawable.ruby, R.drawable.swift, R.drawable.visual_studio};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  //
        recyclerView = findViewById(R.id.recyclerView) ;
        s1 = getResources().getStringArray(R.array.programming_languages);
        s2 = getResources().getStringArray(R.array.Description_for_each_programming_language);

        MyAdapter myAdapter = new MyAdapter(this,s1,s2, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this
        ));
    }
}