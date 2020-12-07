package com.example.demoekz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
            Intent i = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(i);
            finish();
           }
        }, 5*1000);
    }

}