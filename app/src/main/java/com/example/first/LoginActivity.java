package com.example.first;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    Button googleloginBtn, naverloginBtn, kakaologinBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //버튼마다 클릭리스너 걸었음 -> 인텐트 다른 엑티비티로 이동필요(로그인 API연동)
        googleloginBtn = (Button) findViewById(R.id.googleloginBtn);
        googleloginBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                googleloginBtn.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent a = new Intent(LoginActivity.this, InterestActivity.class);
                startActivity(a);
                finish();
            }
        });
        naverloginBtn = (Button) findViewById(R.id.naverloginBtn);
        naverloginBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                naverloginBtn.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent b = new Intent(LoginActivity.this, InterestActivity.class);
                startActivity(b);
                finish();
            }
        });
        kakaologinBtn = (Button) findViewById(R.id.kakaologinBtn);
        kakaologinBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                naverloginBtn.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent c = new Intent(LoginActivity.this, InterestActivity.class);
                startActivity(c);
                finish();
            }
        });
    }
}