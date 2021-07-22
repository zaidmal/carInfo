package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class KiaMainActivity extends AppCompatActivity {
LinearLayout seltos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kia_main);
        seltos = (LinearLayout) findViewById(R.id.seltos);
        seltos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KiaMainActivity.this, KiaSeltosActivity.class);
                startActivity(intent);
            }
        });
    }
}