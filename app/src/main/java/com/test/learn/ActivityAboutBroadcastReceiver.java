package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityAboutBroadcastReceiver extends BaseActivity implements View.OnClickListener {

    //参考文章：https://www.jianshu.com/p/59ef3150b171

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_broadcast_receiver);

        findViewById(R.id.iv_001).setOnClickListener(this);
        findViewById(R.id.iv_002).setOnClickListener(this);
        findViewById(R.id.iv_003).setOnClickListener(this);
        findViewById(R.id.iv_004).setOnClickListener(this);
        findViewById(R.id.iv_005).setOnClickListener(this);
        findViewById(R.id.iv_006).setOnClickListener(this);
        findViewById(R.id.iv_007).setOnClickListener(this);
        findViewById(R.id.iv_008).setOnClickListener(this);
        findViewById(R.id.iv_009).setOnClickListener(this);
        findViewById(R.id.iv_010).setOnClickListener(this);
        findViewById(R.id.iv_011).setOnClickListener(this);
        findViewById(R.id.iv_012).setOnClickListener(this);
        findViewById(R.id.iv_013).setOnClickListener(this);
        findViewById(R.id.iv_014).setOnClickListener(this);
        findViewById(R.id.iv_015).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int drawableId;
        int vId = v.getId();
        switch (vId){
            case R.id.iv_001:
                drawableId = R.drawable.broadcast01;
                break;
            case R.id.iv_002:
                drawableId = R.drawable.broadcast02;
                break;
            case R.id.iv_003:
                drawableId = R.drawable.broadcast03;
                break;
            case R.id.iv_004:
                drawableId = R.drawable.broadcast04;
                break;
            case R.id.iv_005:
                drawableId = R.drawable.broadcast05;
                break;
            case R.id.iv_006:
                drawableId = R.drawable.broadcast06;
                break;
            case R.id.iv_007:
                drawableId = R.drawable.broadcast07;
                break;
            case R.id.iv_008:
                drawableId = R.drawable.broadcast08;
                break;
            case R.id.iv_009:
                drawableId = R.drawable.broadcast09;
                break;
            case R.id.iv_010:
                drawableId = R.drawable.broadcast10;
                break;
            case R.id.iv_011:
                drawableId = R.drawable.broadcast11;
                break;
            case R.id.iv_012:
                drawableId = R.drawable.broadcast12;
                break;
            case R.id.iv_013:
                drawableId = R.drawable.broadcast13;
                break;
            case R.id.iv_014:
                drawableId = R.drawable.broadcast14;
                break;
            case R.id.iv_015:
                drawableId = R.drawable.broadcast15;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + vId);
        }
        Intent intent = new Intent(ActivityAboutBroadcastReceiver.this,ScaleImageActivity.class);
        intent.putExtra("id",drawableId);
        startActivity(intent);
    }
}