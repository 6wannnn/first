package com.example.first;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ChatroomActivity extends AppCompatActivity {

    Button backtochatlistBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatroom);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        backtochatlistBtn2 = (Button)findViewById(R.id.backtochatlistBtn2);
        backtochatlistBtn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(ChatroomActivity.this, ChatlistActivity.class);
                startActivity(a);
                finish();
            }
        });
    }
}