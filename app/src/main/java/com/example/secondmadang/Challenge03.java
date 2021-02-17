package com.example.secondmadang;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Challenge03 extends AppCompatActivity {
    ImageView imageViewUp;
    ImageView imageViewDown;
    BitmapDrawable bitmap;
    Button btnDown;
    Button btnUp;
    int bitmapWidth = 0;
    int bitmapHeight = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge02_03);

        btnDown = findViewById(R.id.button31);
        btnUp = findViewById(R.id.button32);
        imageViewUp = findViewById(R.id.imageView4);
        imageViewDown = findViewById(R.id.imageView5);

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.asdasd);   // 리소스 이미지 참조
        bitmapWidth = bitmap.getIntrinsicWidth();
        bitmapHeight = bitmap.getIntrinsicHeight();
    }

    public void buttonUp(View view) {
        imageViewDown.setImageDrawable(null);
        imageViewUp.setImageDrawable(bitmap); // 리소스 이미지 크기 설정
        imageViewUp.getLayoutParams().width = bitmapWidth;
        imageViewUp.getLayoutParams().height = bitmapHeight;
    }

    public void buttonDown(View view) {
        imageViewUp.setImageDrawable(null);
        imageViewDown.setImageDrawable(bitmap); // 리소스 이미지 크기 설정
        imageViewDown.getLayoutParams().width = bitmapWidth;
        imageViewDown.getLayoutParams().height = bitmapHeight;
    }
}
