package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class ThirdFragment extends Fragment {

    public final static String name1 = "OK";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView textView;
        textView = (TextView) findViewById(R.id.textView11);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);
        textView = new TextView(this);
        textView = (TextView) findViewById(R.id.textView17);
        Intent intent1 = getIntent();
        String name1 = intent.getStringExtra("name1");
        textView.setText(name1);
        TextView textView1 = new TextView(this);

    }
    private static final String TAG = "MyApp";
    public void onMyButton1(View view){
        Toast.makeText(this,"Возврат осуществлен",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"ButtonOn");
        Intent intent = new Intent();
        EditText nameText = findViewById(R.id.editTextCar);
        String name = nameText.getText().toString();
        intent.putExtra("namecar", name);
        setResult(RESULT_OK,intent);
        finish();

    }
}