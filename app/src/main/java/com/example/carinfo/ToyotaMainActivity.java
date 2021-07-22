package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ToyotaMainActivity extends AppCompatActivity {
LinearLayout innova;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyota_main);
        innova = (LinearLayout) findViewById(R.id.altroz);
        innova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ToyotaMainActivity.this, ToyotaInnovaActivity.class);
                startActivity(intent);
            }
        });
    }
}