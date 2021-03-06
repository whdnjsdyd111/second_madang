package com.example.secondmadang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Challenge11 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge06_11);

        EditText editText = findViewById(R.id.editTextTextPersonName9);
        textView = findViewById(R.id.textView35);

        Button button = findViewById(R.id.button81);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = editText.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Challenge11_service.class);
                intent.putExtra("str", str);

                startService(intent);
            }
        });

        Intent passedIntent = getIntent();
        processIntent(passedIntent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        processIntent(intent);      // 액티비티가 이미 만들어졌을 때 인텐트 처리

        super.onNewIntent(intent);
    }

    private void processIntent(Intent intent) {
        if (intent != null) {
            String str = intent.getStringExtra("str");

            textView.setText(str);
        }
    }
}
