package com.example.mazito_game.ui.fragment.profile;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentProfileDostItemBinding;
import com.example.mazito_game.databinding.FragmentProfileTournamentItemBinding;
import com.example.mazito_game.modelFake.Tournament;

import java.util.ArrayList;
import java.util.List;

public class RVTournamentAdapter extends RecyclerView.Adapter<RVTournamentAdapter.TournamentViewHolder>{

    List<Tournament> tournaments = new ArrayList<>();

    public RVTournamentAdapter(List<Tournament> tournaments){
        this.tournaments = tournaments;
    }

    @NonNull
    @Override
    public TournamentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentProfileTournamentItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile_tournament_item, parent, false);
        return new TournamentViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull TournamentViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return tournaments.size();
    }

    class TournamentViewHolder extends RecyclerView.ViewHolder{

        FragmentProfileTournamentItemBinding binding;

        TournamentViewHolder(FragmentProfileTournamentItemBinding binding){
            super(binding.getRoot());

            this.binding = binding;
        }

    }

}
