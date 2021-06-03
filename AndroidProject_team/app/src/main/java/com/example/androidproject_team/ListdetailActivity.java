package com.example.androidproject_team;


import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class ListdetailActivity extends AppCompatActivity {

    private ImageView im1,im2,im3,im4;
    private TextView tv1,tv2;
    private int pos;
    private UserRepository userRepository;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdetail);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        im1 = findViewById(R.id.img1_d);
        im2 = findViewById(R.id.img2_d);
        im3 = findViewById(R.id.img3_d);
        im4 = findViewById(R.id.img4_d);
        tv1 = findViewById(R.id.title_d);
        tv2 = findViewById(R.id.content_d);
        Intent intent = getIntent();
        pos = intent.getIntExtra("pos",0);
        AppDatabase db = Room.databaseBuilder(getApplicationContext()
                ,AppDatabase.class,"db-mary").fallbackToDestructiveMigration()
                .allowMainThreadQueries().build();
        userRepository = db.userRepository();
        List<Item> items = userRepository.findAll();
        tv1.setText(items.get(pos).getTitle());
        tv2.setText(items.get(pos).getText());


        if(!items.get(pos).getImg1().equals(" ")) {
            Uri uri = Uri.parse(items.get(pos).getImg1());
            Log.d("uri","url="+uri.toString()+"들어옴");
            try {
                InputStream in = getContentResolver().openInputStream(uri);
                im1.setImageBitmap(BitmapFactory.decodeStream(in));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else
            im1.setImageBitmap(BitmapFactory.decodeResource(getApplicationContext().getResources()
                    ,R.drawable.index1));

        Uri uri = Uri.parse(items.get(pos).getImg2());
        Log.d("uri","url="+uri.toString()+"들어옴");
        try {
            InputStream in = getContentResolver().openInputStream(uri);
            im2.setImageBitmap(BitmapFactory.decodeStream(in));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        uri = Uri.parse(items.get(pos).getImg3());
        Log.d("uri","url="+uri.toString()+"들어옴");
        try {
            InputStream in = getContentResolver().openInputStream(uri);
            im3.setImageBitmap(BitmapFactory.decodeStream(in));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        uri = Uri.parse(items.get(pos).getImg4());
        Log.d("uri","url="+uri.toString()+"들어옴");
        try {
            InputStream in = getContentResolver().openInputStream(uri);
            im4.setImageBitmap(BitmapFactory.decodeStream(in));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}