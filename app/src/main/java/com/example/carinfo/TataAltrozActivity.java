package com.example.carinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class TataAltrozActivity extends AppCompatActivity {
ViewFlipper viewFlipper1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tata_altroz);
        int images[] = {R.drawable.bmwseries32, R.drawable.bmwseries3back, R.drawable.bmwseries3inte};

        viewFlipper1=findViewById(R.id.v_flipper1);

        for (int i = 0; i < images.length; i++) {
            flipperImages(images[i]);
        }
    }
    public  void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper1.addView(imageView);
        viewFlipper1.setFlipInterval(3000);
        viewFlipper1.setAutoStart(true);
        viewFlipper1.setInAnimation(this, android.R.anim.slide_out_right);
        viewFlipper1.setOutAnimation(this, android.R.anim.slide_in_left);
    }
}