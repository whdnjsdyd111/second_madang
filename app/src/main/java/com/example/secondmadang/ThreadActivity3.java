package com.example.secondmadang;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThreadActivity3 extends AppCompatActivity {
    TextView textView;

    Handler handler = new Handler();    // API 기본 핸들러 객체 생성

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_thread);

        textView = findViewById(R.id.textView44);

        Button button = findViewById(R.id.button91);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackgroundThread thread = new BackgroundThread();
                thread.start();
            }
        });
    }

    class BackgroundThread extends Thread {
        int value = 0;

        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {}

                value += 1;
                Log.d("Thread", "value : " + value);

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText("value 값 : " + value);
                    }
                });
            }
        }
    }
}
