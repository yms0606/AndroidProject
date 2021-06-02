package com.example.androidproject_team;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private ArrayList<MyItem> myItems = new ArrayList<>();

    @Override
    public int getCount() {
        return myItems.size();
    }

    @Override
    public Object getItem(int position) {
        return myItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context = parent.getContext();

        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.customlist,parent,false);
        }
        ImageView imageView = (ImageView) convertView.findViewById(R.id.image);
        TextView title = (TextView) convertView.findViewById(R.id.title);
        TextView text = (TextView) convertView.findViewById(R.id.text);

        MyItem myItem = (MyItem) getItem(position);
        imageView.setImageBitmap(myItem.getIcon());
        title.setText(myItem.getTitle());
        text.setText(myItem.getText());

        return convertView;
    }

    public void addItem(Bitmap icon, String title, String text){

        MyItem myItem = new MyItem();
        myItem.setIcon(icon);
        myItem.setTitle(title);
        myItem.setText(text);

        myItems.add(myItem);
    }
    public void clearList(){
        myItems.clear();
    }
}
