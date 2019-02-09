package com.example.swfilms.view.activities;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ProgressBar;

import com.example.swfilms.R;
import com.example.swfilms.model.entities.Film;
import com.example.swfilms.view.adapters.FilmsListAdapter;
import com.example.swfilms.viewmodel.FilmsListViewModel;

import java.io.IOException;
import java.util.List;

public class FilmsListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FilmsListAdapter adapter;
    FilmsListViewModel filmsListViewModel = new FilmsListViewModel();;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_list);

        ProgressDialog mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setIndeterminate(true);
        mProgressDialog.setMessage("Loading...");
        mProgressDialog.setCanceledOnTouchOutside(false);
        mProgressDialog.show();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        try {
            filmsListViewModel.getFilms(this, mProgressDialog, recyclerView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
