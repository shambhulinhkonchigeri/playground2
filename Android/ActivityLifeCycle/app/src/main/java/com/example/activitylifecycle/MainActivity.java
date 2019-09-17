package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("onCreate", "onCreate: onCreate is started" );

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart", "onRestart: onRestart is started" );
        Toast.makeText(getApplicationContext(),"This is onRestart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart", "onStart: onStart is started" );
        Toast.makeText(getApplicationContext(),"This is onStart",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "onResume: onResume is started" );
        Toast.makeText(getApplicationContext(),"This is onResume",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "onDestroy: onDestroy is started" );
        Toast.makeText(getApplicationContext(),"This is onDestroy",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "onPause: onPause is started" );
        Toast.makeText(getApplicationContext(),"This is onPause",Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop", "onStop: onStop is started" );
        Toast.makeText(getApplicationContext(),"This is onStop",Toast.LENGTH_LONG).show();
    }
}
