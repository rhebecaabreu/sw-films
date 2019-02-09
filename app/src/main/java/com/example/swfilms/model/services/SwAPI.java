package com.example.swfilms.model.services;

import com.example.swfilms.model.entities.FilmsList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface SwAPI {
    @GET("films")
    Call<FilmsList> filmsList();
}
