package com.example.androidproject_team;

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



        mdata.add(new Mdata("속초 해수욕장",R.drawable.sokcho_beach));
        mdata.add(new Mdata("속초 동명항",R.drawable.sokcho_dongmyeongport));
        mdata.add(new Mdata("속초 엑스포타워",R.drawable.sokcho_expotower));
        mdata.add(new Mdata("속초 영금정",R.drawable.sokcho_yeonggeumjeong));



        mdata.add(new Mdata("원주 출렁다리",R.drawable.wonju_bridge));
        mdata.add(new Mdata("원주 박물관산",R.drawable.wonju_museummountain));
        mdata.add(new Mdata("원주 레일파크",R.drawable.wonju_railpark));
        mdata.add(new Mdata("원주 맛집 '운채'",R.drawable.wonju_restaurant1));



//        mdata.add(new Mdata("강릉 안반데기",R.drawable.gangneung_anbandegi));
//        mdata.add(new Mdata("강릉 도깨비 촬영지",R.drawable.gangneung_goblindrama));
//        mdata.add(new Mdata("강릉 하슬라아트월드",R.drawable.gangneung_hasllaartworld));
//        mdata.add(new Mdata("강릉 정동진 레일바이크",R.drawable.gangneung_jeongdongjin_rail));
//
//        mdata.add(new Mdata("평창 동물농장",R.drawable.pyeongchang_animalfarm));
//        mdata.add(new Mdata("평창 예술박물관",R.drawable.pyeongchang_artmuseum));
//        mdata.add(new Mdata("평창 양떼목장",R.drawable.pyeongchang_sheep));
//        mdata.add(new Mdata("평창 스카이워크",R.drawable.pyeongchang_skywalk));
//
//        mdata.add(new Mdata("원주 출렁다리",R.drawable.wonju_bridge));
//        mdata.add(new Mdata("원주 박물관산",R.drawable.wonju_museummountain));
//        mdata.add(new Mdata("원주 레일파크",R.drawable.wonju_railpark));
//        mdata.add(new Mdata("원주 맛집 '운채'",R.drawable.wonju_restaurant1));
//
//        mdata.add(new Mdata("인제 속삭이는 자작나무숲",R.drawable.inje_forest));
//        mdata.add(new Mdata("인제 비밀의 정원",R.drawable.inje_secretofgarden));
//        mdata.add(new Mdata("인제 X게임 리조트",R.drawable.inje_xgameresort));
//        mdata.add(new Mdata("인제 클래식카박물관",R.drawable.inje_classiccar));



        return viewGroup;

    }
}
