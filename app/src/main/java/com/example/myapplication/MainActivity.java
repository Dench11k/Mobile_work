package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       if(savedInstanceState == null){
           getSupportFragmentManager().beginTransaction()
                   .setReorderingAllowed(true)
                   .add(R.id.fragmentContainerView,FirstFragment.class,null)
                   .commit();
       }
    }

}