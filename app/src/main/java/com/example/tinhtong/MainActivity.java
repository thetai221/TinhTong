package com.example.tinhtong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.editText1);
    }

    public void onClick(View view) {
        int n = Integer.parseInt(editText1.getText().toString());
        double s = 0f;

        for (int i=1; i<=n ; i++)
            s += (double) (i/n);

        //Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivityB.class);
        intent.putExtra( "qString", String.valueOf(s));
        startActivity(intent);
    }
}