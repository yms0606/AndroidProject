package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btSeoul = findViewById(R.id.BtSeoul);
        Button btGang = findViewById(R.id.BtGangown);
        Button btGyeong = findViewById(R.id.BtGyeonggi);
        Button btJunju = findViewById(R.id.BtJunju);
        Button btBusan = findViewById(R.id.BtBusan);

        btSeoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SeoulActivity.class);
                startActivity(intent);
            }
        });
        btBusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),BusanActivity.class);
                startActivity(intent);
            }
        });
        btGang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GangownActivity.class);
                startActivity(intent);
            }
        });
        btGyeong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GyeonggiActivity.class);
                startActivity(intent);
            }
        });
        btJunju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JunjuActivity.class);
                startActivity(intent);
            }
        });
    }
}
