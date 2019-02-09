package com.example.swfilms.model.services;

import com.example.swfilms.model.entities.Films;
import com.example.swfilms.model.entities.FilmsList;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface SwAPI {
    @GET("films")
    Call<FilmsList> filmsList();
}
