package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainChiTiet extends AppCompatActivity {
    Button btClose;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chitiet);

        btClose=(Button) findViewById(R.id.bt_close);
        btClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainChiTiet.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
