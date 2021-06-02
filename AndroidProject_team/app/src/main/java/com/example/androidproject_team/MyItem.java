package com.example.androidproject_team;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public class MyItem {
    private Bitmap icon;
    private String title;
    private String text;

    public Bitmap getIcon() {
        return icon;
    }

    public void setIcon(Bitmap icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
