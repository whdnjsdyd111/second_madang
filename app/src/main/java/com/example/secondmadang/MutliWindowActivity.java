package com.example.secondmadang;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MutliWindowActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_multiwindow);

        textView = findViewById(R.id.textView64);

        Button button = findViewById(R.id.button144);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 24) {
                    boolean isIn = isInMultiWindowMode();
                    println("다중 창 모드 여부 : " + isIn);
                }
            }
        });

        Button button2 = findViewById(R.id.button145);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= 24) {
                    boolean isIn = isInPictureInPictureMode();
                    println("PIP 모드 여부 : " + isIn);
                }
            }
        });

    }

    @Override
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        super.onMultiWindowModeChanged(isInMultiWindowMode);

        println("다중 창 모드 변경됨 : " + isInMultiWindowMode);
    }

    public void println(String data) {
        textView.append(data + "\n");
    }
}
