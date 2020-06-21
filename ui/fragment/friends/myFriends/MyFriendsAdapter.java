package com.example.mazito_game.ui.fragment.friends.myFriends;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.ActivityProfileTournamentFullItemBinding;
import com.example.mazito_game.databinding.FragmentFriendsListItemBinding;
import com.example.mazito_game.ui.activity.profile.tournament.TournamentAdapter;

import java.util.ArrayList;
import java.util.List;

public class MyFriendsAdapter extends RecyclerView.Adapter<MyFriendsAdapter.MyFriendsViewHolder> {

    List<Integer> lst = new ArrayList<>();

    public MyFriendsAdapter(){
        lst.add(1);
        lst.add(1);lst.add(1);
        lst.add(1);lst.add(1);
        lst.add(1);lst.add(1);
        lst.add(1);lst.add(1);
        lst.add(1);lst.add(1);
        lst.add(1);
    }

    @NonNull
    @Override
    public MyFriendsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentFriendsListItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends_list_item , parent, false);
        return new MyFriendsViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyFriendsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    class MyFriendsViewHolder extends RecyclerView.ViewHolder{

        FragmentFriendsListItemBinding binding;

        public MyFriendsViewHolder(FragmentFriendsListItemBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

    }

}
