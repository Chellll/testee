package com.example.mazito_game.ui.activity.profile.progress;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityProfileDostFullItemBinding;
import com.example.mazito_game.modelFake.Progress;

import java.util.List;

public class ProgressAdapter extends RecyclerView.Adapter<ProgressAdapter.ProgressViewHolder> {

    List<Progress> progresses;

    public ProgressAdapter(List<Progress> progresses){
        this.progresses = progresses;
    }

    @NonNull
    @Override
    public ProgressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ActivityProfileDostFullItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.activity_profile_dost_full_item, parent, false);
        return new ProgressViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgressViewHolder holder, int position) {
        holder.bind(progresses.get(position));
    }

    @Override
    public int getItemCount() {
        return progresses.size();
    }

    class ProgressViewHolder extends RecyclerView.ViewHolder{

        ActivityProfileDostFullItemBinding binding;


        public ProgressViewHolder(ActivityProfileDostFullItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Progress progress){
            binding.setModel(progress);
        }
    }

}
