package com.example.secondmadang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        Button button = findViewById(R.id.button49);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("name", "mike");    // 인텐트 객체 생성 후 name 값을 부가
                setResult(RESULT_OK, intent);   // 응답 보내기
                finish();   // 현재 액티비티 없애기
            }
        });
    }
}