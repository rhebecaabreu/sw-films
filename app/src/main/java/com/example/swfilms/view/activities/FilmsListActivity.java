package com.example.swfilms.view.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.swfilms.R;
import com.example.swfilms.model.entities.Films;
import com.example.swfilms.view.adapters.FilmsListAdapter;

import java.util.ArrayList;
import java.util.List;

public class FilmsListActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FilmsListAdapter adapter;
    List<Films> filmsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_list);

        filmsList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        //dados ??? teste
//        Films teste = new Films("O despertar da força", 1, "laalala", "lalala", "lalalaa","lalalaa");
//        filmsList.add(teste);

        adapter = new FilmsListAdapter(this, filmsList);
        recyclerView.setAdapter(adapter);
    }
}
