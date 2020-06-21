package com.example.mazito_game.ui.activity.intro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityIntroBinding;
import com.example.mazito_game.ui.activity.MainActivity;
import com.example.mazito_game.utils.SharedPreferencesHelper;

public class IntroActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityIntroBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_intro);

        binding.guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferencesHelper.setSharedPreferenceBoolean(getApplicationContext(), "isGuest", true);
                Intent intent = new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        binding.signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        binding.registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });


        boolean isSign = SharedPreferencesHelper.getSharedPreferenceBoolean(getApplicationContext(), "isSign", false);

        if(isSign){
            Intent intent = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }

        getSupportActionBar().hide();
    }


}