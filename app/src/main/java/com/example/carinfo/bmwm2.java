package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class bmwm2 extends AppCompatActivity {

    ViewFlipper viewFlipper2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmwm2);
        int images[] = {R.drawable.bmwm22, R.drawable.bmwm23, R.drawable.bmwm2inte};

        viewFlipper2=findViewById(R.id.v_flipper4);

        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }
    }
    public  void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper2.addView(imageView);
        viewFlipper2.setFlipInterval(2000);
        viewFlipper2.setAutoStart(true);
        viewFlipper2.setInAnimation(this, android.R.anim.slide_out_right);
        viewFlipper2.setOutAnimation(this, android.R.anim.slide_in_left);
    }
}