package com.example.swfilms.viewmodel;

import android.util.Log;
import android.widget.Toast;

import com.example.swfilms.model.entities.Films;

import com.example.swfilms.model.entities.FilmsList;
import com.example.swfilms.model.entities.People;
import com.example.swfilms.model.services.API;
import com.example.swfilms.model.services.SwAPI;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FilmsListViewModel {

    private List<Films> filmsList;

    public List<Films> getFilms(){

        filmsList = new ArrayList<Films>();

        SwAPI service = API.getClient().create(SwAPI.class);
        Call<FilmsList> call = service.filmsList();

        call.enqueue(new Callback<FilmsList>() {
            @Override
            public void onResponse(Call<FilmsList> call, Response<FilmsList> response) {
                    if(response.isSuccessful() && (response.body()!=null)){
                        System.out.println("\n------------_>  deu bom ");

                    } else {
                        System.out.println("\n------------_> no deu bom ");

                    }
            }

            @Override
            public void onFailure(Call<FilmsList> call, Throwable t) {
                System.out.println("\n------------_> "+ t.getMessage());
            }
        });

//
//        Films teste = new Films("awaaeawea", 1);
//        Films teste2 = new Films("awaaeawea", 1);
//        Films teste3 = new Films("awaaeawea", 1);
//        Films teste4 = new Films("awaaeawea", 1);
//        Films teste5 = new Films("awaaeawea", 1);
//
//        filmsList.add(teste);
//        filmsList.add(teste2);
//        filmsList.add(teste3);
//        filmsList.add(teste4);
//        filmsList.add(teste5);


        return filmsList;
    }
}
