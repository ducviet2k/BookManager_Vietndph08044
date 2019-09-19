package com.example.bookmanager_vietndph08044;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity extends AppCompatActivity {
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,DangNhapActivity.class));
                finish();
            }
            }, 2500);
    }
}


//    public void Click(View view) {
//        intent = new Intent(MainActivity.this,DangNhapActivity.class);
//        startActivity(intent);
//
//    }
//}
