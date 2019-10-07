package com.example.tonetalk_android.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tonetalk_android.R;

public class registerActivity extends AppCompatActivity {

    Button step1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        step1 = findViewById(R.id.pwToInfo);
        step1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), infoActivity.class);
                startActivity(intent);
            }
        });

    }
}
