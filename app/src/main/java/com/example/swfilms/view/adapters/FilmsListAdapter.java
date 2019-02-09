package com.example.swfilms.view.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.swfilms.R;
import com.example.swfilms.model.entities.Films;

import java.util.List;

public class FilmsListAdapter extends RecyclerView.Adapter<FilmsListHolder> {

    private Context mContext;
    private List<Films> filmsList;

    public FilmsListAdapter(Context mContext, List<Films> filmsList) {
        this.mContext = mContext;
        this.filmsList = filmsList;
    }

    @Override
    public FilmsListHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.cell_films_list, null);
        return new FilmsListHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmsListHolder filmsListHolder, int position) {
        Films films = filmsList.get(position);
        filmsListHolder.titleTextView.setText(films.getTitle());
        filmsListHolder.episodeTextView.setText(String.valueOf(films.getEpisodeId()));
//        filmsListHolder.posterImageView.setImageDrawable(mContext.getResources().getDrawable(films.getPoster(), null));

        //TODO adicionar demais atributos
    }

    @Override
    public int getItemCount() {
        return filmsList.size();
    }
}
