package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.androidproject_team.R;

public class SeoulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seoul);

        Button btHondae = findViewById(R.id.hongdae);
        btHondae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
        Button btGeondae = findViewById(R.id.geondae);
        btGeondae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
        Button btNamsan = findViewById(R.id.namsan);
        btNamsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
        Button btGangnam = findViewById(R.id.gangnam);
        btGangnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });

    }
}
