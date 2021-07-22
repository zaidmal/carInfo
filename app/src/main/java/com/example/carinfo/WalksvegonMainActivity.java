package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class WalksvegonMainActivity extends AppCompatActivity {
LinearLayout vento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walksvegon_main);
        vento = (LinearLayout) findViewById(R.id.vento);
        vento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WalksvegonMainActivity.this,WalksvagonVentoActivity.class);
                startActivity(intent);
            }
        });
    }
}