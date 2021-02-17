package com.example.secondmadang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Challenge08_3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge04_08_3);

        String kind = getIntent().getStringExtra("menu");
        ((TextView) findViewById(R.id.textView30)).setText(kind);

        Button button = findViewById(R.id.button66);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge08_2.class);
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button67);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge08_1.class);
                startActivity(intent);
            }
        });
    }
}
