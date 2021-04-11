package com.example.thirdtask;

import android.os.Bundle;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Movies> movie = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_recycler_view);
        recyclerView.setHasFixedSize(true);

        movie.addAll(MoviesData.getListData());
        showRecyclerView();
    }

    private void showRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MovieAdapter listMovieAdapter = new MovieAdapter(movie,this);
        recyclerView.setAdapter(listMovieAdapter);
    }
}