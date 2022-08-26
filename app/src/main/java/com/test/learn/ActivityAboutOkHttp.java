package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

public class ActivityAboutOkHttp extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_ok_http);

        ImageView imageView001 = findViewById(R.id.iv_001);
        imageView001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAboutOkHttp.this,ScaleImageActivity.class);
                intent.putExtra("id",R.drawable.okhttp001);
                startActivity(intent);
            }
        });

        ImageView imageView002 = findViewById(R.id.iv_002);
        imageView002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityAboutOkHttp.this,ScaleImageActivity.class);
                intent.putExtra("id",R.drawable.okhttp002);
                startActivity(intent);
            }
        });

    }

    private void test_1(){
        //调用
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url("").build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {

            }
        });
    }

    private void test_2(){
        //同步调用
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url("").build();
        try {
            okHttpClient.newCall(request).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}