package com.example.mazito_game.utils;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class ImageLoader {

    public static void load(Fragment fragment, ImageView view,String url){
        Glide
            .with(fragment)
            .load(url)
            .centerCrop()
            .into(view);
    }

}
