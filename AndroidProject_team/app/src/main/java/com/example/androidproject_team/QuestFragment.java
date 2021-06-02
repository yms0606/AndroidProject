package com.example.androidproject_team;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.androidproject_team.R;

import java.util.ArrayList;
import java.util.Arrays;


public class QuestFragment extends Fragment{

    public QuestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_quest, container, false);

        String[] items = {"부산 감천문화마을에서 어린왕자와 사진 찍기", "교복 입고 놀이공원 다녀오기", "한옥마을에서 한복 입고 돌아다니기", "아쿠아리움에서 가오리와 사진 찍기", "나홀로나무에서 착시사진 찍기 ", 
                          "캠핑장에서 불멍하기", "남산타워에서 자물쇠 채우기", "예당호 출렁다리 건너보기", "바다낚시 후 회 떠먹기", "구름산 쉬지않고 등산해보기", "연인과 함께 평강랜드 핑크뮬리보기", "탄도항에서 노을 감상", "용두산 공원 전망대 올라가보기", 
                          "인제 X게임리조트에서 번지점프하기", "강릉 도깨비 촬영지에서 도깨비처럼 사진찍기", "평창 양떼목장가서 양한테 밥주기"};
        ListView listview = (ListView) v.findViewById(R.id.questlistview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_single_choice, items);
        listview.setAdapter(adapter);

        Button buttonSave = (Button) v.findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                SparseBooleanArray checkedItems = listview.getCheckedItemPositions();
                int count = adapter.getCount();
                int value = 0;

                for (int i = count - 1; i >= 0; i--) {
                    if (checkedItems.get(i)) {
                        value += 1;
                    }
                }
                int perc = (value/count)*100;
                ProgressBar progress = (ProgressBar) v.findViewById(R.id.progress) ;
//                progress.setIndeterminate(true);
                progress.setProgress(perc) ;
                adapter.notifyDataSetChanged();
            }
        });

        return v;
    }

}
