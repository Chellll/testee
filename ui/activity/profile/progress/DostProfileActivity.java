package com.example.mazito_game.ui.activity.profile.progress;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.mazito_game.R;
import com.example.mazito_game.dataSource.Progress;
import com.example.mazito_game.databinding.ActivityProfileDostFullBinding;

public class DostProfileActivity extends AppCompatActivity {

    ProgressAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityProfileDostFullBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_profile_dost_full);

        initToolbar(binding);
        initRecyclerView(binding);


    }

    void initRecyclerView(ActivityProfileDostFullBinding binding){
        int numberColumns = 3;
        binding.rv.setLayoutManager(new GridLayoutManager(this, numberColumns));

        adapter = new ProgressAdapter(Progress.getListProgress());

        binding.rv.setAdapter(adapter);

    }

    void initToolbar(ActivityProfileDostFullBinding binding){

        Toolbar toolbar = (Toolbar) binding.toolbar;

        toolbar.setTitle("Достижения");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}