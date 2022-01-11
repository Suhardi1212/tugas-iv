package com.example.jsonapijava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.example.jsonapijava.model.DataALgoritma;

import java.util.ArrayList;

public class AdapterAlgoritma extends ArrayAdapter {
    Context context;
    ArrayList<DataALgoritma> datas;
    LayoutInflater layoutInflater;

    ImageView logo;
    TextView title, deskripsi, petunjuk, detail_web;

    public AdapterAlgoritma(Context context, ArrayList<DataALgoritma> data) {
        super(context, R.layout.list_algoritma, data);
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.datas = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.list_algoritma, parent, false);
        DataALgoritma data = datas.get(position);

        logo = convertView.findViewById(R.id.logo);
        title = convertView.findViewById(R.id.nameAlgoritma);
        deskripsi = convertView.findViewById(R.id.deskripsi);
        detail_web = convertView.findViewById(R.id.detail_web);

        Glide
                .with(context)
                .load(data.getLogo())
                .placeholder(R.drawable.ic_refres_foreground)
                .into(logo);
        title.setText(data.getNameAlgoritma());
        deskripsi.setText(data.getDescription());
        detail_web.setText(data.getBaca_lebih_lanjut());

        return convertView;
    }
}
