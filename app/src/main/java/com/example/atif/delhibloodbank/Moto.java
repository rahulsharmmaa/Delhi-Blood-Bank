package com.example.atif.delhibloodbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Moto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
