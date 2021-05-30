package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class JeollaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeolla);
        
        Button btJeonju = findViewById(R.id.jeonju);
        btJeonju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });

        Button btYeosu = findViewById(R.id.yeosu);
        btYeosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
