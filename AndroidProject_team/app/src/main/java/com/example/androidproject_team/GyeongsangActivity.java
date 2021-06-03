package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GyeongsangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongsang);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button btBusan = findViewById(R.id.busan);
        btBusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",19);
                startActivity(intent);
            }
        });
        Button btDaegu = findViewById(R.id.daegu);
        btDaegu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",20);
                startActivity(intent);
            }
        });
        Button btUlsan = findViewById(R.id.ulsan);
        btUlsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",21);
                startActivity(intent);
            }
        });
    }
}
