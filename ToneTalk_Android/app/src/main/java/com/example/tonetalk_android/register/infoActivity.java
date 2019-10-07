package com.example.tonetalk_android.register;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tonetalk_android.R;

public class infoActivity extends AppCompatActivity {

    Button step2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_info);

        step2 = findViewById(R.id.infoToPic);

        step2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), picSelecActivity.class);
                startActivity(intent);
            }
        });

    }
}
