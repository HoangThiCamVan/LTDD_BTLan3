package com.example.passiocoffee;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridMainAdapter extends BaseAdapter {
    Context context;
    int Layout;
    List<GridMain> arrayList;

    public GridMainAdapter(Context context, int layout, List<GridMain> arrayList) {
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
        TextView tvTitle;
        TextView tvTenUuDai;
        TextView tvChiTiet;
        ImageView imgHinhAnh;
        Button bt_chitiet;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null){

            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout,null);
            viewHolder=new ViewHolder();

            //
            viewHolder.tvTitle=(TextView) convertView.findViewById(R.id.tv_title);
            viewHolder.tvTenUuDai=(TextView) convertView.findViewById(R.id.tv_tenuudai);
            viewHolder.tvChiTiet=(TextView) convertView.findViewById(R.id.tv_chitiet);
            viewHolder.imgHinhAnh=(ImageView) convertView.findViewById(R.id.img);
            viewHolder.bt_chitiet=(Button)convertView.findViewById(R.id.bt_chitiet);

            convertView.setTag(viewHolder);


        }else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        //
        viewHolder.tvTitle.setText(arrayList.get(position).title);

        viewHolder.tvTenUuDai.setText(arrayList.get(position).tenUuDai);
        viewHolder.tvChiTiet.setText(arrayList.get(position).chiTiet);
        viewHolder.imgHinhAnh.setImageResource(arrayList.get(position).hinhAnh);
        viewHolder.bt_chitiet.setText(arrayList.get(position).bt_chitiet);

        if (viewHolder.bt_chitiet.getText() =="Chi tiết"){
                viewHolder.bt_chitiet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(context, MainChiTiet.class);
                        context.startActivity(intent);
                    }
                });
        }
        else {
            viewHolder.bt_chitiet.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, MainDatHang.class);
                    context.startActivity(intent);
                }
            });
        }

        return convertView;


    }
}
