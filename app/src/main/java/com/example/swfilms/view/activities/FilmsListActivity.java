package com.example.swfilms.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.swfilms.R;
import com.example.swfilms.model.entities.Films;
import com.example.swfilms.model.services.SwAPI;
import com.example.swfilms.view.adapters.FilmsListAdapter;
import com.example.swfilms.viewmodel.FilmsListViewModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

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


        if(filmsListViewModel.getFilms()!= null){

            adapter = new FilmsListAdapter(this, filmsListViewModel.getFilms());
        }

        recyclerView.setAdapter(adapter);
    }
}
