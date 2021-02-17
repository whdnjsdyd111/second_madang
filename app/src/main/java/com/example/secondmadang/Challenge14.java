package com.example.secondmadang;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Challenge14 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.challenge07_13);

        RecyclerView recyclerView = findViewById(R.id.recyclerView1);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);
        Challenge14_dataAdapter adapter = new Challenge14_dataAdapter();
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

        adapter.setListener(new Challenge14_listener() {
            @Override
            public void onItemClick(Challenge14_dataAdapter.ViewHolder holder, View view, int position) {
                Challenge13_data data = adapter.getItem(position);
                Toast.makeText(Challenge14.this, "이름 : " + data.getName() + "\n" +
                        "생년월일 : " + data.getBirth() + "\n" +
                        "전화번호 : " + data.getPhone(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
