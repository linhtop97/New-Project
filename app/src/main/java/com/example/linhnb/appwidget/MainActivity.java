package com.example.linhnb.appwidget;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
  Button button;
  public static final String TAG = MainActivity.class.getSimpleName();
    private  String m;
    private String minh = "hihi";
    private String mPhuongtien;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 10; i++) {
            minh += i;
        }

        Log.d(TAG,"Hihi");


    }
}
