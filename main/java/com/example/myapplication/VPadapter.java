package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class VPadapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> list= new ArrayList<>();
    private ArrayList<String> title = new ArrayList<>();

    public CharSequence getPageTitle(int position){
        return title.get(position);
    }

    public VPadapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    public void addFrag(Fragment f,String s){
        list.add(f);
        title.add(s);
    }
}
