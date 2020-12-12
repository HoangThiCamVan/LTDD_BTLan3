package com.example.passiocoffee;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TichDiemAdapter extends BaseAdapter {
    Context context;
    int Layout;
    List<TichDiem> arrayList;
    public TichDiemAdapter(Context context, int layout, List<TichDiem> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        TextView tvTenCoupon;
        TextView tvHanSd;
        ImageView imgHinhAnh;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout,null);
            viewHolder=new ViewHolder();
            //
            viewHolder.tvTenCoupon=(TextView) convertView.findViewById(R.id.tv_tencoupon);
            viewHolder.tvHanSd=(TextView) convertView.findViewById(R.id.tv_hsd);

            viewHolder.imgHinhAnh=(ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(viewHolder);
        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        //
        viewHolder.tvTenCoupon.setText(arrayList.get(position).tenCoupon);
        viewHolder.tvHanSd.setText(arrayList.get(position).hsd);

        viewHolder.imgHinhAnh.setImageResource(arrayList.get(position).hinhAnh);
        return convertView;
    }
}
