package com.test.learn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    private TextView tvBack;
    private TextView tvTest;
    protected ArrayList<Integer> ids = new ArrayList();
    protected ArrayList<ImageView>  imageViews = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        addStatusViewWithColor(this,R.color.teal_200);
//        setFitsSystemWindows(this,true);
//        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
    }


    protected void bindImageViewData(Context context){
        LinearLayout content = findViewById(R.id.ll_content);
        if(content == null){
            return;
        }
        int childCount = content.getChildCount();
        for(int i = 0;i < childCount;i++){
            View childAt = content.getChildAt(i);
            if(childAt instanceof ImageView){
                if(childAt.getVisibility() == View.VISIBLE){
                    imageViews.add((ImageView) childAt);
                }
            }
        }
        for(int i = 0;i < imageViews.size();i++){
            Integer id = ids.get(i);
            imageViews.get(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context,ScaleImageActivity.class);
                    intent.putExtra("id",id);
                    startActivity(intent);
                }
            });
        }
    }

    private void addStatusViewWithColor(Activity activity, int color) {
        ViewGroup contentView = (ViewGroup) activity.findViewById(android.R.id.content);
        View statusBarView = new View(activity);
        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                getStatusBarHeight(activity));
        statusBarView.setBackgroundColor(color);
        contentView.addView(statusBarView, lp);
    }

    public int getStatusBarHeight(Context context) {
        int result = 0;
        //获取状态栏高度的资源id
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public static void setFitsSystemWindows(Activity activity, boolean value) {
        ViewGroup contentFrameLayout = (ViewGroup) activity.findViewById(android.R.id.content);
        View parentView = contentFrameLayout.getChildAt(0);
        if (parentView != null && Build.VERSION.SDK_INT >= 14) {
            parentView.setFitsSystemWindows(value);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        tvBack = findViewById(R.id.tv_back);
        if(tvBack != null){
            tvBack.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }
        tvTest = findViewById(R.id.tv_test);
        if(tvTest != null){
            tvTest.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    test();
                }
            });
        }
    }

    protected void test(){

    }
}
