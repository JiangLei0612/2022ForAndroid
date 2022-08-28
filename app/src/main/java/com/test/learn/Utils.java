package com.test.learn;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.TypedValue;

import java.io.IOException;
import java.io.InputStream;

public class Utils {


    //工具类

    public static int getScreenWidth(Activity activity){
        int screenWidth = activity.getWindowManager().getDefaultDisplay().getWidth();
        int screenHeight = activity.getWindowManager().getDefaultDisplay().getHeight();
        return screenWidth;
    }

    public static int px2dp(Context context, float pxValue) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, pxValue, context.getResources().getDisplayMetrics());
    }
    public static int px2sp(Context context, float pxValue) {
        return (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, pxValue, context.getResources().getDisplayMetrics());
    }

    public static int dp2px(Context context, float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    public static int sp2px(Context context, float spValue) {
        float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    public static Bitmap getImageFromAssetsFile(Context context, String fileName) {
        Bitmap p_w_picpath = null;
        AssetManager am = context.getResources().getAssets();
        try {
            InputStream is = am.open(fileName);
            p_w_picpath = BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return p_w_picpath;
    }


}
