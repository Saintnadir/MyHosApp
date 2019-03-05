package com.example.myhosapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class hostelAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[]hostels;
    String[]prices;
    String[]locations;

    public hostelAdapter(Context c, String[] h, String[] p, String[] l){
        hostels=h;
        prices=p;
        locations=l;
        mInflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            }

    @Override
    public int getCount() {
     return hostels.length;
    }

    @Override
    public Object getItem(int position) {
        return hostels[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView)v.findViewById(R.id.nameTextView);
        TextView locationTextView = (TextView)v.findViewById(R.id.locationTextView);
        TextView priceTextView = (TextView)v.findViewById(R.id.priceTextView);

        String hostel= hostels[position];
        String locate= locations[position];
        String cost= prices[position];

        nameTextView.setText(hostel);
        locationTextView.setText(locate);
        priceTextView.setText(cost);

          return v;
    }
}
