package com.example.secondmadang;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AnimationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_scale);

        Button button = findViewById(R.id.button86);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);

                v.startAnimation(anim);
            }
        });

        Button button1 = findViewById(R.id.button87);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation anim =
                        AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale2);

                v.startAnimation(anim);
            }
        });
    }
}
