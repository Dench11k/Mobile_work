package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class SecondFragment extends Fragment {

    private static final String TAG = "MyApp";
    TextView textView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView image = (ImageView) findViewById(R.id.imageView2);
        textView = (TextView) findViewById(R.id.textView9);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        textView.setText(name);
        TextView textView = new TextView(this);
        textView = (TextView) findViewById(R.id.textView10);
        Intent intent1 = getIntent();
        String name1 = intent.getStringExtra("name1");
        textView.setText(name1);
        TextView textView1 = new TextView(this);

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Log.i(TAG, "ButtonOn_1");
                        Toast.makeText(SecondActivity.this,"Переход осуществлен",Toast.LENGTH_SHORT).show();
                        TextView nameText = findViewById(R.id.textView9);
                        TextView nameText1 = findViewById(R.id.textView10);
                        String name = nameText.getText().toString();
                        String name1 = nameText1.getText().toString();
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        intent.putExtra("name", name);
                        intent.putExtra("name1", name1);
                        startActivityForResult(intent,1);
                    }
                }
        );
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView info = findViewById(R.id.textView20);
        if(resultCode == RESULT_OK ){
            String car = data.getStringExtra("namecar");
            info.setText(car);
        }
    }