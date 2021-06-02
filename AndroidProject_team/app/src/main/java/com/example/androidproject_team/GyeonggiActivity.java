package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GyeonggiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeonggi);
        getSupportActionBar().setTitle("경기도");

        Button btSuwonhwasung = findViewById(R.id.suwonhwasung);
        btSuwonhwasung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",10);
                startActivity(intent);
            }
        });
        Button btJunmang = findViewById(R.id.junmang);
        btJunmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",11);
                startActivity(intent);
            }
        });



    }

}