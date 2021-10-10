package com.example.first;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ChatlistActivity extends AppCompatActivity {

    Button randBtn, requestBtn, backtomain;
    LinearLayout chatlist1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatlist);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        randBtn = (Button)findViewById(R.id.randBtn);
        randBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ChatlistActivity.this, RandMatchingActivity.class);
                startActivity(a);
                finish();
            }
        });
        requestBtn = (Button)findViewById(R.id.requestBtn);
        requestBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(ChatlistActivity.this, FriendRequestlistActivity.class);
                startActivity(b);
                finish();
            }
        });

        chatlist1 = (LinearLayout)findViewById(R.id.chatlist1);
        chatlist1.setOnClickListener(new LinearLayout.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(ChatlistActivity.this, ChatroomActivity.class);
                startActivity(c);
                finish();
            }
        });

        backtomain = (Button)findViewById(R.id.backtomain);
        backtomain.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(ChatlistActivity.this, MainActivity.class);
                startActivity(d);
                finish();
            }
        });
    }
}