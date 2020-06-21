package com.example.mazito_game.ui.activity.profile.tournament;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityProfileDostFullItemBinding;
import com.example.mazito_game.databinding.ActivityProfileTournamentFullBinding;
import com.example.mazito_game.databinding.ActivityProfileTournamentFullItemBinding;
import com.example.mazito_game.modelFake.Tournament;
import com.example.mazito_game.ui.activity.profile.progress.ProgressAdapter;

import java.util.ArrayList;
import java.util.List;

public class TournamentAdapter extends RecyclerView.Adapter<TournamentAdapter.TournamentViewHolder> {

    List<Tournament> tournaments = new ArrayList<>();

    public TournamentAdapter(List<Tournament> tournaments){
        this.tournaments = tournaments;
    }

    @NonNull
    @Override
    public TournamentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ActivityProfileTournamentFullItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.activity_profile_tournament_full_item , parent, false);
        return new TournamentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TournamentViewHolder holder, int position) {
        holder.bind(tournaments.get(position));
    }

    @Override
    public int getItemCount() {
        return tournaments.size();
    }

    class TournamentViewHolder extends RecyclerView.ViewHolder{

        ActivityProfileTournamentFullItemBinding binding;

        public TournamentViewHolder(ActivityProfileTournamentFullItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Tournament tournament){
            binding.setModel(tournament);
        }
    }

}
