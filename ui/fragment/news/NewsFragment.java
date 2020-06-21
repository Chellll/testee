package com.example.mazito_game.ui.fragment.news;

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
import com.example.mazito_game.databinding.FragmentNewsBinding;
import com.example.mazito_game.modelFake.CategoryNews;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class NewsFragment extends Fragment {

    // tab titles
    private String[] titles = new String[]{" Турниры ", " Обновления ", " Друзья "};

    public static NewsFragment newInstance() {

        Bundle args = new Bundle();

        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentNewsBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news, container, false);

        binding.viewPager.setAdapter(new ViewPagerFragmentAdapter(getActivity()));

        binding.tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        binding.tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab,position) -> tab.setText(titles[position])).attach();

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
                    return ContentNewFragment.newInstance(CategoryNews.TOURNAMENT.toString());
                case 1:
                    return ContentNewFragment.newInstance(CategoryNews.UPDATE.toString());
                case 2:
                    return ContentNewFragment.newInstance(CategoryNews.FRIENDS.toString());
            }
            return new ContentNewFragment();
        }

        @Override
        public int getItemCount() {
            return titles.length;
        }
    }
}
