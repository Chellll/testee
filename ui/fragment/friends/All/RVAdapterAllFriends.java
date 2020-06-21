package com.example.mazito_game.ui.fragment.friends.All;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentFriendsItemBinding;

import java.util.ArrayList;
import java.util.List;

public class RVAdapterAllFriends extends RecyclerView.Adapter<RVAdapterAllFriends.FriendsViewHolder> {

    List<Integer> lst = new ArrayList<>();

    public RVAdapterAllFriends(List<Integer> lst){
        this.lst = lst;
    }

    @NonNull
    @Override
    public FriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentFriendsItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends_item, parent, false);
        return new FriendsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull FriendsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    class FriendsViewHolder extends RecyclerView.ViewHolder{

        FragmentFriendsItemBinding binding;

        public FriendsViewHolder(FragmentFriendsItemBinding binding){
            super(binding.getRoot());

            this.binding = binding;
        }

    }

}
