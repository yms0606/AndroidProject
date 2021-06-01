package com.example.androidproject_team;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ArrayList<Mdata> mdata;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;
        public ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
    public MyAdapter(ArrayList<Mdata> data){
        mdata = data;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
                TextView t = holder.itemView.findViewById(R.id.text);
                ImageView i = holder.itemView.findViewById(R.id.image);
                t.setText(mdata.get(position).text);
                i.setImageResource(mdata.get(position).img);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }
}
class Mdata{
    public String text;
    public int img;
    public Mdata(String t,int i){
        this.text = t;
        this.img = i;
    }
}