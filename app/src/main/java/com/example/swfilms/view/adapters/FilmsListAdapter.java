package com.example.swfilms.view.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.swfilms.R;
import com.example.swfilms.model.entities.Film;
import com.example.swfilms.view.activities.FilmsDetailsActivity;
import com.example.swfilms.view.activities.FilmsListActivity;

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
        final Film film = filmList.get(position);
        filmsListHolder.titleTextView.setText(film.getTitle());
        filmsListHolder.episodeTextView.setText(String.valueOf(film.getEpisodeId()));
        filmsListHolder.yearTextView.setText(film.getReleaseDate());
        filmsListHolder.directorTextView.setText(film.getDirector());
        filmsListHolder.openingTextView.setText(film.getOpeningCrawl());

        switch (film.getEpisodeId()){
            case 1:
                filmsListHolder.posterImageView.setImageResource(R.drawable.ep1);
                break;
            case 2:
                filmsListHolder.posterImageView.setImageResource(R.drawable.ep2);
                break;
            case 3:
                filmsListHolder.posterImageView.setImageResource(R.drawable.ep3);
                break;
            case 4:
                filmsListHolder.posterImageView.setImageResource(R.drawable.ep);
                break;
            case 5:
                filmsListHolder.posterImageView.setImageResource(R.drawable.ep5);
                break;
            case 6:
                filmsListHolder.posterImageView.setImageResource(R.drawable.ep6);
                break;
            case 7:
                filmsListHolder.posterImageView.setImageResource(R.drawable.ep7);
                break;
        }

        filmsListHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, film.getTitle(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(mContext, FilmsDetailsActivity.class);
                intent.putExtra("film", film);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }


}
