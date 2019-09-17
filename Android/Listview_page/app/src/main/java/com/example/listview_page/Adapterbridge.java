package com.example.listview_page;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapterbridge extends BaseAdapter {
    ArrayList<String> arr1;
    ArrayList<String> arr2;
    ArrayList<String> arr3;
    ArrayList<String> arr4;
    Context context;

    public Adapterbridge(Context applicationContext, ArrayList<String> str, ArrayList<String> str1, ArrayList<String> str2, ArrayList<String> str3) {
        this.arr1=str;
        this.arr2=str1;
        this.arr3=str2;
        this.arr4=str3;
    }

    @Override
    public int getCount() {
        return arr1.size();
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

        View ar= LayoutInflater.from(context).inflate(R.layout.listview,viewGroup,false);
        TextView t1,t2,t3,t4;


        t1=ar.findViewById(R.id.textView);
        t2=ar.findViewById(R.id.textView2);
        t3=ar.findViewById(R.id.textView3);
        t4=ar.findViewById(R.id.textView7);


        t1.setText(arr1.get(i));
        t2.setText(arr2.get(i));
        t3.setText(arr3.get(i));
        t4.setText(arr4.get(i));



        return null;
    }
}
