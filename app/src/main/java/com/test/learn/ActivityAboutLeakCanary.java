package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ActivityAboutLeakCanary extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_leak_canary);

        ids.add(R.drawable.leak);


        //绑定数据对应关系
        bindImageViewData(this);
    }
}