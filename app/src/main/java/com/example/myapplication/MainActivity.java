package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toast.makeText(getApplicationContext(), "OnCreate", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "OnStart", Toast.LENGTH_SHORT).show();
        Log.w(TAG,"onStart");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "OnStop", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "OnDestroy", Toast.LENGTH_SHORT).show();
        Log.d(TAG,"onDestroy");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "OnPause", Toast.LENGTH_SHORT).show();
        Log.v(TAG,"onPause");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "OnResume", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onResume");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "OnRestart", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onRestart");
    }
}