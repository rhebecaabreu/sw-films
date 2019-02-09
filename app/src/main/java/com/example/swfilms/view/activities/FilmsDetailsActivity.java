package com.example.swfilms.view.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.swfilms.R;
import com.example.swfilms.model.entities.Film;
import com.example.swfilms.view.adapters.FilmsListListener;

public class FilmsDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_films_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //Mostrar o botão
        getSupportActionBar().setHomeButtonEnabled(true);      //Ativar o botão

        Intent intent = getIntent();
        Film film = (Film) intent.getSerializableExtra("film");

        if(intent.hasExtra("film")) {
            getSupportActionBar().setTitle(film.getTitle());
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) { //Botão adicional na ToolBar
        switch (item.getItemId()) {
            case android.R.id.home:
//                startActivity(new Intent(this, FilmsListActivity.class));
                finish();
                break;
            default:break;
        }
        return true;
    }
}
