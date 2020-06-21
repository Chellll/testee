package com.example.mazito_game.ui.fragment.getMonet;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentGetMonetItemBinding;
import com.example.mazito_game.databinding.FragmentNewsItemBinding;

import java.util.ArrayList;
import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MonetViewHolder> {

    List<Integer> lst = new ArrayList<>();

    public RVAdapter(List<Integer> lst){
        this.lst = lst;
    }

    @NonNull
    @Override
    public MonetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentGetMonetItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_get_monet_item, parent, false);
        return new MonetViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MonetViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    class MonetViewHolder extends RecyclerView.ViewHolder{

        FragmentGetMonetItemBinding binding;

        public MonetViewHolder(FragmentGetMonetItemBinding binding){
            super(binding.getRoot());

            this.binding = binding;
        }

    }

}
