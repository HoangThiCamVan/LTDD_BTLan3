package com.example.passiocoffee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TabHost;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainRewards extends AppCompatActivity {
    ListView lvDoiUuDai,lvUdcb ;
    ArrayList<Rewards> mangDoiUuDai;
    ArrayList<TichDiem> mangUdcb;
    Button tlmain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);



        lvDoiUuDai=(ListView) findViewById(R.id.lv_doiuudai);
        lvUdcb=(ListView) findViewById(R.id.lv_udcb);



        mangDoiUuDai= new ArrayList<Rewards>();
        mangUdcb= new ArrayList<TichDiem>();



        //thêm món ăn vào mảng
            mangDoiUuDai.add(new Rewards("HOT DEAL - MIỄN PHÍ UPSIZE  ","199",R.drawable.cf));
        mangDoiUuDai.add(new Rewards("VOUCHER MIỄN PHÍ UPSIZE  ","199",R.drawable.cf));
        //thêm món ăn vào mảng
        mangUdcb.add(new TichDiem("Mua 1 tặng 1 cho đơn hàng delivery (giao tận nơi) đầu tiên","Hạn sử dụng đến 22/12/2020",R.drawable.coffee2));
        mangUdcb.add(new TichDiem("Ưu đãi 25% khi đặt Pick Up (tự đến lấy) từ 2 món","Hạn sử dụng đến 30/11/2020",R.drawable.pickup));




        final RewardsAdapter RewardsAdapter = new RewardsAdapter(
                MainRewards.this,
                R.layout.product_listrewards,
                mangDoiUuDai
        );
        final TichDiemAdapter RewardsAdapter2 = new TichDiemAdapter(
                MainRewards.this,
                R.layout.product_listtichdiem,
                mangUdcb
        );


        lvDoiUuDai.setAdapter(RewardsAdapter);
        lvUdcb.setAdapter(RewardsAdapter2);





        //
        //bắt đầu tabhost
        TabHost tabhost = (TabHost) findViewById(R.id.tabhost);

        // setting up the tab host
        tabhost.setup();

        // Code thêm Tab 1 vào tabhost
        TabHost.TabSpec spec = tabhost.newTabSpec("Đổi ưu đãi");
        spec.setContent(R.id.tab1);

        // setting the name of the tab 1 as "Tab One"
        spec.setIndicator("Đổi ưu đãi");

        //thêm  tab vào tabhost
        tabhost.addTab(spec);

        // Code thêm Tab 2 vào tabhost
        spec = tabhost.newTabSpec("Ưu đãi của bạn");
        spec.setContent(R.id.tab2);

        // setting the name of the tab 1 as "Tab Two"
        spec.setIndicator("Ưu đãi của bạn");
        tabhost.addTab(spec);

        tlmain=(Button) findViewById(R.id.bt_tl_main);
        tlmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainRewards.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
