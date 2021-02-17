package com.example.secondmadang;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ScrollCodeActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmap;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_layout_main);

        scrollView = findViewById(R.id.scrollView);
        imageView = findViewById(R.id.imageView3);
        scrollView.setHorizontalScrollBarEnabled(true); // 수평 스크롤바 사용 가능 설정

        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.asdasd);   // 리소스 이미지 참조
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap); // 리소스 이미지 크기 설정
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }

    public void onButton1Clicked(View v) {
        changeImage();
    }

    private void changeImage() {        // 다른 이미지로 변경
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.aa);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        imageView.setImageDrawable(bitmap);
        imageView.getLayoutParams().width = bitmapWidth;
        imageView.getLayoutParams().height = bitmapHeight;
    }
}
