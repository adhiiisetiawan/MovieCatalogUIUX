package com.example.moviecatalogueuiux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailMovies extends AppCompatActivity {
    public static final String EXTRA_FILM = "film";

    TextView titleDetail,genre, runtime, language, crew, score, overview;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movies);


        titleDetail = findViewById(R.id.judul_movies);
        genre = findViewById(R.id.genre_movies);
        image = findViewById(R.id.cover_movies);
        runtime = findViewById(R.id.runtimeText);
        language = findViewById(R.id.languageText);
        crew = findViewById(R.id.crewText);
        score = findViewById(R.id.scoreText);
        overview = findViewById(R.id.overviewText);


        Movies movies = getIntent().getParcelableExtra(EXTRA_FILM);

        String textJudul = movies.getTitle();
        String textGenre = movies.getGenre();
        String photo = movies.getCover();
        String waktu = movies.getRuntime();
        String bahasa = movies.getLanguage();
        String featuredCrew = movies.getCrew();
        String scored = movies.getScore();
        String overViewd = movies.getOverview();


        Glide.with(this).load(photo).into(image);
        titleDetail.setText(textJudul);
        genre.setText(textGenre);
        runtime.setText(waktu);
        language.setText(bahasa);
        crew.setText(featuredCrew);
        score.setText(scored);
        overview.setText(overViewd);
    }
}
