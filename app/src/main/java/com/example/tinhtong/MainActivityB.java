package com.example.tinhtong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivityB extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);

        textView = (TextView)
                findViewById(R.id.textView);

        //Lấy dữ liệu
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("qString"));
    }
    public void onClick(View view) {
        finish();
    }
}