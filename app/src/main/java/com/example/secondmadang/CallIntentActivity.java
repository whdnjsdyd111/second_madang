package com.example.secondmadang;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CallIntentActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_intent);

        editText = findViewById(R.id.text4);

        Button button = findViewById(R.id.button51);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString();

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(data));
                startActivity(intent);
            }
        });

        Button button2 = findViewById(R.id.button52);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                ComponentName name = new ComponentName("com.example.secondmadang",
                        "com.example.secondmadang.MenuActivity");
                intent.setComponent(name);  // 인텐트 객체에 컴포넌트 지정
                startActivityForResult(intent, 101);    // 액티비티 띄우기
            }
        });
    }
}
