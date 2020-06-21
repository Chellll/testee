package com.example.mazito_game.ui.activity.profile.editData;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.mazito_game.R;

public class EditLogoDialogFragment extends DialogFragment {

    private Button yes;
    private Button no;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getDialog().setTitle("Аватарка");

        View v = inflater.inflate(R.layout.dialog_fragment_edit_logo, null);

        yes = v.findViewById(R.id.button2);
        no = v.findViewById(R.id.button3);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "yes", Toast.LENGTH_SHORT).show();
                onDismiss(getDialog());
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "no", Toast.LENGTH_SHORT).show();
                onDismiss(getDialog());
            }
        });

        return v;

    }
}
