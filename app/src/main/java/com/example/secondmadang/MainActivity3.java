package com.example.secondmadang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    public static final int REQUEST_CODE_MENU = 101;
    public static final String KEY_SIMPLE_DATA = "data";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parcel_intent);

        Button button = findViewById(R.id.button53);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuActivity2.class);
                SimpleData data = new SimpleData(100, "Hello Android!");
                intent.putExtra(KEY_SIMPLE_DATA, data);
                startActivityForResult(intent, REQUEST_CODE_MENU);
            }
        });
    }
}
