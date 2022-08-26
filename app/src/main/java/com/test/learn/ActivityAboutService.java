package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ActivityAboutService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_service);

        ImageView iv02 = findViewById(R.id.iv_02);
        int screenWidth = Utils.getScreenWidth(this);
        int leftWidth = screenWidth - Utils.dp2px(this, 15) * 2;
        Bitmap bitmap02 = Utils.getImageFromAssetsFile(this, "service01.png");
        int width02 = bitmap02.getWidth();
        int height02 = bitmap02.getHeight();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) iv02.getLayoutParams();
        layoutParams.width = leftWidth;
        layoutParams.height = height02*leftWidth/width02;
        int padding = Utils.dp2px(this, 15);
        layoutParams.setMargins(padding,0,padding,0);
        iv02.setLayoutParams(layoutParams);
    }
}