package com.example.secondmadang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Challenge04 extends AppCompatActivity {
    Button submit;
    Button close;
    TextView input;
    TextView byteNum;
    String content;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge02_04);

        input = findViewById(R.id.textView16);
        byteNum = findViewById(R.id.textView17);
        submit = findViewById(R.id.button33);
        close = findViewById(R.id.button34);

    }

    public void showToast(View view) {
        Toast.makeText(this, input.getText(), Toast.LENGTH_LONG).show();
    }
}
