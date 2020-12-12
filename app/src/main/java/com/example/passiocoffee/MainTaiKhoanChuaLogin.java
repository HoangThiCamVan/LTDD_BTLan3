package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainTaiKhoanChuaLogin extends AppCompatActivity {
    Button dangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taikhoan_chualogin);

        dangnhap=(Button) findViewById(R.id.bt_dangnhap);
        dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainTaiKhoanChuaLogin.this,MainLogin.class);
                startActivity(intent);
            }
        });
    }
}
