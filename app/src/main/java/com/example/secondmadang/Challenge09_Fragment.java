package com.example.secondmadang;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Challenge09_Fragment extends Fragment {
    EditText date;
    EditText name;
    EditText age;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.challenge05_09_fragment, container, false);

        date = rootView.findViewById(R.id.editTextTextPersonName4);
        date.setText(SimpleDateFormat.getInstance().format(new Date()));
        name = rootView.findViewById(R.id.editTextTextPersonName2);
        age = rootView.findViewById(R.id.editTextTextPersonName3);

        Button button = rootView.findViewById(R.id.button78);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "이름 : " + name.getText().toString()
                        + "\n나이 : " + age.getText().toString()
                        + "\n생년월일 : " + date.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
