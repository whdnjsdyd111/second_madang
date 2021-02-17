package com.example.secondmadang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Challenge08_2 extends AppCompatActivity {
    public static final int MENU_CODE = 5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge04_08_2);

        Button button = findViewById(R.id.button63);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge08_3.class);
                intent.putExtra("menu", button.getText().toString());
                startActivityForResult(intent, MENU_CODE);
            }
        });

        Button button2 = findViewById(R.id.button65);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge08_3.class);
                intent.putExtra("menu", button2.getText().toString());
                startActivityForResult(intent, MENU_CODE);
            }
        });

        Button button3 = findViewById(R.id.button64);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge08_3.class);
                intent.putExtra("menu", button3.getText().toString());
                startActivityForResult(intent, MENU_CODE);
            }
        });
    }
}
