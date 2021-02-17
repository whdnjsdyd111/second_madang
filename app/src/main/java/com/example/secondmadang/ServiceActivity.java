package com.example.secondmadang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ServiceActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_service);

        editText = findViewById(R.id.editTextTextPersonName5);

        Button button = findViewById(R.id.button79);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();

                Intent intent = new Intent(getApplicationContext(), MyService.class);
                intent.putExtra("command", "show"); // 인텐트로 부가 데이터 넣기
                intent.putExtra("name", name);

                startService(intent);   // 서비스 시작
            }
        });

        Intent passedIntent = getIntent();  // 액티비티 새로 만들어질 때 인텐트 처리
        processIntent(passedIntent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        processIntent(intent);      // 액티비티가 이미 만들어졌을 때 인텐트 처리

        super.onNewIntent(intent);
    }

    private void processIntent(Intent intent) {
        if (intent != null) {
            String command = intent.getStringExtra("command");
            String name = intent.getStringExtra("name");

            Toast.makeText(this, "command : " + command + ", name : " + name, Toast.LENGTH_SHORT).show();
        }
    }
}
