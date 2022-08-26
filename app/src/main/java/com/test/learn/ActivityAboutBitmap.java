package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import java.io.ByteArrayOutputStream;

public class ActivityAboutBitmap extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_bitmap);

//        //压缩方式1：质量压缩
//        Bitmap bit = BitmapFactory.decodeFile(Environment
//                .getExternalStorageDirectory().getAbsolutePath()
//                + "/DCIM/Camera/test.jpg");
//
//        Log.i("JL", "压缩前图片的大小" + (bit.getByteCount() / 1024 / 1024)
//                + "M宽度为" + bit.getWidth() + "高度为" + bit.getHeight());
//
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        int quality = Integer.valueOf("");
//        bit.compress(Bitmap.CompressFormat.JPEG, quality, baos);
//        byte[] bytes = baos.toByteArray();
//        Bitmap bm = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
//        Log.i("JL", "压缩后图片的大小" + (bm.getByteCount() / 1024 / 1024)
//                + "M宽度为" + bm.getWidth() + "高度为" + bm.getHeight()
//                + "bytes.length=  " + (bytes.length / 1024) + "KB"
//                + "quality=" + quality);
//
//
//        //压缩方式2: 采样率压缩
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inSampleSize = 2;
//
//        bm = BitmapFactory.decodeFile(Environment
//                .getExternalStorageDirectory().getAbsolutePath()
//                + "/DCIM/Camera/test.jpg", options);
//        Log.i("JL", "压缩后图片的大小" + (bm.getByteCount() / 1024 / 1024)
//                + "M宽度为" + bm.getWidth() + "高度为" + bm.getHeight());
//
//        //压缩方式3: 缩放法压缩（Matrix）
//        Matrix matrix = new Matrix();
//        matrix.setScale(0.5f, 0.5f);
//        bm = Bitmap.createBitmap(bit, 0, 0, bit.getWidth(),
//                bit.getHeight(), matrix, true);
//        Log.i("JL", "压缩后图片的大小" + (bm.getByteCount() / 1024 / 1024)
//                + "M宽度为" + bm.getWidth() + "高度为" + bm.getHeight());
//
//        //压缩方式4: RGB_565法createScaledBitmap
//        BitmapFactory.Options options2 = new BitmapFactory.Options();
//        options2.inPreferredConfig = Bitmap.Config.RGB_565;
//
//        bm = BitmapFactory.decodeFile(Environment
//                .getExternalStorageDirectory().getAbsolutePath()
//                + "/DCIM/Camera/test.jpg", options2);
//        Log.i("JL", "压缩后图片的大小" + (bm.getByteCount() / 1024 / 1024)
//                + "M宽度为" + bm.getWidth() + "高度为" + bm.getHeight());
//
//        //压缩方式4: createScaledBitmap()
//        bm = Bitmap.createScaledBitmap(bit, 150, 150, true);
//        Log.i("JL", "压缩后图片的大小" + (bm.getByteCount() / 1024) + "KB宽度为"
//                + bm.getWidth() + "高度为" + bm.getHeight());

    }
}