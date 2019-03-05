package com.example.myhosapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
Button mybutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mybutton=findViewById(R.id.button);

    }
    public void click(View view) {
        Intent myintent1 = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(myintent1);
    }
        public void quit(View view){
            Intent showDetailActivity = new Intent(this, LoginActivity.class);
            startActivity(showDetailActivity);
    }
}

