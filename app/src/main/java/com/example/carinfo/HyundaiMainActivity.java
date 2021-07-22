package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HyundaiMainActivity extends AppCompatActivity {
LinearLayout i20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyundai_main);
        i20 = (LinearLayout) findViewById(R.id.i20);
        i20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HyundaiMainActivity.this, HyundaiI20Activity.class);
                startActivity(intent);
            }
        });
    }
}