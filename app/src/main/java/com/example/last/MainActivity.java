package com.example.last;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mylibrary.Toaster;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toaster.s(this,"hi...!");
    }
}