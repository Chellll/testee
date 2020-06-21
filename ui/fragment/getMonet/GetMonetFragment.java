package com.example.mazito_game.ui.fragment.getMonet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentGetMonetBinding;

import java.util.ArrayList;
import java.util.List;

public class GetMonetFragment extends Fragment {

    public static GetMonetFragment newInstance() {

        Bundle args = new Bundle();

        GetMonetFragment fragment = new GetMonetFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentGetMonetBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_get_monet, container, false);

        List<Integer> lst = new ArrayList<>();

        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);

        binding.rv.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.rv.setAdapter(new RVAdapter(lst));

        return binding.getRoot();
    }
}
