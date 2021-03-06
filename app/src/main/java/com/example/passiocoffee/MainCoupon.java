package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainCoupon extends AppCompatActivity {
    ListView listCoupon;
    ArrayList<TichDiem> data;
    TichDiemAdapter adapter;

    Button btTl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon);
        btTl=(Button) findViewById(R.id.bt_tl);
        btTl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainCoupon.this,MainActivity.class);
                startActivity(intent);
            }
        });


        listCoupon=(ListView) findViewById(R.id.lv_coupon);

        data=new ArrayList<>();
        data.add(new TichDiem("Mua 1 tặng 1 cho đơn hàng delivery (giao tận nơi) đầu tiên","Hạn sử dụng đến 22/12/2020",R.drawable.coffee2));
        data.add(new TichDiem("Ưu đãi 25% khi đặt Pick Up (tự đến lấy) từ 2 món","Hạn sử dụng đến 30/11/2020",R.drawable.pickup));
        data.add(new TichDiem("Ưu đãi giảm 30.000đ cho đơn hàng từ 149.000đ","Hạn sử dụng đến 30/11/2020",R.drawable.cp));


        adapter =new TichDiemAdapter(this,R.layout.product_listtichdiem,data);
        listCoupon.setAdapter(adapter);


    }

}
