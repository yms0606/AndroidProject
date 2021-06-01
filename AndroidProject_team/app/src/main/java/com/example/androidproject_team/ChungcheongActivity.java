package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChungcheongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chungcheong);
        getSupportActionBar().setTitle("충청도");

        Button btSejong = findViewById(R.id.sejong);
        btSejong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
    }
}