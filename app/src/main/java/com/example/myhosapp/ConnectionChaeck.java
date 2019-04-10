package com.example.myhosapp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ConnectionChaeck extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection_chaeck);

        imageView =findViewById(R.id.conimge);
        textView = findViewById(R.id.context);
        button = findViewById(R.id.connbtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verfyconnection();
            }
        });


    }
    public void verfyconnection(){
        boolean wificonn;
        boolean mobileconn;

        ConnectivityManager con = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = con.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){

            wificonn = networkInfo.getType()==ConnectivityManager.TYPE_WIFI;
            mobileconn = networkInfo.getType()==ConnectivityManager.TYPE_MOBILE;
            if (wificonn){
                imageView.setImageResource(R.drawable.ic_wifi_tethering_wifi);
                textView.setText("YOU ARE CONNECTED TO WIFI");

            }
            else if(mobileconn){
                imageView.setImageResource(R.drawable.ic_action_mobile);
                textView.setText("YOU ARE CONNECTED TO MOBILE DATA");

            }

        }
        else {
            textView.setText("YOU ARE NOT CONNECTED TO ANY INTERNET");

        }
    }
}
