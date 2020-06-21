package com.example.mazito_game.ui.activity.tournament;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityTournamentBinding;
import com.example.mazito_game.ui.fragment.tournament.tournamentListInfo.TournamentListInfoFragment;

public class TournamentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTournamentBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_tournament);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, TournamentListInfoFragment.newInstance())
                .commit();
    }
}