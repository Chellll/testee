package com.example.mazito_game.ui.fragment.raiting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentRaitingContentBinding;

import java.util.ArrayList;
import java.util.List;

public class RaitingCardInfo extends Fragment {

    RecyclerView rv;

    public static RaitingCardInfo newInstance() {

        Bundle args = new Bundle();

        RaitingCardInfo fragment = new RaitingCardInfo();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentRaitingContentBinding binding =  DataBindingUtil.inflate(inflater, R.layout.fragment_raiting_content, container, false);

        rv = binding.rv;

        List<Integer> lst = new ArrayList<>();

        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);

        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new RVAdapter(lst));

        return binding.getRoot();
    }
}
