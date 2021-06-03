package com.example.androidproject_team;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.room.Room;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class DiarylistActivity extends AppCompatActivity {

    private UserRepository userRepository;
    String place;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diarylist);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView listView = findViewById(R.id.diarylist);
        CustomAdapter adapter = new CustomAdapter();
        Intent intent = getIntent();

        AppDatabase db = Room.databaseBuilder(getApplicationContext()
                ,AppDatabase.class,"db-mary").fallbackToDestructiveMigration()
                .allowMainThreadQueries().build();
        userRepository = db.userRepository();

        List<Item> items = userRepository.findAll();

        Log.d("size", String.valueOf(items.size()));

        for(int i=0;i<items.size();i++){
            if(!items.get(i).getImg1().equals(" ")) {
                Uri uri = Uri.parse(items.get(i).getImg1());
                Log.d("uri","url="+uri.toString()+"들어옴");
                try {
                    InputStream in = getContentResolver().openInputStream(uri);
                    bitmap = BitmapFactory.decodeStream(in);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else
                bitmap = BitmapFactory.decodeResource(getApplicationContext().getResources()
                        ,R.drawable.index1);
            selectCode(items.get(i).getCode());
            adapter.addItem(bitmap,items.get(i).getTitle(),place);
        }
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(getApplicationContext(),ListdetailActivity.class);
                intent1.putExtra("pos",position);
                startActivity(intent1);
            }
        });


    }
    public void selectCode(int code){
        switch (code){
            case 1: place = "강릉"; break; case 2: place = "속초"; break; case 3: place = "인제"; break;
            case 4: place = "평창"; break; case 5: place = "원주"; break; case 6: place = "송파"; break;
            case 7: place = "강남"; break; case 8: place = "중구"; break; case 9: place = "종로"; break;
            case 10: place = "파주"; break; case 11: place = "광명"; break; case 12: place = "포천"; break;
            case 13: place = "안산"; break; case 14: place = "충남"; break; case 15: place = "세종"; break;
            case 16: place = "충북"; break; case 17: place = "전주"; break; case 18: place = "여수"; break;
            case 19: place = "부산"; break; case 20: place = "대구"; break; case 21: place = "울산"; break;
        }
    }
}