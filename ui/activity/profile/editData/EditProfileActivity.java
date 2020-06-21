package com.example.mazito_game.ui.activity.profile.editData;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityEditProfileBinding;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEditProfileBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_profile);

        //TODO: изменить фото - fragmentDialog

        binding.btnEditLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditLogoDialogFragment dialog = new EditLogoDialogFragment();
                dialog.show(getSupportFragmentManager(), "dialog");
            }
        });

        binding.btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditProfileActivity.this, "OK", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        binding.btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(EditProfileActivity.this, "CLoSE", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        initToolbar(binding);
    }

    void initToolbar(ActivityEditProfileBinding binding){
        Toolbar toolbar = (Toolbar) binding.toolbar;

        toolbar.setTitle("Изменить данные");

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}