package com.example.mazito_game.ui.fragment.raiting;

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
import com.example.mazito_game.databinding.FragmentRaitingBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class RaitingFragment extends Fragment {

    String[] title = new String[]{"Победы", "Число побед", "Шкала ЭЛЛО"};

    public static RaitingFragment newInstance() {

        Bundle args = new Bundle();

        RaitingFragment fragment = new RaitingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentRaitingBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_raiting, container, false);

        binding.viewPager.setAdapter(new RaitingFragment.ViewPagerFragmentAdapter(getActivity()));

        binding.tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        binding.tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);

        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab,position) -> tab.setText(title[position])).attach();

        return binding.getRoot();
    }

    class ViewPagerFragmentAdapter extends FragmentStateAdapter {

        public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            switch (position) {
                case 0:
                    return RaitingCardInfo.newInstance();
                case 1:
                    return RaitingCardInfo.newInstance();
                case 2:
                    return RaitingCardInfo.newInstance();
            }
            return RaitingCardInfo.newInstance();
        }

        @Override
        public int getItemCount() {
            return title.length;
        }
    }

}
