package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;

import android.os.Bundle;
import android.widget.Toast;

public class ActivityAboutRxjava extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_rxjava);
    }

    @Override
    protected void test() {
        super.test();
        create();
    }

    private void create(){
        Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(@NonNull ObservableEmitter<String> emitter) throws Exception {
                emitter.onNext("hello world");
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String o) throws Exception {
                Toast.makeText(ActivityAboutRxjava.this, o, Toast.LENGTH_SHORT).show();
            }
        });
    }


}