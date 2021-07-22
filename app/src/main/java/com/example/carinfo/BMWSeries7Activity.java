package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class BMWSeries7Activity extends AppCompatActivity {
ViewFlipper v_flipper4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmw_series7);
        int images[] = {R.drawable.bmwx12, R.drawable.bmwx13, R.drawable.bmwx14};

        v_flipper4=findViewById(R.id.v_flipper7);

        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }
    }
    public  void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper4.addView(imageView);
        v_flipper4.setFlipInterval(2000);
        v_flipper4.setAutoStart(true);
        v_flipper4.setInAnimation(this, android.R.anim.slide_out_right);
        v_flipper4.setOutAnimation(this, android.R.anim.slide_in_left);

    }
}