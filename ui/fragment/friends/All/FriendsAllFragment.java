package com.example.mazito_game.ui.fragment.friends.All;

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
import com.example.mazito_game.databinding.FragmentFriendsAllBinding;

import java.util.ArrayList;
import java.util.List;

public class FriendsAllFragment extends Fragment {

    private RecyclerView rv;

    public static FriendsAllFragment newInstance() {

        Bundle args = new Bundle();

        FriendsAllFragment fragment = new FriendsAllFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentFriendsAllBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends_all, container, false);

        List<Integer> lst = new ArrayList<>();

        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);lst.add(1);
        lst.add(1);
        lst.add(1);

        rv = binding.rv;

        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new RVAdapterAllFriends(lst));

        return binding.getRoot();
    }
}
