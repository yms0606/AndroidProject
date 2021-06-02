package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeoulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seoul);
        getSupportActionBar().setTitle("서울");

        Button btHondae = findViewById(R.id.hongdae);
        btHondae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",6);
                startActivity(intent);
            }
        });
        Button btGeondae = findViewById(R.id.geondae);
        btGeondae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",7);
                startActivity(intent);
            }
        });
        Button btNamsan = findViewById(R.id.namsan);
        btNamsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",8);
                startActivity(intent);
            }
        });
        Button btGangnam = findViewById(R.id.gangnam);
        btGangnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                intent.putExtra("listCode",9);
                startActivity(intent);
            }
        });

    }
}
