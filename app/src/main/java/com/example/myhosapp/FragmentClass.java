package com.example.myhosapp;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class FragmentClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_class);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFrag()).commit();


    }
    private BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment fragment = null;
            switch(menuItem.getItemId()){
                case R.id.hom:
                    fragment = new HomeFrag();
                    break;
                case R.id.sea:
                    fragment = new SearchFrag();
                    break;
                default:
                    Toast.makeText(FragmentClass.this, "No Tab Selected", Toast.LENGTH_SHORT).show();
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();



            return true;
        }
    };
}
