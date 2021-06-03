package com.example.androidproject_team;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //getSupportActionBar().setTitle("국내 지도");
        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(0xFF87CEFA));
//        ActionBar actionBar = getSupportActionBar();
//        actionBar.hide();

        Button btSeoul = findViewById(R.id.BtSeoul);
        Button btGangown = findViewById(R.id.BtGangown);
        Button btGyeonggi = findViewById(R.id.BtGyeonggi);
        Button btJeolla = findViewById(R.id.BtJeolla);
        Button btGyeongsang = findViewById(R.id.BtGyeongsang);
        Button btChungcheong = findViewById(R.id.BtChungcheong);

        btSeoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SeoulActivity.class);
                startActivity(intent);
            }
        });
        btGyeongsang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GyeongsangActivity.class);
                startActivity(intent);
            }
        });
        btGangown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GangwonActivity.class);
                startActivity(intent);
            }
        });

        btGyeonggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GyeonggiActivity.class);
                startActivity(intent);
            }
        });
        btJeolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), JeollaActivity.class);
                startActivity(intent);
            }
        });

        btChungcheong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ChungcheongActivity.class);
                startActivity(intent);
            }
        });
    }
}
