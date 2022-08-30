package com.test.learn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends BaseActivity {

    private LinearLayout llAboutActivity;
    private LinearLayout llAboutService;
    private LinearLayout llAboutBroadcastReceiver;
    private LinearLayout llAboutContentProvider;
    private LinearLayout llAboutHandler;
    private LinearLayout llAboutView;
    private LinearLayout llAboutViewDistribute;
    private LinearLayout llAboutViewRecycleView;
    private LinearLayout llAboutWebview;
    private LinearLayout llAboutAnimator;
    private LinearLayout llAboutBitmap;
    private LinearLayout llAboutMVX;
    private LinearLayout llAboutBinder;
    private LinearLayout llAboutMemory;
    private LinearLayout llAboutPerformance;
    private LinearLayout llAboutWindow;
    private LinearLayout llAboutWMS;
    private LinearLayout llAboutAMS;
    private LinearLayout llAboutSystem;
    private LinearLayout llAboutApp;
    private LinearLayout llAboutSerializable;
    private LinearLayout llAboutStructure;
    private LinearLayout llAboutHotFix;
    private LinearLayout llAboutAop;
    private LinearLayout llAboutJetpack;
    private LinearLayout llAboutOkHttp;
    private LinearLayout llAboutGlide;
    private LinearLayout llAboutLruCache;
    private LinearLayout llAboutRetrofit;
    private LinearLayout llAboutLeakCanary;
    private LinearLayout llAboutEventBus;
    private LinearLayout llAboutRxjava;
    private LinearLayout llAboutThreadSafe;
    private LinearLayout llAboutKotlin;
    private LinearLayout llAboutAlgorithm;//算法相关
    private LinearLayout llAboutDesign;
    private LinearLayout llAboutDaggar2;
    private LinearLayout llAboutFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llAboutActivity = findViewById(R.id.ll_about_activity);
        llAboutActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutActivity.class);
                startActivity(intent);
            }
        });
        llAboutService = findViewById(R.id.ll_about_service);
        llAboutService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutService.class);
                startActivity(intent);
            }
        });
        llAboutBroadcastReceiver = findViewById(R.id.ll_about_broadcastReceiver);
        llAboutBroadcastReceiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutBroadcastReceiver.class);
                startActivity(intent);
            }
        });
        llAboutContentProvider = findViewById(R.id.ll_about_contentProvider);
        llAboutContentProvider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutContentProvider.class);
                startActivity(intent);
            }
        });
        llAboutHandler = findViewById(R.id.ll_about_handler);
        llAboutHandler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutHandler.class);
                startActivity(intent);
            }
        });
        llAboutView = findViewById(R.id.ll_about_view_draw);
        llAboutView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutView.class);
                startActivity(intent);
            }
        });
        llAboutViewDistribute = findViewById(R.id.ll_about_view_distribution);
        llAboutViewDistribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutViewDistribute.class);
                startActivity(intent);
            }
        });
        llAboutViewRecycleView = findViewById(R.id.ll_about_recycleView);
        llAboutViewRecycleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityAboutRecycleView.class);
                startActivity(intent);
            }
        });
        llAboutFragment = findViewById(R.id.ll_about_fragment);
        llAboutFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityAboutFragment.class);
                startActivity(intent);
            }
        });
        llAboutWebview = findViewById(R.id.ll_about_webview);
        llAboutWebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutWebview.class);
                startActivity(intent);
            }
        });
        llAboutAnimator = findViewById(R.id.ll_about_animator);
        llAboutAnimator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutAnimator.class);
                startActivity(intent);
            }
        });
        llAboutBitmap = findViewById(R.id.ll_about_bitmap);
        llAboutBitmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutBitmap.class);
                startActivity(intent);
            }
        });
        llAboutMVX = findViewById(R.id.ll_about_mvx);
        llAboutMVX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutMVX.class);
                startActivity(intent);
            }
        });

        llAboutBinder = findViewById(R.id.ll_about_binder);
        llAboutBinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutBinder.class);
                startActivity(intent);
            }
        });

        llAboutMemory = findViewById(R.id.ll_about_memory);
        llAboutMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutMemory.class);
                startActivity(intent);
            }
        });

        llAboutPerformance = findViewById(R.id.ll_about_performance_optimization);
        llAboutPerformance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutPerformance.class);
                startActivity(intent);
            }
        });

        llAboutWindow = findViewById(R.id.ll_about_window);
        llAboutWindow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutWindow.class);
                startActivity(intent);
            }
        });

        llAboutWMS = findViewById(R.id.ll_about_wms);
        llAboutWMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutWMS.class);
                startActivity(intent);
            }
        });

        llAboutAMS = findViewById(R.id.ll_about_ams);
        llAboutAMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutAMS.class);
                startActivity(intent);
            }
        });

        llAboutSystem = findViewById(R.id.ll_about_system);
        llAboutSystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutSystem.class);
                startActivity(intent);
            }
        });

        llAboutApp = findViewById(R.id.ll_about_apk);
        llAboutApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutApk.class);
                startActivity(intent);
            }
        });

        llAboutSerializable = findViewById(R.id.ll_about_serializable);
        llAboutSerializable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutSerializable.class);
                startActivity(intent);
            }
        });

        llAboutStructure = findViewById(R.id.ll_about_structure);
        llAboutStructure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutStructure.class);
                startActivity(intent);
            }
        });

        llAboutHotFix = findViewById(R.id.ll_about_fix);
        llAboutHotFix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutHotFix.class);
                startActivity(intent);
            }
        });

        llAboutAop = findViewById(R.id.ll_about_aop);
        llAboutAop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutAOP.class);
                startActivity(intent);
            }
        });

        llAboutJetpack = findViewById(R.id.ll_about_jectpack);
        llAboutJetpack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutJetpack.class);
                startActivity(intent);
            }
        });

        llAboutOkHttp = findViewById(R.id.ll_about_okhttp);
        llAboutOkHttp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutOkHttp.class);
                startActivity(intent);
            }
        });

        llAboutGlide = findViewById(R.id.ll_about_glide);
        llAboutGlide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutGlide.class);
                startActivity(intent);
            }
        });

        llAboutLruCache = findViewById(R.id.ll_about_lru);
        llAboutLruCache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutLruCache.class);
                startActivity(intent);
            }
        });

        llAboutRetrofit = findViewById(R.id.ll_about_retrofit);
        llAboutRetrofit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutRetrofit.class);
                startActivity(intent);
            }
        });

        llAboutLeakCanary = findViewById(R.id.ll_about_leakcanary);
        llAboutLeakCanary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutLeakCanary.class);
                startActivity(intent);
            }
        });

        llAboutEventBus = findViewById(R.id.ll_about_eventbus);
        llAboutEventBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutEventBus.class);
                startActivity(intent);
            }
        });

        llAboutRxjava = findViewById(R.id.ll_about_rxjava);
        llAboutRxjava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutRxjava.class);
                startActivity(intent);
            }
        });

        llAboutThreadSafe = findViewById(R.id.ll_about_thread);
        llAboutThreadSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutThreadSafe.class);
                startActivity(intent);
            }
        });

        llAboutKotlin = findViewById(R.id.ll_about_kotlin);
        llAboutKotlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutKotlin.class);
                startActivity(intent);
            }
        });

        llAboutAlgorithm = findViewById(R.id.ll_about_algorithm);
        llAboutAlgorithm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutAlgorithm.class);
                startActivity(intent);
            }
        });

        llAboutDesign = findViewById(R.id.ll_about_design);
        llAboutDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutDesignModel.class);
                startActivity(intent);
            }
        });

        llAboutDaggar2 = findViewById(R.id.ll_about_daggar);
        llAboutDaggar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ActivityAboutDaggar2.class);
                startActivity(intent);
            }
        });


    }
}