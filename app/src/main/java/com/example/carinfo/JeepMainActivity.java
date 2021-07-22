package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class JeepMainActivity extends AppCompatActivity {
LinearLayout compass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeep_main);
        compass = (LinearLayout) findViewById(R.id.compass);
        compass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(JeepMainActivity.this,JeepCompassActivity.class);
                startActivity(intent);
            }
        });
    }
}