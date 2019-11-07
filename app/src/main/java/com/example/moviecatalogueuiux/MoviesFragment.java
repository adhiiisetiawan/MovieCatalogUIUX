package com.example.moviecatalogueuiux;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoviesFragment extends Fragment {
    private RecyclerView rvMovies;
    private ArrayList<Movies> list = new ArrayList<>();


    public MoviesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movies, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rvMovies = getActivity().findViewById(R.id.rv_movies);

        rvMovies.setHasFixedSize(true);

        list.addAll(MoviesData.getListData());
        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvMovies.setLayoutManager(new LinearLayoutManager(getContext()));
        CardViewMoviesAdapter cardViewMoviesAdapter= new CardViewMoviesAdapter(list);
        rvMovies.setAdapter(cardViewMoviesAdapter);

        cardViewMoviesAdapter.setOnItemClickCallback(new CardViewMoviesAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Movies data) {
                showSelectedHero(data);
            }
        });
    }

    private void showSelectedHero(Movies movie) {
        Intent detailIntent = new Intent(getContext(), DetailMovies.class);
        detailIntent.putExtra(DetailMovies.EXTRA_FILM, movie);
        startActivity(detailIntent);
    }
}
