package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;


public class FirstFragment extends Fragment {
    private static final String TAG = "MyApp";

    public void onMyButton(View view) {
        Toast.makeText(this, "Вход выполнен", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "ButtonOn");
        EditText nameText = findViewById(R.id.editTextTextPersonName);
        EditText nameText1 = findViewById(R.id.editTextTextPersonName2);
        String name = nameText.getText().toString();
        String name1 = nameText1.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("name1", name1);
        startActivity(intent);

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getContext(), "OnCreate", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate");
    }
}