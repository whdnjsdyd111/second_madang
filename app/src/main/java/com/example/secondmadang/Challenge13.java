package com.example.secondmadang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Challenge13 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge07_13);

        RecyclerView recyclerView = findViewById(R.id.recyclerView1);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        Challenge13_dataAdapter adapter = new Challenge13_dataAdapter();
        recyclerView.setAdapter(adapter);

        TextView textView = findViewById(R.id.textView42);
        EditText name = findViewById(R.id.editTextTextPersonName11);
        EditText birth = findViewById(R.id.editTextTextPersonName12);
        EditText phone = findViewById(R.id.editTextTextPersonName13);

        Button button = findViewById(R.id.button85);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.addItem(new Challenge13_data(name.getText().toString(),
                        birth.getText().toString(), phone.getText().toString()));
                adapter.notifyDataSetChanged();
                textView.setText("고객 정보 추가 " + adapter.getItemCount() + "명");
            }
        });
    }
}
