package com.example.swfilms.viewmodel;

import android.util.Log;

import com.example.swfilms.model.entities.Film;

import com.example.swfilms.model.entities.FilmsList;
import com.example.swfilms.model.services.API;
import com.example.swfilms.model.services.SwAPI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmsListViewModel {
    List<Film> filmList;


    public List<Film> getFilms(){

        SwAPI service = API.getClient().create(SwAPI.class);
        Call<FilmsList> call = service.filmsList();

        filmList = new ArrayList<>();

        call.enqueue(new Callback<FilmsList>() {
            @Override
            public void onResponse(Call<FilmsList> call, Response<FilmsList> response) {
                if (response.isSuccessful()) {
                    Log.i("Response: ", "OK " + response.code());

                    FilmsList films = response.body();

                    for (Film f : films.results) {
                        filmList.add(f);
                    }

                    Log.i("TEST: ", String.valueOf(filmList.size()));


                } else {
                    Log.i("Response: ", "ERROR " + response.code());
                }
            }

            @Override
            public void onFailure(Call<FilmsList> call, Throwable t) {
                Log.i("Response: ", " ERROR "+t.getMessage());
            }
        });

        return filmList;
    }
}
