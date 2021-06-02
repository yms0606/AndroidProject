package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GangwonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gangown);
        getSupportActionBar().setTitle("강원도");

        Button btGangneung = findViewById(R.id.gangneung);
        btGangneung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",1);
                startActivity(intent);
            }
        });
        Button btSokcho = findViewById(R.id.sokcho);
        btSokcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",2);
                startActivity(intent);

            }
        });
        Button btInje = findViewById(R.id.inje);
        btInje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",3);
                startActivity(intent);
            }
        });
        Button btPyeongchang = findViewById(R.id.pyeongchang);
        btPyeongchang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",4);
                startActivity(intent);
            }
        });
        Button btWonju = findViewById(R.id.wonju);
        btWonju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",5);
                startActivity(intent);
            }
        });

    }
}