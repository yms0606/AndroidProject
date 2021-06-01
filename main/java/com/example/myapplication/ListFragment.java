package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

//import com.example.androidproject_team.Mdata;
//import com.example.androidproject_team.MyAdapter;
import com.example.androidproject_team.R;

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


        mdata.add(new Mdata("속초 해수욕장",R.drawable.sokcho_beach));
        mdata.add(new Mdata("속초 동명항",R.drawable.sokcho_dongmyeongport));
        mdata.add(new Mdata("속초 엑스포타워",R.drawable.sokcho_expotower));
        mdata.add(new Mdata("속초 영금정",R.drawable.sokcho_yeonggeumjeong));

//        gangwon.add(new Mdata("5 index",R.drawable.gangneung_anbandegi));
//        gangwon.add(new Mdata("5 index",R.drawable.gangneung_goblindrama));
//        gangwon.add(new Mdata("5 index",R.drawable.gangneung_hasllaartworld));
//        gangwon.add(new Mdata("5 index",R.drawable.gangneung_jeongdongjin_rail));
//
//        gangwon.add(new Mdata("5 index",R.drawable.pyeongchang_animalfarm));
//        gangwon.add(new Mdata("5 index",R.drawable.pyeongchang_artmuseum));
//        gangwon.add(new Mdata("5 index",R.drawable.pyeongchang_sheep));
//        gangwon.add(new Mdata("5 index",R.drawable.pyeongchang_skywalk));

//        wonju.add(new Mdata("5 index",R.drawable.wonju_bridge));
//        wonju.add(new Mdata("5 index",R.drawable.wonju_museummountain));
//        wonju.add(new Mdata("5 index",R.drawable.wonju_railpark));
//        wonju.add(new Mdata("5 index",R.drawable.wonju_restaurant1));
//
//        gangwon.add(new Mdata("5 index",R.drawable.inje_forest));
//        gangwon.add(new Mdata("5 index",R.drawable.inje_secretofgarden));
//        gangwon.add(new Mdata("5 index",R.drawable.inje_xgameresort));
//        gangwon.add(new Mdata("5 index",R.drawable.inje_classiccar));



        return viewGroup;
    }
}
