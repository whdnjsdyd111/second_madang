package com.example.secondmadang;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.secondmadang.R;

public class LayoutCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout mainLayout = new LinearLayout(this);   // new 연산으로 새로운 리니어 레이아웃을 만들고
        mainLayout.setOrientation(LinearLayout.VERTICAL);           // 방향 설정

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,     // new 연산자로 레이아웃 안에 추가될 뷰들에
                        LinearLayout.LayoutParams.WRAP_CONTENT      // 설정할 파라미터 생성
                );

        Button button1 = new Button(this);  // 버튼 파라미터를 설정하고 레이아웃에 추가
        button1.setText("Button1");
        button1.setLayoutParams(params);
        mainLayout.addView(button1);

        setContentView(mainLayout); // 새로 만든 레이아웃을 화면에 설정
    }
}