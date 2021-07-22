package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MercedesMainActivity extends AppCompatActivity {
LinearLayout sclass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mercedes_main);
        sclass = (LinearLayout) findViewById(R.id.sclass);
        sclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MercedesMainActivity.this, MercedesSclassActivity.class);
                startActivity(intent);
            }
        });
    }
}