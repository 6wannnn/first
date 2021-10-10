package com.example.first;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FriendRequestlistActivity extends AppCompatActivity {

    Button backtochatlistBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friendrequestlist);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        backtochatlistBtn = (Button)findViewById(R.id.backtochatlistBtn);
        backtochatlistBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(FriendRequestlistActivity.this, ChatlistActivity.class);
                startActivity(a);
                finish();
            }
        });
    }
}