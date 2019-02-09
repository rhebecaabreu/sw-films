package com.example.swfilms.view.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.swfilms.R;
import com.example.swfilms.model.entities.Film;

public class FilmsDetailsActivity extends AppCompatActivity {

    private TextView titleTextView;
    private TextView realeaseDateTextView;
    private TextView directorTextView;
    private TextView openingCrawlTextView;
    private TextView producerTextView;
    private ImageView posterImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        Intent intent = getIntent();
        Film film = (Film) intent.getSerializableExtra("film");

        titleTextView = findViewById(R.id.titleTextView);
        realeaseDateTextView = findViewById(R.id.realeaseDateTextView);
        directorTextView = findViewById(R.id.directorTextView);
        openingCrawlTextView = findViewById(R.id.openingCrawlTextView);
        producerTextView = findViewById(R.id.producerTextView);
        posterImageView = findViewById(R.id.posterImageView);

        if(intent.hasExtra("film")) {
            getSupportActionBar().setTitle(film.getTitle());
            titleTextView.setText(film.getTitle());
            realeaseDateTextView.setText(film.getReleaseDate());
            directorTextView.setText(film.getDirector());
            openingCrawlTextView.setText(film.getOpeningCrawl());
            producerTextView.setText("Producer "+film.getProducer());

            switch (film.getEpisodeId()) {
                case 1:
                    posterImageView.setImageResource(R.drawable.ep1);
                    break;
                case 2:
                    posterImageView.setImageResource(R.drawable.ep2);
                    break;
                case 3:
                    posterImageView.setImageResource(R.drawable.ep3);
                    break;
                case 4:
                    posterImageView.setImageResource(R.drawable.ep);
                    break;
                case 5:
                    posterImageView.setImageResource(R.drawable.ep5);
                    break;
                case 6:
                    posterImageView.setImageResource(R.drawable.ep6);
                    break;
                case 7:
                    posterImageView.setImageResource(R.drawable.ep7);
                    break;
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
            default:break;
        }
        return true;
    }
}
