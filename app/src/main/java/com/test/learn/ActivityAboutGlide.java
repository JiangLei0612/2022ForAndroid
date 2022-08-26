package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ActivityAboutGlide extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_glide);
    }

    private void test001(){

        ImageView imageView = new ImageView(ActivityAboutGlide.this);

        Glide.with(this)//绑定Activity生命周期
                .load("xxx.png")
                .into(imageView);
    }
}