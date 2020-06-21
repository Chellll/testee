package com.example.mazito_game.ui.fragment.friends.myFriends;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentFriendsListItemBinding;

import java.util.ArrayList;
import java.util.List;

public class AllFriendsAdapter extends RecyclerView.Adapter<AllFriendsAdapter.AllFriendsViewHolder>{

    List<Integer> lst  = new ArrayList<>();

    public AllFriendsAdapter(){
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
    }

    @NonNull
    @Override
    public AllFriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentFriendsListItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends_list_item , parent, false);
        return new AllFriendsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AllFriendsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    class AllFriendsViewHolder extends RecyclerView.ViewHolder{

        FragmentFriendsListItemBinding binding;

        public AllFriendsViewHolder(FragmentFriendsListItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

    }

}
