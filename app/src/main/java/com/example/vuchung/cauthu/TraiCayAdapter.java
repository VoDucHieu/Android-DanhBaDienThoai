package com.example.vuchung.cauthu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by VuChung on 3/7/2018.
 */

public class TraiCayAdapter extends BaseAdapter{
    private Context context;
    private int layout;
    private List<CauThu> cauThuList;

    public TraiCayAdapter(Context context, int layout, List<CauThu> cauThuList) {
        this.context = context;
        this.layout = layout;
        this.cauThuList = cauThuList;
    }

    @Override
    public int getCount() {
        return cauThuList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        TextView txtTen=(TextView) view.findViewById(R.id.textviewten);
        TextView txtMota=(TextView) view.findViewById(R.id.textviewmota);
        ImageView imgHinh=(ImageView) view.findViewById(R.id.imageviewhinh);
        CauThu cauThu = cauThuList.get(i);
        txtTen.setText(cauThu.getTen());
        txtMota.setText(cauThu.getMota());
        imgHinh.setImageResource(cauThu.getHinh());

        return view;
    }
}
