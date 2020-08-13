package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    ObjectAnimator objectanimator;
    ImageView imgview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgview = (ImageView)findViewById(R.id.imageView1);
        objectanimator = ObjectAnimator.ofFloat(imgview,"y",600);

        objectanimator.setDuration(5000);
        objectanimator.start();
    }
}
