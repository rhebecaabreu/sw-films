package com.example.swfilms.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.swfilms.R;
import com.example.swfilms.model.entities.Film;

import java.util.List;

public class FilmsListAdapter extends RecyclerView.Adapter<FilmsListHolder> {

    private Context mContext;
    private List<Film> filmList;

    public FilmsListAdapter(Context mContext, List<Film> filmList) {
        this.mContext = mContext;
        this.filmList = filmList;
    }

    @Override
    public FilmsListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.cell_films_list, null);
        return new FilmsListHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmsListHolder filmsListHolder, int position) {
        Film film = filmList.get(position);
        filmsListHolder.titleTextView.setText(film.getTitle());
        filmsListHolder.episodeTextView.setText(String.valueOf(film.getEpisodeId()));
//        filmsListHolder.posterImageView.setImageDrawable(mContext.getResources().getDrawable(film.getPoster(), null));

        //TODO adicionar demais atributos
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }
}
