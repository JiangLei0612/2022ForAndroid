package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ScaleImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scale_image);


        int drawableID = getIntent().getIntExtra("id", 0);

        ZoomImageView zoomImageView = findViewById(R.id.zoomImage);
        zoomImageView.setImageDrawable(getDrawable(drawableID));
    }
}