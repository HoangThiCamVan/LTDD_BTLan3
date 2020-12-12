package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainLoginSDT extends AppCompatActivity {
    Button tl_login,boqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_sdt);

        tl_login=(Button) findViewById(R.id.bt_tl_login);
        tl_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLoginSDT.this,MainLogin.class);
                startActivity(intent);
            }
        });
        boqua=(Button) findViewById(R.id.bt_boqua);
        boqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLoginSDT.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
