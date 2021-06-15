package com.example.listui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdopter extends BaseAdapter {



    Context active;
    String text_arr[];
    int img_arr[];

    public customAdopter(Context context,String text[],int img[]){

    active = context;
    text_arr = text;
    img_arr = img;

    }



    @Override
    public int getCount() {
        return text_arr.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(active);
        view = layoutInflater.inflate(R.layout.layout,null);
        TextView textView = view.findViewById(R.id.listtext);
        ImageView imageView = view.findViewById(R.id.listimg);

        textView.setText(text_arr[i]);
        imageView.setImageResource(img_arr[i]);



        return view;
    }
}
