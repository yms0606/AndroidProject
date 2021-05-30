package com.example.androidproject_team;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class ListFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager manager;
    ArrayList<Mdata> mdata;

    public ListFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*recyclerView = getView().findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        //manager = new LinearLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mdata = new ArrayList<>();
        adapter = new MyAdapter(mdata);
        recyclerView.setAdapter(adapter);

        mdata.add(new Mdata("1 index",R.drawable.index1));
        mdata.add(new Mdata("2 index",R.drawable.index2));
        mdata.add(new Mdata("3 index",R.drawable.index1));
        mdata.add(new Mdata("4 index",R.drawable.index2));
        mdata.add(new Mdata("5 index",R.drawable.index1));
        */
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.fragment_list,container,false);

        recyclerView = viewGroup.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mdata = new ArrayList<>();
        adapter = new MyAdapter(mdata);
        recyclerView.setAdapter(adapter);

        mdata.add(new Mdata("1 index",R.drawable.index1));
        mdata.add(new Mdata("2 index",R.drawable.index2));
        mdata.add(new Mdata("3 index",R.drawable.index1));
        mdata.add(new Mdata("4 index",R.drawable.index2));
        mdata.add(new Mdata("5 index",R.drawable.index1));
        return viewGroup;
    }
}