package com.example.swfilms.view.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.swfilms.R;

class FilmsListHolder extends RecyclerView.ViewHolder {

    ImageView posterImageView;
    TextView titleTextView;
    TextView episodeTextView;
    TextView yearTextView;
    TextView directorTextView;
    TextView openingTextView;

    LinearLayout linearLayout;

    public FilmsListHolder(View itemView) {

        super(itemView);

        posterImageView = itemView.findViewById(R.id.posterImageView);
        titleTextView = itemView.findViewById(R.id.titleTextView);
        episodeTextView = itemView.findViewById(R.id.episodeTextView);
        yearTextView = itemView.findViewById(R.id.yearTextView);
        directorTextView = itemView.findViewById(R.id.directorTextView);
        openingTextView = itemView.findViewById(R.id.openingTextView);

        linearLayout = itemView.findViewById(R.id.cellFilmLinearLayout);
    }
}
