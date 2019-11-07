package com.example.moviecatalogueuiux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailTelevisi extends AppCompatActivity {
    public static final String EXTRA_TV = "televisi";

    TextView titleDetailTV,genreTV, runtimeTV, languageTV, crewTV, scoreTV, overviewTV;
    ImageView imageTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_televisi);


        titleDetailTV = findViewById(R.id.judul_tv);
        genreTV = findViewById(R.id.genre_tv);
        imageTV = findViewById(R.id.cover_tv);
        runtimeTV = findViewById(R.id.runtimeText_tv);
        languageTV = findViewById(R.id.languageText_tv);
        crewTV = findViewById(R.id.crewText_tv);
        scoreTV = findViewById(R.id.scoreText_tv);
        overviewTV = findViewById(R.id.overviewText_tv);


        Televisi televisi = getIntent().getParcelableExtra(EXTRA_TV);

        String textJudulTV = televisi.getTitleTV();
        String textGenreTV = televisi.getGenreTV();
        String photoTV = televisi.getCoverTV();
        String waktuTV = televisi.getRuntimeTV();
        String bahasaTV = televisi.getLanguageTV();
        String featuredCrewTV = televisi.getCrewTV();
        String scoredTV = televisi.getScoreTV();
        String overViewdTV = televisi.getOverviewTV();


        Glide.with(this).load(photoTV).into(imageTV);
        titleDetailTV.setText(textJudulTV);
        genreTV.setText(textGenreTV);
        runtimeTV.setText(waktuTV);
        languageTV.setText(bahasaTV);
        crewTV.setText(featuredCrewTV);
        scoreTV.setText(scoredTV);
        overviewTV.setText(overViewdTV);
    }
}
