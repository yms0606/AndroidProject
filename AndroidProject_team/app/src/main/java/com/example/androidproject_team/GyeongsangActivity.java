package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GyeongsangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongsang);
        
        Button btBusan = findViewById(R.id.busan);
        btBusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
        Button btDaegu = findViewById(R.id.daegu);
        btDaegu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
        Button btUlsan = findViewById(R.id.ulsan);
        btUlsan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ListActivity.class);
                startActivity(intent);
            }
        });
    }
}
