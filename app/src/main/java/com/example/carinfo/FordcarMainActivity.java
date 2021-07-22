package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class FordcarMainActivity extends AppCompatActivity {

    LinearLayout end,mus,fig,eco,asp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fordcar_main);
        end = (LinearLayout) findViewById(R.id.endevour);
        mus = (LinearLayout) findViewById(R.id.mustang);
        fig = (LinearLayout) findViewById(R.id.figo);
        eco = (LinearLayout) findViewById(R.id.ecosport);
        asp = (LinearLayout) findViewById(R.id.aspire);
        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FordcarMainActivity.this, AudiA3Activity.class);
                startActivity(intent);
            }
        });
    }
}