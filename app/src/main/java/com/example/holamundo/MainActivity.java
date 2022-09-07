package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        extracted(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void extracted(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}