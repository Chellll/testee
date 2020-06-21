package com.example.mazito_game.ui.fragment.news;

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
import com.example.mazito_game.databinding.FragmentNewsTabItemBindingImpl;
import com.example.mazito_game.modelFake.News;
import com.example.mazito_game.modelFake.NewsGenerator;

import java.util.ArrayList;
import java.util.List;

public class ContentNewFragment extends Fragment {

    private RecyclerView recyclerView;

    public static ContentNewFragment newInstance(String k) {
        Bundle args = new Bundle();
        args.putString("type", k);
        ContentNewFragment fragment = new ContentNewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentNewsTabItemBindingImpl binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_tab_item, container, false);

        recyclerView = binding.rvNews;
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<News> a = NewsGenerator.generateData();

        List<News> news = new ArrayList<>();

        for(News e : a){
            if(e.getType().toString() == this.getArguments().getString("type")){
                news.add(e);
            }
        }

        recyclerView.setAdapter(new RVAdapter(news));

        return binding.getRoot();
    }


}
