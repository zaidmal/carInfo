package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BmwcarActivity extends AppCompatActivity {
    LinearLayout x1,series3,m2,series7,i8,z4,x7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bmwcars_activity);

        x1 = (LinearLayout) findViewById(R.id.Liearlayout);
        series3 = (LinearLayout) findViewById(R.id.series3);
        m2 = (LinearLayout) findViewById(R.id.bmwm2);
        series7 = (LinearLayout) findViewById(R.id.series7);
        i8 = (LinearLayout) findViewById(R.id.i8);
        z4 = (LinearLayout) findViewById(R.id.z4);
        x7 = (LinearLayout) findViewById(R.id.x7);

        x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BmwcarActivity.this, bmwx1_detail.class);
                startActivity(intent);
            }
        });
        series3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BmwcarActivity.this, bmwseries3.class);
                startActivity(intent);
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BmwcarActivity.this, bmwm2.class);
                startActivity(intent);
            }
        });
        series7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BmwcarActivity.this, BMWSeries7Activity.class);
                startActivity(intent);
            }
        });
        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BmwcarActivity.this, BmwI8Activity.class);
                startActivity(intent);
            }
        });
       z4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BmwcarActivity.this,BmwZ4Activity.class);
                startActivity(intent);
            }
        });

    }

}