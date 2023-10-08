package com.example.leagueoflegends;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button frg1,frg2,frg3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //some changes

        frg1.findViewById(R.id.frangment1);
        frg2.findViewById(R.id.frangment2);
        frg3.findViewById(R.id.frangment3);
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,new Fragment1()).commit();

        frg1.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new Fragment1()).commit();

        });
        frg2.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new Fragment2()).commit();

        });
        frg3.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame,new Fragment3()).commit();

        });

    }
}