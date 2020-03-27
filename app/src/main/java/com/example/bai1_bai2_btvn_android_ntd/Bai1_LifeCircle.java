package com.example.bai1_bai2_btvn_android_ntd;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Bai1_LifeCircle extends AppCompatActivity {

    Button btnGotoBai2;

    private static final String TAG = "TAG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: Bài 1");
        setContentView(R.layout.activity_bai1__life_circle);
        btnGotoBai2 = (Button) findViewById(R.id.btn_goto2);
        btnGotoBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Bai1_LifeCircle.this,Bai2_LifeCircle.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: Bài 1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart: Bài 1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: Bài 1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: Bài 1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: Bài 1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: Bài 1");
    }
}
