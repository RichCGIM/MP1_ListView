package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Get the recycler from the Layout
        recyclerView = findViewById(R.id.my_recycler_view);

        //Create a layout manager, and assign it to the RecyclerView
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<String> data = new ArrayList<>();

        // Add 1 to 99 in the data sets
        for (int i = 1; i < 1000; i++) {
            data.add(String.valueOf(i));
        }

        mAdapter = new MyAdapter(getApplicationContext(), data);
        recyclerView.setAdapter(mAdapter);

    }
}
