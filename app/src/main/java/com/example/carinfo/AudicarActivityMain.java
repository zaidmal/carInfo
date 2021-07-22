package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AudicarActivityMain extends AppCompatActivity {

    LinearLayout a3,q3,a4,q5,rsq8,rs7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audicar_main);

        a3 = (LinearLayout) findViewById(R.id.Liearlayout2);
        q3 = (LinearLayout) findViewById(R.id.q3);
        a4 = (LinearLayout) findViewById(R.id.a4);
        q5 = (LinearLayout) findViewById(R.id.q5);
        rsq8 = (LinearLayout) findViewById(R.id.rsq8);
        rs7 = (LinearLayout) findViewById(R.id.rs7sportsback);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudicarActivityMain.this, AudiA3Activity.class);
                startActivity(intent);
            }
        });
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudicarActivityMain.this, AudiQ3MainActivity.class);
                startActivity(intent);
            }
        });
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudicarActivityMain.this, AudiA4Activity.class);
                startActivity(intent);
            }
        });
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudicarActivityMain.this, AudiQ5Activity.class);
                startActivity(intent);
            }
        });
        rsq8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudicarActivityMain.this, AudiRsq8Activity.class);
                startActivity(intent);
            }
        });
        rs7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudicarActivityMain.this, AudiRs7Activity.class);
                startActivity(intent);
            }
        });

    }
}