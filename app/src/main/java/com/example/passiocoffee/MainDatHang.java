package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainDatHang extends AppCompatActivity {
 Button tintuc;

    // Button cuahang;
     Button taikhoan;
   GridView gvPhoBien,gvThucUong,gvDoAn ;
    ArrayList<DatHang> mangPhoBien,mangThucUong, mangDoAn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dathang);


        tintuc =(Button)findViewById(R.id.bt_tintuc);
        tintuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDatHang.this,MainActivity.class);
                startActivity(intent);
            }
        });

        taikhoan=(Button)findViewById(R.id.bt_taikhoan);
        taikhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainDatHang.this, MainTaiKhoan.class);
                startActivity(intent);
            }
        });

        gvPhoBien=(GridView) findViewById(R.id.gv_phobien);
        gvThucUong=(GridView) findViewById(R.id.gv_thucuong);
        gvDoAn= (GridView)findViewById(R.id.gv_doan);


        mangPhoBien= new ArrayList<DatHang>();
        mangThucUong= new ArrayList<DatHang>();
        mangDoAn = new ArrayList<DatHang>();


        //thêm món ăn vào mảng
        mangPhoBien.add(new DatHang("Capuchino  ","69.000 VNĐ",R.drawable.cf));
        mangPhoBien.add(new DatHang("Macca Phủ Socola ","72.000 VNĐ",R.drawable.macca));
        mangPhoBien.add(new DatHang("Trà Đào Cam Sả ","42.000 VNĐ",R.drawable.tradao));
        mangPhoBien.add(new DatHang("Olong Hạt Sen ","59.000 VNĐ",R.drawable.olong));
        mangPhoBien.add(new DatHang("Cà Phê Sữa Đá ","59.000 VNĐ",R.drawable.cfff));
        mangPhoBien.add(new DatHang("Sinh Tố Việt Quất ","50.000 VNĐ",R.drawable.sinhto));
        mangPhoBien.add(new DatHang("Sinh Tố Cam Xoài","50.000 VNĐ",R.drawable.stocx));
        mangPhoBien.add(new DatHang("Chanh Sả Đá Xay","58.000 VNĐ",R.drawable.chanhsa));

        //thêm món ăn vào mảng
        mangThucUong.add(new DatHang("Trà Đen ","32.000 VNĐ",R.drawable.traden));
        mangThucUong.add(new DatHang("Cà Phê Đen","59.000 VNĐ",R.drawable.cfden));
        mangThucUong.add(new DatHang("Mocha ","69.000 VNĐ",R.drawable.mocha));
        mangThucUong.add(new DatHang("Latte Nóng ","50.000 VNĐ",R.drawable.latte));
        mangThucUong.add(new DatHang("Matcha Đá Xay ","50.000 VNĐ",R.drawable.matcha));
        mangThucUong.add(new DatHang("Cookies Đá Xay ","59.000 VNĐ",R.drawable.cookies));

        //thêm món ăn vào mảng
        mangDoAn.add(new DatHang("Bánh Mì Chà Bông ","22.000 VNĐ",R.drawable.banhmi));
        mangDoAn.add(new DatHang("Chà Bông Kẹp ","22.000 VNĐ",R.drawable.chabongkep));
        mangDoAn.add(new DatHang("Mít Sấy ","20.000 VNĐ",R.drawable.mit));





        final DatHangAdapter DatHangAdapter = new DatHangAdapter(
                MainDatHang.this,
                R.layout.product_griddathang,
                mangPhoBien
        );
        final DatHangAdapter DatHangAdapter2 = new DatHangAdapter(
                MainDatHang.this,
                R.layout.product_griddathang,
                mangThucUong
        );
        final DatHangAdapter DatHangAdapter3 = new DatHangAdapter(
                MainDatHang.this,
                R.layout.product_griddathang,
                mangDoAn
        );

        gvPhoBien.setAdapter(DatHangAdapter);
        gvThucUong.setAdapter(DatHangAdapter2);
        gvDoAn.setAdapter(DatHangAdapter3);




        //
        //bắt đầu tabhost
        TabHost tabhost = (TabHost) findViewById(R.id.tabhost);

        // setting up the tab host
        tabhost.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec = tabhost.newTabSpec("Phổ biến");
        spec.setContent(R.id.tab1);

        // setting the name of the tab 1 as "Tab One"
        spec.setIndicator("Phổ biến");

        //thêm  tab vào tabhost
        tabhost.addTab(spec);

        // Code thêm Tab 2 vào tabhost
        spec = tabhost.newTabSpec("Thức uống");
        spec.setContent(R.id.tab2);

        // setting the name of the tab 1 as "Tab Two"
        spec.setIndicator("Thức uống");
        tabhost.addTab(spec);

        // Code thêm Tab 3 vào  tabhost
        spec = tabhost.newTabSpec("Đồ ăn");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Đồ ăn");
        tabhost.addTab(spec);


    }
}
