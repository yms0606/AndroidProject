package kr.co.company.mpteampj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DetailArea extends AppCompatActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gangown_activity);

        Button sokcho = (Button) findViewById(R.id.sokcho);
        sokcho.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(DetailArea.this, ClickArea.class);
                startActivity(intent);
                finish();
            }
        });

        Button wonju = (Button) findViewById(R.id.wonju);
        wonju.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(DetailArea.this, ClickArea.class);
                startActivity(intent);
                finish();
            }
        });
        Button inje = (Button) findViewById(R.id.inje);
        inje.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(DetailArea.this, ClickArea.class);
                startActivity(intent);
                finish();
            }
        });
        Button pyeongchang = (Button) findViewById(R.id.pyeongchang);
        pyeongchang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(DetailArea.this, ClickArea.class);
                startActivity(intent);
                finish();
            }
        });
        Button gangneung = (Button) findViewById(R.id.gangneung);
        gangneung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(DetailArea.this, ClickArea.class);
                startActivity(intent);
                finish();
            }
        });

        setContentView(R.layout.chungcheong_activity);

//        Button sokcho = (Button) findViewById(R.id.sokcho);
//        sokcho.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                Intent intent = new Intent(DetailArea.this, ClickArea.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        setContentView(R.layout.gyeonggi_activity);

//        Button sokcho = (Button) findViewById(R.id.sokcho);
//        sokcho.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                Intent intent = new Intent(DetailArea.this, ClickArea.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        setContentView(R.layout.gyeongsang_activity);

//        Button sokcho = (Button) findViewById(R.id.sokcho);
//        sokcho.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                Intent intent = new Intent(DetailArea.this, ClickArea.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        setContentView(R.layout.jeolla_activity);

//        Button sokcho = (Button) findViewById(R.id.sokcho);
//        sokcho.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                Intent intent = new Intent(DetailArea.this, ClickArea.class);
//                startActivity(intent);
//                finish();
//            }
//        });

        setContentView(R.layout.seoul_activity);

//        Button sokcho = (Button) findViewById(R.id.sokcho);
//        sokcho.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//
//                Intent intent = new Intent(DetailArea.this, ClickArea.class);
//                startActivity(intent);
//                finish();
//            }
//        });
    }
}
