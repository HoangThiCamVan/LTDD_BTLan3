package com.example.passiocoffee;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DatHangAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<DatHang> arrayDatHang;

    public  DatHangAdapter(Context context,int layout, List<DatHang> DHList){
        myContext= context;
        myLayout = layout;
        arrayDatHang= DHList;

    }

    @Override
    public int getCount() {
        return arrayDatHang.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView= inflater.inflate(myLayout,null);

        // Anhs Xạ và Gán Gía Trị
        //TextView txttitle = (TextView) convertView.findViewById(R.id.tv_title);
      //  txttitle.setText(arrayDatHang.get(position).title);
        TextView txtTen =(TextView) convertView.findViewById(R.id.tv_tenmon);
        txtTen.setText(arrayDatHang.get(position).tenMon);
        TextView txtGia = (TextView) convertView.findViewById(R.id.tv_giatien);
        txtGia.setText(arrayDatHang.get(position).giaTien+ "");
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.img);
        imgHinh.setImageResource(arrayDatHang.get(position).hinhAnh);

        return convertView;
    }


}