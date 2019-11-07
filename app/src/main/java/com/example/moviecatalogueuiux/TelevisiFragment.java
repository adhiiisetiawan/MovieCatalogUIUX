package com.example.moviecatalogueuiux;


import android.content.Intent;
import android.os.Bundle;
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
public class TelevisiFragment extends Fragment {
    private RecyclerView rvTelevisi;
    private ArrayList<Televisi> listTV = new ArrayList<>();



    public TelevisiFragment() {
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

        rvTelevisi = getActivity().findViewById(R.id.rv_movies);

        rvTelevisi.setHasFixedSize(true);

        listTV.addAll(TelevisiData.getListData());
        showRecyclerCardViewTelevisi();
    }

    private void showRecyclerCardViewTelevisi(){
        rvTelevisi.setLayoutManager(new LinearLayoutManager(getContext()));
        CardViewTelevisiAdapter cardViewTelevisiAdapter= new CardViewTelevisiAdapter(listTV);
        rvTelevisi.setAdapter(cardViewTelevisiAdapter);

        cardViewTelevisiAdapter.setOnItemClickCallback(new CardViewTelevisiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Televisi data) {
                showSelectedTelevisi(data);
            }
        });
    }

    private void showSelectedTelevisi(Televisi tv) {
        Intent detailIntent = new Intent(getContext(), DetailTelevisi.class);
        detailIntent.putExtra(DetailTelevisi.EXTRA_TV, tv);
        startActivity(detailIntent);
    }
}
