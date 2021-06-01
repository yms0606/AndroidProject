
package com.example.myapplication;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.androidproject_team.R;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TodoFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ListView listview;
        ArrayAdapter adapter;
        ArrayList<String> items = new ArrayList<>();

        View v = inflater.inflate(R.layout.fragment_todo, container, false);

        listview = (ListView) v.findViewById(R.id.todoListView);
        adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_single_choice, items);

        listview.setAdapter(adapter);

        Button buttonAdd = (Button) v.findViewById(R.id.buttonAdd);
        Button buttonDelete = (Button) v.findViewById(R.id.buttonDelete);
        Button buttonSave = (Button) v.findViewById(R.id.buttonSave2);
        buttonAdd.setEnabled(false);

        adapter.notifyDataSetChanged();

        buttonAdd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editTextNew = (EditText) getView().findViewById(R.id.editText);
                String strNew = (String) editTextNew.getText().toString();

                if (strNew.length() != 0) {
                    items.add(strNew);
                    editTextNew.setText("");
                    adapter.notifyDataSetChanged();
//                    saveItems() ;
                }
            }
        });

        buttonDelete.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                SparseBooleanArray checkedItems = listview.getCheckedItemPositions();

                int count = adapter.getCount();

                for (int i = count - 1; i >= 0; i--) {
                    if (checkedItems.get(i)) {
                        items.remove(i);
                    }
                }
                listview.clearChoices();
                adapter.notifyDataSetChanged();
            }
        });

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
                ProgressBar progress = (ProgressBar) v.findViewById(R.id.progress) ;
                progress.setProgress((value/count)*100) ;
                adapter.notifyDataSetChanged();
            }
        });

        EditText editText = (EditText) v.findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable edit) {
                Button buttonAdd = (Button) v.findViewById(R.id.buttonAdd);
                if (edit.toString().length() > 0)
                    buttonAdd.setEnabled(true);
                else
                    buttonAdd.setEnabled(false);
            }
        });

        return v;
    }

//    private final String fileName = "items.list";
    //        private void saveItems() {
//        File file = new File(getFilesDir(), fileName);
//        FileWriter fw = null;
//        BufferedWriter bufwr = null;
//
//        try {
//            fw = new FileWriter(file);
//            bufwr = new BufferedWriter(fw);
//
//            for (String str : items) {
//                bufwr.write(str);
//                bufwr.newLine();
//            }
//
//            bufwr.flush();
//        } catch (Exception e) {
//        }
//
//        try {
//            if (bufwr != null)
//                bufwr.close();
//            if (fw != null)
//                fw.close();
//        } catch (Exception e) {
//        }
//    }
//
//    private void loadItems() {
//        File file = new File(getFilesDir(), fileName);
//        FileReader fr = null;
//        BufferedReader bufrd = null;
//        String str;
//
//        if (file.exists()) {
//            try {
//                fr = new FileReader(file);
//                bufrd = new BufferedReader(fr);
//
//                while ((str = bufrd.readLine()) != null) {
//                    items.add(str);
//                }
//
//                bufrd.close();
//                fr.close();
//            } catch (Exception e) {
//            }
//        }
//    }
}
