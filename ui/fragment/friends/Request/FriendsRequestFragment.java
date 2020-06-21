package com.example.mazito_game.ui.fragment.friends.Request;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentFriendsRequestBinding;

import java.util.ArrayList;
import java.util.List;

public class FriendsRequestFragment extends Fragment {

    RecyclerView rv;

    public static FriendsRequestFragment newInstance() {

        Bundle args = new Bundle();

        FriendsRequestFragment fragment = new FriendsRequestFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentFriendsRequestBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends_request, container, false);

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
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);

        rv = binding.rv;

        rv.setLayoutManager(new LinearLayoutManager(getContext()));
        rv.setAdapter(new RVRequestAdapter(lst));

        binding.textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getContext(), v);
                popupMenu.inflate(R.menu.menu_friends_request);

                popupMenu
                        .setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                            @Override
                            public boolean onMenuItemClick(MenuItem item) {
                                switch (item.getItemId()) {
                                    case R.id.menu1:
                                        binding.btn.setText("Входящие");
                                        return true;
                                    case R.id.menu2:
                                        binding.btn.setText("Исходящие");
                                        return true;
                                    case R.id.menu3:
                                        binding.btn.setText("Все заявки");
                                        return true;
                                    default:
                                        return false;
                                }
                            }
                        });

                popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
                    @Override
                    public void onDismiss(PopupMenu menu) {
                        Toast.makeText(getContext(), "onDismiss",
                                Toast.LENGTH_SHORT).show();
                    }
                });

                popupMenu.show();
            }
        });

        return binding.getRoot();
    }
}
