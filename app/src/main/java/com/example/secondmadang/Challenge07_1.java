package com.example.secondmadang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Challenge07_1 extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge04_07_1);

        Button button = findViewById(R.id.button58);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Challenge07_2.class);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });
    }
}
