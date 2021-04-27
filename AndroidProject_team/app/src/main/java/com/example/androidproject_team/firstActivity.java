package kr.co.company.mpteampj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class firstActivity extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map_activity);

        Button chungcheong = (Button) findViewById(R.id.Chungcheong);
        chungcheong.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(firstActivity.this, DetailArea.class);
                startActivity(intent);
                finish();
            }
        });

        Button seoul = (Button) findViewById(R.id.Seoul);
        seoul.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(firstActivity.this, DetailArea.class);
                startActivity(intent);
                finish();
            }
        });
        Button gyeonggi = (Button) findViewById(R.id.Gyeonggi);
        gyeonggi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(firstActivity.this, DetailArea.class);
                startActivity(intent);
                finish();
            }
        });
        Button jeolla = (Button) findViewById(R.id.Jeolla);
        jeolla.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(firstActivity.this, DetailArea.class);
                startActivity(intent);
                finish();
            }
        });
        Button gyeongsang = (Button) findViewById(R.id.Gyeongsang);
        gyeongsang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(firstActivity.this, DetailArea.class);
                startActivity(intent);
                finish();
            }
        });
        Button gangown = (Button) findViewById(R.id.Gangown);
        gangown.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(firstActivity.this, DetailArea.class);
                startActivity(intent);
                finish();
            }
        });


    }

}
