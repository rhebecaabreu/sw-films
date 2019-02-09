package com.example.swfilms.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.swfilms.R;
import com.example.swfilms.view.adapters.FilmsListAdapter;
import com.example.swfilms.viewmodel.FilmsListViewModel;

public class FilmsListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FilmsListAdapter adapter;
    FilmsListViewModel filmsListViewModel = new FilmsListViewModel();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new FilmsListAdapter(this, filmsListViewModel.getFilms());

        recyclerView.setAdapter(adapter);
    }
}
