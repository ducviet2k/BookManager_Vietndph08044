package com.example.bookmanager_vietndph08044;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DangNhapActivity extends AppCompatActivity {
EditText edName,edPass;
Button btnDN,btnhHuy,btnlogin;
Intent intent;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);
        btnDN= findViewById(R.id.btnDN);
        btnhHuy = findViewById(R.id.btnhuy);
        edName = findViewById(R.id.edName);
        edPass = findViewById(R.id.edpass);
        btnlogin = findViewById(R.id.btnLogin);
    }

    public void DangNhap(View view) {
        intent = new Intent(DangNhapActivity.this, GD_ChinhActivity.class);
        startActivity(intent);
        Toast.makeText(DangNhapActivity.this, "Đăng nhập thành công ", Toast.LENGTH_SHORT).show();
    }

    public void Huy(View view) {
        intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        Toast.makeText(this, " Bạn đã hủy", Toast.LENGTH_SHORT).show();
    }
}
