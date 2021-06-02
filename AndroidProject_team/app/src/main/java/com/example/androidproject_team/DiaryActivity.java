package com.example.androidproject_team;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class DiaryActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 0;
    private ImageView img1,img2,img3,img4;
    private Uri uri1,uri2,uri3,uri4;
    private UserRepository userRepository;
    EditText title, content;
    int i = 0,code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        getSupportActionBar().setTitle("다이어리 작성");

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

        Intent intent = getIntent();
        code = intent.getIntExtra("listCode",1);

        /*AppDatabase db = Room.databaseBuilder(getApplicationContext()
                , AppDatabase.class, "db-mary").fallbackToDestructiveMigration()
                .allowMainThreadQueries().build();
        userRepository = db.userRepository();
        List<Item> it = userRepository.findAll();
        //Log.d("size",it.get(0).getTitle() + " "+it.get(0).getText());
        //userRepository.delete(it.get(0));
        Log.d("size",String.valueOf(it.size()));
        */

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,REQUEST_CODE);
                i = 1;
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,REQUEST_CODE);
                i = 2;
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,REQUEST_CODE);
                i = 3;
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(intent.ACTION_GET_CONTENT);
                startActivityForResult(intent,REQUEST_CODE);
                i = 4;
            }
        });


        title = (EditText)findViewById(R.id.title);
        content = (EditText)findViewById(R.id.content);

        Button save_btn = (Button)findViewById(R.id.save);

        save_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if(title.getText().toString().length() !=0 && content.getText().toString().length() !=0) {
                    AppDatabase db = Room.databaseBuilder(getApplicationContext()
                            , AppDatabase.class, "db-mary").fallbackToDestructiveMigration()
                            .allowMainThreadQueries().build();
                    userRepository = db.userRepository();

                    Item item = new Item(title.getText().toString(), content.getText().toString());
                    if(uri1 != null)
                        item.setImg1(uri1.toString());
                    else
                        item.setImg1(" ");
                    if(uri2 != null)
                        item.setImg2(uri2.toString());
                    else
                        item.setImg2(" ");
                    if(uri3 != null)
                        item.setImg3(uri3.toString());
                    else
                        item.setImg3(" ");
                    if(uri4 != null)
                        item.setImg4(uri4.toString());
                    else
                        item.setImg4(" ");

                    Log.d("uri",item.getImg1()+"/"+item.getImg2()
                            +"/"+item.getImg3()+"/"+item.getImg4());

                    item.setCode(code);
                    userRepository.insert(item);
                    finish();
                }
                else
                    Toast.makeText(getApplicationContext(),"공백이 있습니다.",Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE){
            if(resultCode == RESULT_OK){

                try {
                    InputStream in = getContentResolver().openInputStream(data.getData());
                    Bitmap img= BitmapFactory.decodeStream(in);
                    in.close();

                    switch(i) {
                        case 1:
                            img1.setImageBitmap(img);
                            uri1 = data.getData();
                            break;
                        case 2:
                            img2.setImageBitmap(img);
                            uri2 = data.getData();
                            break;
                        case 3:
                            img3.setImageBitmap(img);
                            uri3 = data.getData();
                            break;
                        case 4:
                            uri4 = data.getData();
                            img4.setImageBitmap(img);
                            break;
                        default: break;
                    }
                }catch (Exception e){}
            }
            else if(resultCode == RESULT_CANCELED){
                Toast.makeText(this,"선택 취소",Toast.LENGTH_SHORT).show();
            }
        }
    }


}
