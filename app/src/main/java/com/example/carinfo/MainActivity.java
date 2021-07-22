package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {





    ImageView imageView,audi,ford,hyundai,kia,mer,jeep,mg,tata,toyota,mitsubishi,walkswagon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.bmw1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BmwcarActivity.class);
                startActivity(intent);
            }
        });

        audi = (ImageView)findViewById(R.id.audi);
        audi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AudicarActivityMain.class);
                startActivity(intent);
            }
        });
        ford = (ImageView)findViewById(R.id.ford1);
        ford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FordcarMainActivity.class);
                startActivity(intent);
            }
        });
        hyundai = (ImageView)findViewById(R.id.hyundai);
        hyundai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HyundaiMainActivity.class);
                startActivity(intent);
            }
        });
        kia = (ImageView)findViewById(R.id.kia);
        kia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KiaMainActivity.class);
                startActivity(intent);
            }
        });
        mer = (ImageView)findViewById(R.id.mercedis);
        mer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MercedesMainActivity.class);
                startActivity(intent);
            }
        });
        jeep = (ImageView)findViewById(R.id.jeep);
        jeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JeepMainActivity.class);
                startActivity(intent);
            }
        });
        mg = (ImageView)findViewById(R.id.mg);
        mg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MGMainActivity.class);
                startActivity(intent);
            }
        });
        tata = (ImageView)findViewById(R.id.tata);
        tata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TataMainActivity.class);
                startActivity(intent);
            }
        });
        toyota = (ImageView)findViewById(R.id.toyota);
        toyota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ToyotaMainActivity.class);
                startActivity(intent);
            }
        });
        mitsubishi = (ImageView)findViewById(R.id.mitsubisi);
        mitsubishi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MitsubisiMainActivity.class);
                startActivity(intent);
            }
        });
        walkswagon = (ImageView)findViewById(R.id.walksvagon);
        walkswagon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,WalksvegonMainActivity.class);
                startActivity(intent);
            }
        });
        }


    }