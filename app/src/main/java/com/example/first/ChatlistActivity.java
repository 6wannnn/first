package com.example.first;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ChatlistActivity extends AppCompatActivity {
//    ImageView interest_img_1_1, interest_img_1_2, interest_img_1_3, interest_img_2_1, interest_img_2_2, interest_img_2_3;
//    TextView interest_text_1_1, interest_text_1_2, interest_text_1_3, interest_text_2_1, interest_text_2_2, interest_text_2_3;
//    Button interest_leftBtn,interest_1Btn,interest_2Btn,interest_3Btn,interest_4Btn, interest_rightBtn, nextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatlist);

        //id연동
//        interest_img_1_1 = (ImageView)findViewById(R.id.interest_img_1_1);
//        interest_img_1_2 = (ImageView)findViewById(R.id.interest_img_1_2);
//        interest_img_1_3 = (ImageView)findViewById(R.id.interest_img_1_3);
//        interest_img_2_1 = (ImageView)findViewById(R.id.interest_img_2_1);
//        interest_img_2_2 = (ImageView)findViewById(R.id.interest_img_2_2);
//        interest_img_2_3 = (ImageView)findViewById(R.id.interest_img_2_3);
//
//        interest_text_1_1 = (TextView)findViewById(R.id.interest_text_1_1);
//        interest_text_1_2 = (TextView)findViewById(R.id.interest_text_1_3);
//        interest_text_1_3 = (TextView)findViewById(R.id.interest_text_1_3);
//        interest_text_2_1 = (TextView)findViewById(R.id.interest_text_2_1);
//        interest_text_2_2 = (TextView)findViewById(R.id.interest_text_2_2);
//        interest_text_2_3 = (TextView)findViewById(R.id.interest_text_2_3);
//
//        interest_leftBtn = (Button)findViewById(R.id.interest_leftBtn);
//        interest_leftBtn.setBackgroundColor(Color.WHITE);
//        interest_1Btn = (Button)findViewById(R.id.interest_1Btn);
//        interest_1Btn.setBackgroundColor(Color.WHITE);
//        interest_2Btn = (Button)findViewById(R.id.interest_2Btn);
//        interest_2Btn.setBackgroundColor(Color.WHITE);
//        interest_3Btn = (Button)findViewById(R.id.interest_3Btn);
//        interest_3Btn.setBackgroundColor(Color.WHITE);
//        interest_4Btn = (Button)findViewById(R.id.interest_4Btn);
//        interest_4Btn.setBackgroundColor(Color.WHITE);
//        interest_rightBtn = (Button)findViewById(R.id.interest_rightBtn);
//        interest_rightBtn.setBackgroundColor(Color.WHITE);
//        nextBtn = (Button)findViewById(R.id.nextBtn);
//
//        Button.OnClickListener onClickListener = new Button.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                switch (view.getId()){
//                    case R.id.interest_leftBtn :
////                        current_page_num--;
////                        if (current_page_num == 0){
////                            current_page_num = 1;
////                        }
////                        interest_1Btn.setText(current_page_num);
////                        interest_2Btn.setText(current_page_num+1);
////                        interest_3Btn.setText(current_page_num+2);
////                        interest_4Btn.setText(current_page_num+3);
//                    case R.id.interest_1Btn:
//                        //current_page_num = 1;
//                        interest_1Btn.setBackgroundColor(Color.rgb(79, 39, 96));
//                        interest_2Btn.setBackgroundColor(Color.WHITE);
//                        interest_3Btn.setBackgroundColor(Color.WHITE);
//                        interest_4Btn.setBackgroundColor(Color.WHITE);
//                        interest_img_1_1.setImageResource(R.drawable.icon_camera);
//                        interest_img_1_2.setImageResource(R.drawable.icon_fashion);
//                        interest_img_1_3.setImageResource(R.drawable.icon_makeup);
//                        interest_img_2_1.setImageResource(R.drawable.icon_dance);
//                        interest_img_2_2.setImageResource(R.drawable.icon_food);
//                        interest_img_2_3.setImageResource(R.drawable.icon_travel);
//
//                        interest_text_1_1.setText("사진/영상");
//                        interest_text_1_2.setText("패션");
//                        interest_text_1_3.setText("메이크업");
//                        interest_text_2_1.setText("댄스");
//                        interest_text_2_2.setText("요리");
//                        interest_text_2_3.setText("여행");
//                        break;
//                    case R.id.interest_2Btn:
////                        current_page_num = 2;
//                        interest_2Btn.setBackgroundColor(Color.rgb(79, 39, 96));
//                        interest_1Btn.setBackgroundColor(Color.WHITE);
//                        interest_3Btn.setBackgroundColor(Color.WHITE);
//                        interest_4Btn.setBackgroundColor(Color.WHITE);
//                        interest_img_1_1.setImageResource(R.drawable.icon_health);
//                        interest_img_1_2.setImageResource(R.drawable.icon_camp);
//                        interest_img_1_3.setImageResource(R.drawable.icon_game);
//                        interest_img_2_1.setImageResource(R.drawable.icon_book);
//                        interest_img_2_2.setImageResource(R.drawable.icon_music);
//                        interest_img_2_3.setImageResource(R.drawable.icon_drink);
//
//                        interest_text_1_1.setText("헬스");
//                        interest_text_1_2.setText("캠핑");
//                        interest_text_1_3.setText("게임");
//                        interest_text_2_1.setText("책");
//                        interest_text_2_2.setText("음악");
//                        interest_text_2_3.setText("음주");
//                        break;
//                    case R.id.interest_3Btn:
////                        current_page_num = 3;
//                        interest_3Btn.setBackgroundColor(Color.rgb(79, 39, 96));
//                        interest_1Btn.setBackgroundColor(Color.WHITE);
//                        interest_2Btn.setBackgroundColor(Color.WHITE);
//                        interest_4Btn.setBackgroundColor(Color.WHITE);
//                        interest_img_1_1.setImageResource(R.drawable.icon_health);
//                        interest_img_1_2.setImageResource(R.drawable.icon_camp);
//                        interest_img_1_3.setImageResource(R.drawable.icon_game);
//                        interest_img_2_1.setImageResource(R.drawable.icon_book);
//                        interest_img_2_2.setImageResource(R.drawable.icon_music);
//                        interest_img_2_3.setImageResource(R.drawable.icon_drink);
//
//                        interest_text_1_1.setText("헬스");
//                        interest_text_1_2.setText("캠핑");
//                        interest_text_1_3.setText("게임");
//                        interest_text_2_1.setText("책");
//                        interest_text_2_2.setText("음악");
//                        interest_text_2_3.setText("음주");
//                        break;
//                    case R.id.interest_4Btn:
////                        current_page_num = 4;
//                        interest_4Btn.setBackgroundColor(Color.rgb(79, 39, 96));
//                        interest_1Btn.setBackgroundColor(Color.WHITE);
//                        interest_2Btn.setBackgroundColor(Color.WHITE);
//                        interest_3Btn.setBackgroundColor(Color.WHITE);
//                        interest_img_1_1.setImageResource(R.drawable.icon_health);
//                        interest_img_1_2.setImageResource(R.drawable.icon_camp);
//                        interest_img_1_3.setImageResource(R.drawable.icon_game);
//                        interest_img_2_1.setImageResource(R.drawable.icon_book);
//                        interest_img_2_2.setImageResource(R.drawable.icon_music);
//                        interest_img_2_3.setImageResource(R.drawable.icon_drink);
//
//                        interest_text_1_1.setText("헬스");
//                        interest_text_1_2.setText("캠핑");
//                        interest_text_1_3.setText("게임");
//                        interest_text_2_1.setText("책");
//                        interest_text_2_2.setText("음악");
//                        interest_text_2_3.setText("음주");
//                        break;
//                    case R.id.interest_rightBtn:
////                        current_page_num++;
////                        interest_1Btn.setText(current_page_num);
////                        interest_2Btn.setText(current_page_num+1);
////                        interest_3Btn.setText(current_page_num+2);
////                        interest_4Btn.setText(current_page_num+3);
//                    case R.id.nextBtn :
//                        Intent i = new Intent(ChatlistActivity.this, ProfileActivity.class);
//                        startActivity(i);
//                        finish();
//                }
//            }
//        };
//        interest_leftBtn.setOnClickListener(onClickListener);
//        interest_1Btn.setOnClickListener(onClickListener);
//        interest_2Btn.setOnClickListener(onClickListener);
//        interest_3Btn.setOnClickListener(onClickListener);
//        interest_4Btn.setOnClickListener(onClickListener);
//        interest_rightBtn.setOnClickListener(onClickListener);
//        nextBtn.setOnClickListener(onClickListener);

    }
}