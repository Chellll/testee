package com.example.mazito_game.ui.activity.intro;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityLoginBinding;
import com.example.mazito_game.utils.SharedPreferencesHelper;

public class LoginActivity extends AppCompatActivity {

    SharedPreferences sp;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityLoginBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_login);

        sp = getSharedPreferences("pref", getApplicationContext().MODE_PRIVATE);

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(LoginActivity.this, "click", Toast.LENGTH_SHORT).show();
                //TODO: функция для получения данных о пользователе(корректность данных) - экран входа

                SharedPreferencesHelper.setSharedPreferenceBoolean(getApplicationContext(), "isSign", true);
            }
        });


    }


}
