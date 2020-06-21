package com.example.mazito_game.ui.fragment.game;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.mazito_game.R;
import com.example.mazito_game.databinding.FragmentLogicGameBinding;

import java.util.Random;
import java.util.TimerTask;

public class LogicGameFragment extends Fragment {

    Boolean f = true;
    int count = 0;
    ImageView[] images = new ImageView[36];

    public static LogicGameFragment newInstance() {

        Bundle args = new Bundle();

        LogicGameFragment fragment = new LogicGameFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private ImageView[] imageViews = new ImageView[5];


    ProgressBar progressBar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentLogicGameBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_logic_game, container, false);

       progressBar = binding.myProgress;

       reverseTimer(10, progressBar);
//
//        ObjectAnimator anim = ObjectAnimator.ofInt(progressBar, "progress", 8000,0);
//        anim.setDuration(8000);
//        anim.start();

        Bundle bundle = this.getArguments();
        int i = 10;
        if (bundle != null) {
            i = bundle.getInt("key", 0);
        }

        imageViews[0] = binding.imageViewFirst;
        imageViews[1] = binding.imageViewPlayer;
        imageViews[2] = binding.imageViewThird;
        imageViews[3] = binding.imageView4;
        imageViews[4] = binding.imageView5;

        for(int j = 0; j < i; j++){
            imageViews[j].setVisibility(View.VISIBLE);
        }
        for(int j = 0; j < 5; j++){
            if(imageViews[j].getVisibility() == View.GONE){
                imageViews[j].setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_baseline_close_48));
            }
        }

    initCard(binding);



        binding.addCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();

                int key = random.nextInt(36);

                ImageView image1 = images[key];

                ConstraintSet set = new ConstraintSet();
                set.connect(image1.getId(),ConstraintSet.BOTTOM, R.id.imageViewPlayer, ConstraintSet.TOP);
                set.connect(image1.getId(), ConstraintSet.START, R.id.imageViewThird, ConstraintSet.END );
                set.setMargin(image1.getId(), ConstraintSet.START, count * binding.imageViewCardDeck.getWidth() + 8);

                count += 1;

                set.setVisibility(image1.getId(), ConstraintSet.VISIBLE);
                set.constrainWidth(image1.getId(), binding.imageViewCardDeck.getWidth());
                set.constrainHeight(image1.getId(), binding.imageViewCardDeck.getHeight());
                set.applyTo(binding.main);

                binding.imageViewPlayer.setVisibility(View.GONE);
                binding.imageViewPlayer.setVisibility(View.VISIBLE);
            }
        });

        return binding.getRoot();
    }

    private void initCard(FragmentLogicGameBinding binding){

        ImageView image = binding.imageViewCardDeck;

        for(int j = 0; j < 36; j++){
            images[j] = new ImageView(getContext());
            images[j].setId(View.generateViewId());
            images[j].setImageResource(R.drawable.card_front);
            binding.main.addView(images[j]);
            ConstraintSet set = new ConstraintSet();
            set.clone(binding.main);
            set.connect(images[j].getId(), ConstraintSet.RIGHT, ConstraintSet.PARENT_ID, ConstraintSet.RIGHT);
            set.constrainWidth(images[j].getId(), binding.imageViewCardDeck.getWidth());
            set.constrainHeight(images[j].getId(), binding.imageViewCardDeck.getHeight());
            set.applyTo(binding.main);
        }

    }

    public void reverseTimer(int Seconds,final ProgressBar tv){

        new CountDownTimer(10000, 5) {

            public void onTick(long millisUntilFinished) {
                int seconds = (int) (millisUntilFinished / 1000);
                int minutes = seconds / 60;
                seconds = seconds % 60;
                tv.setProgress(((int) millisUntilFinished) / 100 );
            }

            public void onFinish() {
                tv.setVisibility(View.GONE);
            }
        }.start();
    }

}
