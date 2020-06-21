package com.example.mazito_game.ui.activity.intro;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityRegistrationBinding;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityRegistrationBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_registration);


    }
}
