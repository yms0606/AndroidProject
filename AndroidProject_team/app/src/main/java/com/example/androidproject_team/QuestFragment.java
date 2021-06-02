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

        String[] items = {"QuestA", "QuestB", "QuestC", "QuestD"};
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
