package com.example.myhosapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    ListView myListView;
    String[]hostels;
    String[]prices;
    String[]locations;
    Button qt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button mybutton;

        Resources res =getResources();
        myListView =findViewById(R.id.myListView);
        hostels = res.getStringArray(R.array.hostels);
        prices =res.getStringArray(R.array.prices);
        locations=res.getStringArray(R.array.locations);

        hostelAdapter hostelAdapter= new hostelAdapter(this, hostels, prices, locations);
        myListView.setAdapter(hostelAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent showDetailActivity = new Intent(getApplicationContext(), DetailActivity.class);
                showDetailActivity.putExtra("com.example.HOSTEL_INDEX", position);
                startActivity(showDetailActivity);
            }
        });


        }

    }