package com.example.mazito_game.ui.fragment.friends.myFriends;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentFriendsTabFriendBinding;

public class MyFriendsFragment extends Fragment {

    private boolean activeMyFriends = false;
    private boolean activeGlobal = false;

    public static MyFriendsFragment newInstance() {

        Bundle args = new Bundle();

        MyFriendsFragment fragment = new MyFriendsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentFriendsTabFriendBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends_tab_friend, container, false);

        binding.cardMyfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(activeMyFriends){
                    activeMyFriends = !activeMyFriends;

                    binding.checkMyFriends.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);

                    binding.recyclerViewMyFriend.setVisibility(View.VISIBLE);
                    binding.recyclerViewMyFriend.setLayoutManager(new LinearLayoutManager(getContext()));
                    binding.recyclerViewMyFriend.setAdapter(new MyFriendsAdapter());

                    final Context context = binding.recyclerViewMyFriend.getContext();
                    final LayoutAnimationController controller =
                            AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_slide_right);

                    binding.recyclerViewMyFriend.setLayoutAnimation(controller);
                    binding.recyclerViewMyFriend.getAdapter().notifyDataSetChanged();
                    binding.recyclerViewMyFriend.scheduleLayoutAnimation();
                } else {
                    activeMyFriends = !activeMyFriends;
                    binding.checkMyFriends.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    binding.recyclerViewMyFriend.setVisibility(View.GONE);
                }


            }
        });

        binding.cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(activeGlobal){
                    activeGlobal = !activeGlobal;

                    binding.checkMyFriends.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);

                    binding.recyclerViewGlobal.setVisibility(View.VISIBLE);
                    binding.recyclerViewGlobal.setLayoutManager(new LinearLayoutManager(getContext()));
                    binding.recyclerViewGlobal.setAdapter(new AllFriendsAdapter());

                    final Context context = binding.recyclerViewGlobal.getContext();
                    final LayoutAnimationController controller =
                            AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_slide_right);

                    binding.recyclerViewGlobal.setLayoutAnimation(controller);
                    binding.recyclerViewGlobal.getAdapter().notifyDataSetChanged();
                    binding.recyclerViewGlobal.scheduleLayoutAnimation();
                } else {
                    activeGlobal = !activeGlobal;
                    binding.checkMyFriends.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    binding.recyclerViewGlobal.setVisibility(View.GONE);
                }

            }
        });

        return binding.getRoot();
    }
}
