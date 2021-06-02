package com.example.androidproject_team;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.net.VpnManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    ListFragment listFragment;
    ViewPager viewPager;
    VPadapter vPadapter;
    TabLayout tab;
    int code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().setTitle("List, Quest, Todo");

        listFragment = new ListFragment();

        Intent intent = getIntent();
        code = intent.getIntExtra("listCode",0);

        Bundle bundle = new Bundle();
        bundle.putInt("listCode",code);
        listFragment.setArguments(bundle);

        viewPager = findViewById(R.id.viewpager);
        tab = findViewById(R.id.tabLayout);

        vPadapter = new VPadapter(getSupportFragmentManager());
        vPadapter.addFrag(listFragment,"List");
        vPadapter.addFrag(new QuestFragment(),"Quest");
        vPadapter.addFrag(new TodoFragment(),"Todo");

        viewPager.setAdapter(vPadapter);
        tab.setupWithViewPager(viewPager);



        Button btWrite = findViewById(R.id.write);
        btWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), DiaryActivity.class);
                intent.putExtra("listCode",code);
                startActivity(intent);

            }
        });
        Button btgoList = findViewById(R.id.goList);
        btgoList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),DiarylistActivity.class);
                intent.putExtra("listCode",code);
                startActivity(intent);
            }
        });
    }
}