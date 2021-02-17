package com.example.secondmadang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class MainActivity11 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        Layout1 layout1 = findViewById(R.id.layout1);   // 레이아웃 추가한 뷰 참조

        layout1.setImage(R.drawable.ic_launcher_foreground);    // 뷰의 메소드 호출하여 데이터 설정
        layout1.setName("김민수");
        layout1.setMobile("010-0000-0000");

        Button button = findViewById(R.id.button83);
        button.setOnClickListener(new View.OnClickListener() {  // 버튼 클릭 시 이미지 설정
            @Override
            public void onClick(View v) {
                layout1.setImage(R.drawable.aa);
            }
        });

        Button button2 = findViewById(R.id.button84);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setImage(R.drawable.aaaaaaa);
            }
        });
    }
}
