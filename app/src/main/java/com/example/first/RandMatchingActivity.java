package com.example.first;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RandMatchingActivity extends AppCompatActivity {

    Button backtomain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.randmatching);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        backtomain3 = (Button)findViewById(R.id.backtomain3);
        backtomain3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(RandMatchingActivity.this, ChatlistActivity.class);
                startActivity(d);
                finish();
            }
        });
    }
}