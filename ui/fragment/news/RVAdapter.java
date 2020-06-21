package com.example.mazito_game.ui.fragment.news;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentNewsItemBinding;
import com.example.mazito_game.modelFake.News;

import java.util.ArrayList;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.NewsHolder> {

    private List<News> news = new ArrayList<>();

    public RVAdapter(List<News> news){
        this.news.clear();
        this.news.addAll(news);
    }

    public void setData(List<News> data) {
        news.clear();
        news.addAll(data);
    }

    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentNewsItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_item, parent, false);
        return new NewsHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsHolder holder, int position) {
        holder.bind(news.get(position));
    }

    @Override
    public int getItemCount() {
        return news.size();
    }

    class NewsHolder extends RecyclerView.ViewHolder{
        FragmentNewsItemBinding binding;

        public NewsHolder(FragmentNewsItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(News news){
            binding.setNews(news);
            binding.executePendingBindings();
        }
    }

}
