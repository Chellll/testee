package com.example.mazito_game.ui.fragment.profile;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentNewsItemBinding;
import com.example.mazito_game.databinding.FragmentProfileDostItemBinding;
import com.example.mazito_game.modelFake.Progress;
import com.example.mazito_game.ui.fragment.news.RVAdapter;

import java.util.ArrayList;
import java.util.List;

public class RVDostAdapter extends RecyclerView.Adapter<RVDostAdapter.DostViewHolder> {

    public final String TAG = "tag";

    Context context;
    List<Progress> lst = new ArrayList<>();

    public RVDostAdapter(List<Progress> lst, Context context){
        this.lst = lst;
        this.context = context;
    }

    @NonNull
    @Override
    public DostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        FragmentProfileDostItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_profile_dost_item, parent, false);
        return new RVDostAdapter.DostViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull DostViewHolder holder, int position) {

        holder.binding.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: sdsdff");
                Toast.makeText(context, "click", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return lst.size();
    }

    class DostViewHolder extends RecyclerView.ViewHolder{

        FragmentProfileDostItemBinding binding;

        public DostViewHolder(FragmentProfileDostItemBinding binding){
            super(binding.getRoot());

            this.binding = binding;
        }

    }


}
