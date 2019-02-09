package com.example.swfilms.viewmodel;

import android.app.ProgressDialog;
import android.content.Context;
import android.database.Observable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.swfilms.model.entities.Film;

import com.example.swfilms.model.entities.FilmsList;
import com.example.swfilms.model.services.API;
import com.example.swfilms.model.services.SwAPI;
import com.example.swfilms.view.adapters.FilmsListAdapter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmsListViewModel {
    List<Film> filmList;
    SwAPI service;
    
    public void getFilms(final Context context, final ProgressDialog progress, final RecyclerView recyclerView) throws IOException {

        filmList = new ArrayList<>();

        API.getFilms().enqueue(new Callback<FilmsList>() {
            @Override
            public void onResponse(Call<FilmsList> call, retrofit2.Response<FilmsList> response) {
                if(response.isSuccessful()){
                    Log.i("Response: ", "OK " + response.code());

                    FilmsList films = response.body();

                    for (Film f : films.results) {
                        filmList.add(f);
                    }

                    Log.i("TEST: ", String.valueOf(filmList.size()));

                    FilmsListAdapter adapter = new FilmsListAdapter(context, filmList);
                    recyclerView.setAdapter(adapter);
                    progress.dismiss();

                } else {
                    Log.i("Response: ", "ERROR " + response.code());
                }
            }

            @Override
            public void onFailure(Call<FilmsList> call, Throwable t) {
                Log.i("Response: ", " ERROR "+t.getMessage());
            }
        });

    }
}




