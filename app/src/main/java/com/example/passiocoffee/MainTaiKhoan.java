package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainTaiKhoan extends AppCompatActivity {
    Button tinTuc,datHang;
    Button dangxuat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taikhoan);

        tinTuc =(Button)findViewById(R.id.bt_tintuc);
        tinTuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainTaiKhoan.this,MainActivity.class);
                startActivity(intent);
            }
        });

        datHang=(Button)findViewById(R.id.bt_dathang);
        datHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainTaiKhoan.this,MainDatHang.class);
                startActivity(intent);
            }
        });

        dangxuat=(Button) findViewById(R.id.bt_dangxuat);
        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainTaiKhoan.this,MainTaiKhoanChuaLogin.class);
                startActivity(intent);
            }
        });
    }
}
