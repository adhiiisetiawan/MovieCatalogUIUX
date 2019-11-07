package com.example.moviecatalogueuiux;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewTelevisiAdapter extends RecyclerView.Adapter<CardViewTelevisiAdapter.CardViewViewHolder>{
    private ArrayList<Televisi> listelevisi;
    private CardViewTelevisiAdapter.OnItemClickCallback onItemClickCallback;

    public CardViewTelevisiAdapter(ArrayList<Televisi> listelevisi) {
        this.listelevisi = listelevisi;
    }

    public void setOnItemClickCallback(CardViewTelevisiAdapter.OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewTelevisiAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_televisi, viewGroup, false);
        return new CardViewTelevisiAdapter.CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewTelevisiAdapter.CardViewViewHolder holder, int position) {
        final Televisi televisi = listelevisi.get(position);

        Glide.with(holder.itemView.getContext())
                .load(televisi.getCoverTV())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.coverTV);

        holder.titleTV.setText(televisi.getTitleTV());
        holder.genreTV.setText(televisi.getOverviewTV());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listelevisi.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listelevisi.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Televisi data);
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView coverTV;
        TextView titleTV, genreTV;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);

            coverTV = itemView.findViewById(R.id.cover_tv);
            titleTV = itemView.findViewById(R.id.title_tv);
            genreTV = itemView.findViewById(R.id.genre_tv);

        }
    }
}
