package com.example.passiocoffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    ArrayList<GridMain> arrayList;
    GridMainAdapter adapter;
    Button tinTuc,datHang,cuaHang,taiKhoan;
    ImageView tichDiem,dathangtren,coupon,acc,rewards;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acc=(ImageView)findViewById(R.id.acc);
        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainTaiKhoan.class);
                startActivity(intent);
            }
        });

        datHang =(Button)findViewById(R.id.bt_dathang);
        datHang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainDatHang.class);
                startActivity(intent);
            }
        });

        taiKhoan=(Button)findViewById(R.id.bt_taikhoan);
        taiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainTaiKhoan.class);
                startActivity(intent);
            }
        });

        tichDiem=(ImageView)findViewById(R.id.bt_tichdiem);
        tichDiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainTichDiem.class);
                startActivity(intent);
            }
        });

        dathangtren=(ImageView)findViewById(R.id.bt_dathangtren);
        dathangtren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainDatHang.class);
                startActivity(intent);
            }
        });
        coupon=(ImageView)findViewById(R.id.bt_coupon);
        coupon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainCoupon.class);
                startActivity(intent);
            }
        });
        rewards=(ImageView)findViewById(R.id.bt_rewards);
        rewards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,MainRewards.class);
                startActivity(intent);
            }
        });



        gridView =(GridView) findViewById(R.id.gv);
        arrayList=new ArrayList<>();
        arrayList.add(new GridMain("Ưu đãi đặc biệt","Mua 3 Tặng 1-Ưu đãi","Chỉ cần nhập mã TIECTRA19,nhận ngay ưu đãi",R.drawable.mua3tang1,"Chi tiết"));
        arrayList.add(new GridMain("","Giảm 25% cho khách hàng VinID","Chỉ cần nạp C qua app,Nhà mời ngay ưu đãi Giảm 25%",R.drawable.giam25,"Order ngay"));
        arrayList.add(new GridMain("Cập nhật từ Nhà","Lễ hội Macchiato","Độc quyền ở The Coffee House,trọn 3 vị macchiato: Trà đen,Matcha,Trà hoa đậu biếc",R.drawable.lehoimachiato,"Chi tiết"));
        arrayList.add(new GridMain("","Combo bánh nước","Không phải lo nghĩ ăn gì tại Nhà nữa,vì đã có combo bánh nước cho bạn chiến cả ngày rồi đây",R.drawable.combo,"Chi tiết"));
        arrayList.add(new GridMain("#CoffeeLover","Hương vị Cà phê mới tại nhà","Nhà Signature-nơi những hương vị nguyên bản tạo nên trải nghiệm khác biệ",R.drawable.coffee,"Chi tiết"));
        arrayList.add(new GridMain("","Nhà Gửi Bản,Vụ Mùa Của Những Bản Sắc","Nhà gửi bạn vụ mùa của những bản sắc tháng 6 này,được chọn lọc kỹ lưỡng",R.drawable.coffee2,"Chi tiết"));


        adapter =new GridMainAdapter(this,R.layout.product_gridmain,arrayList);
        gridView.setAdapter(adapter);

    }
}