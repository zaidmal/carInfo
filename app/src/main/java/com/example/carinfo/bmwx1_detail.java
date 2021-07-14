package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class bmwx1_detail extends AppCompatActivity {
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmwx1_detail);

        int images[] = {R.drawable.bmwx12, R.drawable.bmwx13, R.drawable.bmwx14};

        v_flipper=findViewById(R.id.v_flipper4);

        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }
    }
        public  void flipperImages(int image){
            ImageView imageView=new ImageView(this);
            imageView.setBackgroundResource(image);
            v_flipper.addView(imageView);
            v_flipper.setFlipInterval(2000);
            v_flipper.setAutoStart(true);
            v_flipper.setInAnimation(this, android.R.anim.slide_out_right);
            v_flipper.setOutAnimation(this, android.R.anim.slide_in_left);
        }
    }
