package com.iorek.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.iorek.designpatterns.Util.Logger;

public class MainActivity extends AppCompatActivity {
    private static String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Logger.I(TAG,"Hello java design pattern world!!!");
    }
}
