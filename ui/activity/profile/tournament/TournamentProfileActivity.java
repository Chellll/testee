package com.example.mazito_game.ui.activity.profile.tournament;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.mazito_game.R;
import com.example.mazito_game.dataSource.TournamentDataSource;
import com.example.mazito_game.databinding.ActivityProfileTournamentFullBinding;

public class TournamentProfileActivity extends AppCompatActivity {

    TournamentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProfileTournamentFullBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_profile_tournament_full);

        initToolbar(binding);
        initRecyclerView(binding);

    }

    void initRecyclerView(ActivityProfileTournamentFullBinding binding){
        int numberColumns = 2;
        binding.rvTournament.setLayoutManager(new GridLayoutManager(getApplicationContext(), numberColumns));
        adapter = new TournamentAdapter(TournamentDataSource.getTournamentList());
        binding.rvTournament.setAdapter(adapter);
    }

    void initToolbar(ActivityProfileTournamentFullBinding binding){

        Toolbar toolbar = (Toolbar) binding.toolbar;

        toolbar.setTitle("Мои турниры");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}