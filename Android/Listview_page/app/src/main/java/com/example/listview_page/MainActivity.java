package com.example.listview_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2,textView3,textView7,textView8;
    ImageView imageView;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> str=new ArrayList<>();
//        str.add("abc");
        str.add("PUR-2019-056");
        str.add("pur-2019-056");
        str.add("pur-2019-056");

        ArrayList<String> str1=new ArrayList<>();
        str1.add("submitted on");
        str1.add("submitted on");
        str1.add("submitted on");
//        str1.add("bba");
        ArrayList<String> str2=new ArrayList<>();
        str2.add("06-july-2019");
        str2.add("06-july-2019");
        str2.add("06-july-2019");
        ArrayList<String> str3=new ArrayList<>();
        str3.add("Approved");
        str3.add("Approved");
        str3.add("Approved");

        listView=findViewById(R.id.listView);
        Adapterbridge adapterbridge=new Adapterbridge(getApplicationContext(),str, str1,str2,str3);


        listView.setAdapter((ListAdapter) adapterbridge);


    }
}
