package com.example.gufran.animationdrawablestudy;

import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void clickMe(View v) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AnimationDrawable animationDrawable = (AnimationDrawable) getDrawable(R.drawable.ic_equilizer_white_36dp);
            imageView.setImageDrawable(animationDrawable);
            if (animationDrawable != null) animationDrawable.start();


        } else {
            Toast.makeText(getApplicationContext(), "This device doesnot support Animation Drawable", Toast.LENGTH_LONG).show();
        }


    }


}
