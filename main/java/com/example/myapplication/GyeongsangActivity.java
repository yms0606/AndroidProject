package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.androidproject_team.ListActivity;
import com.example.androidproject_team.R;

public class GyeongsangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gyeongsang);
        
        Button btBusan = findViewById(R.id.busan);
        btBusan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ListActivity.class);
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
