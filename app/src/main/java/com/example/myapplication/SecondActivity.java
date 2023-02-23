package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
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
                        TextView nameText = findViewById(R.id.textView9);
                        TextView nameText1 = findViewById(R.id.textView10);
                        String name = nameText.getText().toString();
                        String name1 = nameText1.getText().toString();
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        intent.putExtra("name", name);
                        intent.putExtra("name1", name1);
                        SecondActivity.this.startActivity(intent);
                        Log.i(TAG, "ButtonOn_1");

                    }
                }
        );
    }


}