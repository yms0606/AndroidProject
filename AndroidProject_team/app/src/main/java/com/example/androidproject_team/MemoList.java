package com.example.androidproject_team;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class MemoList extends AppCompatActivity {

    static final int GET_STRING = 1;
    EditText editText;
    ArrayAdapter<String> adapter;
    ListView listView;
    ArrayList<String> items;
    Button btnAdd, btnDel;
    private final String fileName = "items.list" ;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memolist);
        getSupportActionBar().setTitle("다이어리");


        items = new ArrayList<String>();

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        listView = (ListView) findViewById(R.id.listview);
        editText = (EditText)findViewById(R.id.editText);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnDel = (Button)findViewById(R.id.btnDel);

        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        btnAdd.setOnClickListener(listener);
        btnDel.setOnClickListener(listener);

        loadItemsFromFile();
        adapter.notifyDataSetChanged();



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                Intent intent = new Intent(MemoList.this, DiaryActivity.class);
                intent.putExtra("title", 1);
                intent.putExtra("content", 2);

                startActivityForResult(intent, GET_STRING);
                adapter.notifyDataSetChanged();

            }
        });



    }





    private View.OnClickListener listener = new View.OnClickListener() {
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.btnAdd:
                    String text = editText.getText().toString();
                    if(text.length()!=0) {
                        items.add(text);
                        editText.setText("");
                        adapter.notifyDataSetChanged();
                        saveItemsToFile();
                    }
                    break;
                case R.id.btnDel :
                    int pos;
                    pos = listView.getCheckedItemPosition();
                    if(pos!=ListView.INVALID_POSITION) {
                        items.remove(pos);
                        listView.clearChoices();
                        adapter.notifyDataSetChanged();
                        saveItemsToFile();

                    }
                    break;
            }
        }

    };

    private void saveItemsToFile() {
        File file = new File(getFilesDir(), fileName);
        FileWriter fw = null;
        BufferedWriter bufwr = null ;

        try {
            // open file.
            fw = new FileWriter(file) ;
            bufwr = new BufferedWriter(fw) ;

            for (String str : items) {
                bufwr.write(str) ;
                bufwr.newLine() ;
            }
            // write data to the file.
            bufwr.flush() ;

        } catch (Exception e) {
            e.printStackTrace() ;
        }

        try {
            // close file.
            if (bufwr != null) {
                bufwr.close();
            }

            if (fw != null) {
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace() ;
        }

    }

    private void loadItemsFromFile() {
        File file = new File(getFilesDir(), fileName) ;
        FileReader fr = null ;
        BufferedReader bufrd = null ;
        String str ;

        if (file.exists()) {
            try {
                // open file.
                fr = new FileReader(file) ;
                bufrd = new BufferedReader(fr) ;

                while ((str = bufrd.readLine()) != null) {
                    items.add(str) ;
                }

                bufrd.close() ;
                fr.close() ;
            } catch (Exception e) {
                e.printStackTrace() ;
            }
        }
    }

}