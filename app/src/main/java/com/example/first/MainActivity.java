package com.example.first;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button tousedtrade, tomain, tochat, main_edit_interest, main_edit_introduce;
    TextView main_nickname_line, main_interest_line, main_introduce_line;
    String nickName = ""; //닉네임
    String introduce = ""; //소개글
    String cur_name = ""; //관심사 이름

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setIcon(R.drawable.actionbarlogo);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("모두 모여라");

        tousedtrade = (Button)findViewById(R.id.tousedtrade);
        tomain = (Button)findViewById(R.id.tomain);
        tochat = (Button)findViewById(R.id.tochat);
        main_edit_interest = (Button)findViewById(R.id.main_edit_interest);
        main_edit_introduce = (Button)findViewById(R.id.main_edit_introduce);
        main_nickname_line = (TextView) findViewById(R.id.main_nickname_line);
        main_interest_line = (TextView)findViewById(R.id.main_interest_line);
        main_introduce_line = (TextView)findViewById(R.id.main_introduce_line);

        Intent getfromInterest = getIntent();
        cur_name = getfromInterest.getExtras().getString("interest_name");
        Intent getfromProfile = getIntent();
        nickName = getfromProfile.getExtras().getString("nickname");
        introduce = getfromProfile.getExtras().getString("introduce");
        main_nickname_line.setText(nickName);
        main_interest_line.setText(cur_name);
        main_introduce_line.setText(introduce);

        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.tousedtrade:
                        Intent a = new Intent(MainActivity.this, UsedtradeActivity.class);
                        startActivity(a);
                        break;
                        //finish();
                    case R.id.tomain:
                        Intent b = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(b);
                        break;
                        //finish();
                    case R.id.tochat:
                        Intent c = new Intent(MainActivity.this, ChatlistActivity.class);
                        startActivity(c);
                        break;
                        //finish();
                    case R.id.main_edit_interest:
                        Intent d = new Intent(MainActivity.this, InterestActivity.class);
                        startActivity(d);
                        break;
                        //finish();
                    case R.id.main_edit_introduce:
                        Intent e = new Intent(MainActivity.this, ProfileActivity.class);
                        startActivity(e);
                        break;
                        //finish();
                }
            }
        };
        tousedtrade.setOnClickListener(onClickListener);
        tomain.setOnClickListener(onClickListener);
        tochat.setOnClickListener(onClickListener);
        main_edit_interest.setOnClickListener(onClickListener);
        main_edit_introduce.setOnClickListener(onClickListener);
    }
}