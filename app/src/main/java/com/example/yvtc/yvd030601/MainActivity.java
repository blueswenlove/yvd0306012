package com.example.yvtc.yvd030601;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(view v)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
    }

}
