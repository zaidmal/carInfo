package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MGMainActivity extends AppCompatActivity {
LinearLayout hector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_g_main);
        hector = (LinearLayout) findViewById(R.id.hector);
        hector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MGMainActivity.this, MgHactorActivity.class);
                startActivity(intent);
            }
        });
    }
}