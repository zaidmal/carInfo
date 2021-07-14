package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class AudicarActivityMain extends AppCompatActivity {

    LinearLayout a3,q3,a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audicar_main);

        a3 = (LinearLayout) findViewById(R.id.Liearlayout2);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AudicarActivityMain.this, AudiA3Activity.class);
                startActivity(intent);
            }
        });

    }
}