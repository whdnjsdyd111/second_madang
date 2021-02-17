package com.example.secondmadang;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import com.google.firebase.iid.InstanceIdResult;

public class PushActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_push);

        textView = findViewById(R.id.textView58);
        textView2 = findViewById(R.id.textView59);

        FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(this,
                new OnSuccessListener<InstanceIdResult>() {
                    @Override
                    public void onSuccess(InstanceIdResult result) {
                        String newToken = result.getToken();

                        println("등록 id : " + newToken);
                    }
                });

        Button button = findViewById(R.id.button134);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String instanceId = FirebaseInstanceId.getInstance().getId();
                println("확인된 인스턴스 id : " + instanceId);
            }
        });
    }

    public void println(String data) {
        textView2.append(data + "\n");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        println("onNewIntent 호출됨.");

        if (intent != null) {
            processIntent(intent);
        }

        super.onNewIntent(intent);
    }

    private void processIntent(Intent intent) {
        String from = intent.getStringExtra("from");
        if (from == null) {
            println("from is null.");
            return;
        }

        String contents = intent.getStringExtra("contents");

        println("DATA : " + from + ", " + contents);
        textView.setText("[" + from + "]로부터 수신한 데이터 : " + contents);
    }
}
