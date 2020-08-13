package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView anm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);
            anm = (ImageView)findViewById(R.id.one);
            anm.setBackgroundResource(R.drawable.animation);
        }

    public void onWindowFocusChanged (boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable frameAnimation =
                (AnimationDrawable) anm.getBackground();
        if(hasFocus) {
            frameAnimation.start();
        } else {
            frameAnimation.stop();
        }
    }
}
