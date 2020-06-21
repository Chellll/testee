package com.example.mazito_game.ui.fragment.friends.Request;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentFriendsRequestItemBinding;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

public class RVRequestAdapter extends RecyclerView.Adapter<RVRequestAdapter.RequestViewHolder>{

    List<Integer> lst = new ArrayList<>();

    public RVRequestAdapter(List<Integer> lst){
        this.lst = lst;
    }

    @NonNull
    @Override
    public RequestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentFriendsRequestItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends_request_item, parent, false);
        return new RVRequestAdapter.RequestViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RequestViewHolder holder, int position) {

        holder.binding.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: add");
            }
        });

        holder.binding.close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: close");
            }
        });

    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    class RequestViewHolder extends RecyclerView.ViewHolder{

        FragmentFriendsRequestItemBinding binding;

        public RequestViewHolder(FragmentFriendsRequestItemBinding binding){
            super(binding.getRoot());

            this.binding = binding;
        }

    }

}
