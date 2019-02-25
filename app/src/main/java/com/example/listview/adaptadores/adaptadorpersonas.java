package com.example.listview.adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.listview.R;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class adaptadorpersonas extends BaseAdapter {

    ArrayList<personas> lg;
    Context c;

    public adaptadorpersonas(ArrayList<Personas> lp, Context c) {

    this.lp = lp;
    this.c = c;


    }


    @Override
    public int getCount() {
        return lp.size();
    }

    @Override
    public Object getItem(int position) {
        return lp.get(position);
    }

    @Override
    public long getItemId(int position) {
        return lp.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup Parent) {
        View v = convertView;

        if(convertView == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inf.inflate(R.layout.Main2Activity);
        }

        personas pe = items.get(position);
        TextView nombre = (TextView) convertView.findViewById(R.id.nombre);
        nombre.setText(pe.getTittle());

   return v;

    }
}
