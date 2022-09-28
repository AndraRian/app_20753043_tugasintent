package com.example.app_20753043_tugasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buka(View view) {
        Intent buka = new Intent(Intent.ACTION_QUICK_CLOCK);
        startActivity(buka);
    }

    public void info(View view) {
        Intent info = new Intent(MainActivity.this, info.class);
        startActivity(info);

    }
}