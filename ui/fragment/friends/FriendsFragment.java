package com.example.mazito_game.ui.fragment.friends;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentFriendsBinding;
import com.example.mazito_game.modelFake.CategoryNews;
import com.example.mazito_game.ui.fragment.friends.All.FriendsAllFragment;
import com.example.mazito_game.ui.fragment.friends.Request.FriendsRequestFragment;
import com.example.mazito_game.ui.fragment.friends.myFriends.MyFriendsFragment;
import com.example.mazito_game.ui.fragment.news.ContentNewFragment;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class FriendsFragment extends Fragment {

    private String[] title = new String[]{
            " Друзья ",
            " Рефералы ",
            " Заявки "
    };

    public static FriendsFragment newInstance() {

        Bundle args = new Bundle();

        FriendsFragment fragment = new FriendsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentFriendsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_friends, container, false);

        binding.viewPager.setAdapter(new FriendsFragment.ViewPagerFragmentAdapter(getActivity()));

        binding.tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        binding.tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab,position) -> tab.setText(title[position])).attach();

        return binding.getRoot();
    }

    private class ViewPagerFragmentAdapter extends FragmentStateAdapter {

        public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return MyFriendsFragment.newInstance();
                case 1:
                    return FriendsAllFragment.newInstance();
                case 2:
                    return FriendsRequestFragment.newInstance();
            }
            return new ContentNewFragment();
        }

        @Override
        public int getItemCount() {
            return title.length;
        }
    }

}
