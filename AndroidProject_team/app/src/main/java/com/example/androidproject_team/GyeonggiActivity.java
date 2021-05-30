package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GyeonggiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeonggi);
        
        Button btSuwonhwasung = findViewById(R.id.suwonhwasung);
        btSuwonhwasung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
        Button btJunmang = findViewById(R.id.junmang);
        btJunmang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
