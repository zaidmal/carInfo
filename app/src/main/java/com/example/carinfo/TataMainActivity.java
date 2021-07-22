package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TataMainActivity extends AppCompatActivity {
LinearLayout altroz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata_main);
        altroz = (LinearLayout) findViewById(R.id.altroz);
        altroz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TataMainActivity.this, TataAltrozActivity.class);
                startActivity(intent);
            }
        });
    }
}