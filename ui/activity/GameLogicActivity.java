package com.example.mazito_game.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.mazito_game.R;
import com.example.mazito_game.ui.fragment.game.LogicGameFragment;

public class GameLogicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_logic);

        getSupportActionBar().hide();

        Bundle args = getIntent().getExtras();
        int kPL = args.getInt("kPl");

        Fragment fragment = LogicGameFragment.newInstance();

        Bundle bundle = new Bundle();
        bundle.putInt("key", kPL);
        fragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, fragment)
                .commit();
    }
}