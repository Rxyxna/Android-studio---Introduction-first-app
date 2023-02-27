package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "App up and running");
    }
    @Override
        protected void onPause() {
            super.onPause();
            Log.d("MainActivity", "onPause: Pausing the app");
        }
    @Override
        protected void onResume() {
            super.onResume();
            Log.d("MainActivity", "onResume: Now resuming the application");
        }
    }