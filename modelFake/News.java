package com.example.mazito_game.modelFake;

import android.media.Image;

public class News {

    private String name;
    private CategoryNews type;
    private Image urlIcon;
    private String date;
    private String description;
    private Image urlImage;

    public News(){

    }

    public News(String name, CategoryNews type, Image urlIcon, String date, String description, Image urlImage) {
        this.name = name;
        this.type = type;
        this.urlIcon = urlIcon;
        this.date = date;
        this.description = description;
        this.urlImage = urlImage;
    }

    public News(String name, CategoryNews type, String date, String description) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.description = description;
    }

    public CategoryNews getType() {
        return type;
    }

    public void setType(CategoryNews type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getUrlIcon() {
        return urlIcon;
    }

    public void setUrlIcon(Image urlIcon) {
        this.urlIcon = urlIcon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(Image urlImage) {
        this.urlImage = urlImage;
    }
}
