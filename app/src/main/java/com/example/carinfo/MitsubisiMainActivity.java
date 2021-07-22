package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MitsubisiMainActivity extends AppCompatActivity {
LinearLayout pajero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mitsubisi_main);
        pajero = (LinearLayout) findViewById(R.id.pajero);
        pajero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MitsubisiMainActivity.this, MitsubisiPajeroActivity.class);
                startActivity(intent);
            }
        });
    }
}