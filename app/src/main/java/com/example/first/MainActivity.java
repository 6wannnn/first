package com.example.first;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button tousedtrade, tomain, tochat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        tousedtrade = (Button)findViewById(R.id.tousedtrade);
        tousedtrade.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(MainActivity.this, UsedtradeActivity.class);
                startActivity(a);
                finish();
            }
        });
        tomain = (Button)findViewById(R.id.tomain);
        tomain.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(MainActivity.this, MainActivity.class);
                startActivity(b);
                finish();
            }
        });
        tochat = (Button)findViewById(R.id.tochat);
        tochat.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(MainActivity.this, ChatlistActivity.class);
                startActivity(c);
                finish();
            }
        });

    }
}