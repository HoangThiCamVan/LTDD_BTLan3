package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainLogin extends AppCompatActivity {
    Button sdt,boqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        sdt=(Button) findViewById(R.id.bt_sdt);
        sdt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this,MainLoginSDT.class);
                startActivity(intent);
            }
        });


        boqua=(Button) findViewById(R.id.bt_boqua_ologin);
        boqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainLogin.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

}
