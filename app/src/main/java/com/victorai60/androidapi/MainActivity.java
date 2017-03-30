package com.victorai60.androidapi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.format.DateUtils;
import android.text.format.Formatter;

import static android.text.format.DateUtils.FORMAT_SHOW_DATE;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String date = DateUtils.formatDateTime(this, System.currentTimeMillis(), FORMAT_SHOW_DATE);
        String fileSize = Formatter.formatFileSize(this, 100000);
        System.out.println(date + " " + fileSize);
    }
}
