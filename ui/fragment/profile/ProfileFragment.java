package com.example.mazito_game.ui.fragment.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mazito_game.dataSource.Progress;
import com.example.mazito_game.dataSource.TournamentDataSource;
import com.example.mazito_game.ui.activity.profile.editData.EditProfileActivity;
import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentProfileBinding;
import com.example.mazito_game.ui.activity.profile.progress.DostProfileActivity;
import com.example.mazito_game.ui.activity.profile.tournament.TournamentProfileActivity;

import java.util.ArrayList;
import java.util.List;

public class ProfileFragment extends Fragment {

    public static ProfileFragment newInstance() {

        Bundle args = new Bundle();

        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentProfileBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile, container, false);

        //TODO: залить реальные фейковые данных турниров и достижений
        //TODO: более подробная информация рейтинга

        //Достижения
        initProgress(binding);

        //Турниры
        initTournament(binding);

        binding.cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DostProfileActivity.class);
                startActivity(intent);
            }
        });

        binding.cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), TournamentProfileActivity.class);
                startActivity(intent);
            }
        });

        //изменить данные
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), EditProfileActivity.class);
                startActivity(intent);
            }
        });

        return binding.getRoot();
    }

    void initProgress(FragmentProfileBinding binding){
        LinearLayoutManager horizontalLL = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        binding.rvDost.setLayoutManager(horizontalLL);
        binding.rvDost.setAdapter(new RVDostAdapter(Progress.getListProgress(), getContext()));
    }

    void initTournament(FragmentProfileBinding binding){

        LinearLayoutManager horizontalLL1 = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);

        binding.rvTournament.setLayoutManager(horizontalLL1);
        binding.rvTournament.setAdapter(new RVTournamentAdapter(TournamentDataSource.getTournamentList()));
    }


}
