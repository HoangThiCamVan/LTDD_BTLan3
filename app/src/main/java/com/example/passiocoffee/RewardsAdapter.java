package com.example.passiocoffee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RewardsAdapter extends BaseAdapter {
    Context myContext;
    int myLayout;
    List<Rewards> arrayRewards;

    public  RewardsAdapter(Context context,int layout, List<Rewards> RWList){
        myContext= context;
        myLayout = layout;
        arrayRewards= RWList;

    }

    @Override
    public int getCount() {
        return arrayRewards.size();
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
        TextView txtTen =(TextView) convertView.findViewById(R.id.tv_tenrewards);
        txtTen.setText(arrayRewards.get(position).tenRewards);
        TextView txtSoXu = (TextView) convertView.findViewById(R.id.tv_soxu);
        txtSoXu.setText(arrayRewards.get(position).soXu+ "");
        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.img);
        imgHinh.setImageResource(arrayRewards.get(position).hinhAnh);

        return convertView;
    }

}
