package com.example.secondmadang;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Challenge09 extends AppCompatActivity {
    Challenge09_Fragment fragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge05_09);

        fragment = new Challenge09_Fragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.challenge09, fragment).commit();
    }


}
