package com.example.secondmadang;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LooperActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;

    Handler handler = new Handler();

    ProcessThread thread;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_looper);

        editText = findViewById(R.id.editTextTextPersonName14);
        textView = findViewById(R.id.textView46);

        Button button = findViewById(R.id.button93);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();
                Message message = Message.obtain();
                message.obj = input;

                thread.processHandler.sendMessage(message); // 새로 만든 스레드의 핸들러에 전송
            }
        });

        thread = new ProcessThread();
    }

    class ProcessThread extends Thread {

        ProcessHandler processHandler = new ProcessHandler();

        public void run() {
            Looper.prepare();
            Looper.loop();
        }

        class ProcessHandler extends Handler {

            public void handleMessage(Message msg) {
                final String output = msg.obj + " from thread"; // 새로 만든 스레드에게 전달받은 메시지 처리

                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(output);
                    }
                });
            }
        }
    }
}
