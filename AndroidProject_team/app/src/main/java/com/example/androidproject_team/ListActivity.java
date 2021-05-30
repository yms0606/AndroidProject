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
    //RecyclerView recyclerView;
    //RecyclerView.Adapter adapter;
    //RecyclerView.LayoutManager manager;
    //ArrayList<Mdata> mdata;
    ViewPager viewPager;
    VPadapter vPadapter;
    TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        viewPager = findViewById(R.id.viewpager);
        tab = findViewById(R.id.tabLayout);
        vPadapter = new VPadapter(getSupportFragmentManager());
        vPadapter.addFrag(new ListFragment(),"List");
        vPadapter.addFrag(new QuestFragment(),"Quest");
        vPadapter.addFrag(new TodoFragment(),"Todo");
        viewPager.setAdapter(vPadapter);
        tab.setupWithViewPager(viewPager);



        /*recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        mdata = new ArrayList<>();
        adapter = new MyAdapter(mdata);
        recyclerView.setAdapter(adapter);

        mdata.add(new Mdata("1 index",R.drawable.index1));
        mdata.add(new Mdata("2 index",R.drawable.index2));
        mdata.add(new Mdata("3 index",R.drawable.index1));
        mdata.add(new Mdata("4 index",R.drawable.index2));
        mdata.add(new Mdata("5 index",R.drawable.index1));
        */

        Button btWrite = findViewById(R.id.write);
        btWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),DiaryActivity.class);
                startActivity(intent);
            }
        });
    }
}