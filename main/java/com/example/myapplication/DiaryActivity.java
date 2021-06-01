package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.androidproject_team.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DiaryActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 0;
    private ImageView img1,img2,img3,img4;
    String shared = "file";
    EditText title, content;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);

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
//        save.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//
//            }
//        });

        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        String value1 = sharedPreferences.getString("txttitle", "");
        String value2 = sharedPreferences.getString("txtcontent", "");

        title.setText(value1);
        content.setText(value2);




    }

    protected void onDestroy() {
        super.onDestroy();
        SharedPreferences sharedPreferences = getSharedPreferences(shared, 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        String value1 = title.getText().toString();
        String value2 = content.getText().toString();
        editor.putString("txttitle", value1);
        editor.putString("txtcontent", value2);

        editor.commit();
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
                            img1.setImageBitmap(img);break;
                        case 2:
                            img2.setImageBitmap(img);break;
                        case 3:
                            img3.setImageBitmap(img);break;
                        case 4:
                            img4.setImageBitmap(img);break;
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
