package com.example.mazito_game.modelFake;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class Progress {

    private Integer image;
    private Integer checkUse;
    private Integer checkItog;
    private String description;

    public Progress(){

    }

    public Progress(Integer image, Integer checkUse, Integer checkItog, String description) {
        this.image = image;
        this.checkUse = checkUse;
        this.checkItog = checkItog;
        this.description = description;
    }

    public String getProgressInfo(){
        return checkUse + "/"  +checkItog;
    }

    public Integer getImage() {
        return image;
    }
    public void setImage(Integer image) {
        this.image = image;
    }

    @BindingAdapter("android:src")
    public static void setImageResource(ImageView imageView, int resource){
        imageView.setImageResource(resource);
    }

    public Integer getCheckUse() {
        return checkUse;
    }

    public void setCheckUse(Integer checkUse) {
        this.checkUse = checkUse;
    }

    public Integer getCheckItog() {
        return checkItog;
    }

    public void setCheckItog(Integer checkItog) {
        this.checkItog = checkItog;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
