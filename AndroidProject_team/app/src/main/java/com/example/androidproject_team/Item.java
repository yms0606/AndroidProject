package com.example.androidproject_team;


import android.graphics.drawable.Drawable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Item {
    @PrimaryKey (autoGenerate = true)
    private int uid;
    private int code;
    private String img1 ="",img2 ="",img3 = "",img4="";
    private String title;
    private String text;

    public Item(String title, String text){
        this.title=title;
        this.text=text;
    }
    public int getUid(){
        return this.uid;
    }
    public void setUid(int uid){
        this.uid = uid;
    }
    public int getCode(){return this.code;}
    public void setCode(int code){this.code = code;}

    public void setImg1(String s){this.img1 = s;}
    public void setImg2(String s){this.img2 = s;}
    public void setImg3(String s){this.img3 = s;}
    public void setImg4(String s){this.img4 = s;}
    public String getImg1(){return img1;}
    public String getImg2(){return img2;}
    public String getImg3(){return img3;}
    public String getImg4(){return img4;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
