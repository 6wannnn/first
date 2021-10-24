package com.example.first;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class InterestActivity extends AppCompatActivity {
    ImageView interest_img_1_1, interest_img_1_2, interest_img_1_3, interest_img_2_1, interest_img_2_2, interest_img_2_3;
    TextView interest_text_1_1, interest_text_1_2, interest_text_1_3, interest_text_2_1, interest_text_2_2, interest_text_2_3;
    Button interest_leftBtn,interest_1Btn,interest_2Btn,interest_3Btn,interest_4Btn, interest_rightBtn, nextBtn;
    int current_page_num = 1;
    String cur_name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.interest);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //id연동
        interest_img_1_1 = (ImageView)findViewById(R.id.interest_img_1_1);
        interest_img_1_2 = (ImageView)findViewById(R.id.interest_img_1_2);
        interest_img_1_3 = (ImageView)findViewById(R.id.interest_img_1_3);
        interest_img_2_1 = (ImageView)findViewById(R.id.interest_img_2_1);
        interest_img_2_2 = (ImageView)findViewById(R.id.interest_img_2_2);
        interest_img_2_3 = (ImageView)findViewById(R.id.interest_img_2_3);

        interest_text_1_1 = (TextView)findViewById(R.id.interest_text_1_1);
        interest_text_1_2 = (TextView)findViewById(R.id.interest_text_1_2);
        interest_text_1_3 = (TextView)findViewById(R.id.interest_text_1_3);
        interest_text_2_1 = (TextView)findViewById(R.id.interest_text_2_1);
        interest_text_2_2 = (TextView)findViewById(R.id.interest_text_2_2);
        interest_text_2_3 = (TextView)findViewById(R.id.interest_text_2_3);

        interest_leftBtn = (Button)findViewById(R.id.interest_leftBtn);
        interest_leftBtn.setBackgroundColor(Color.WHITE);
        interest_1Btn = (Button)findViewById(R.id.interest_1Btn);
        interest_1Btn.setBackgroundColor(Color.rgb(79, 39, 96));
        interest_2Btn = (Button)findViewById(R.id.interest_2Btn);
        interest_2Btn.setBackgroundColor(Color.WHITE);
        interest_3Btn = (Button)findViewById(R.id.interest_3Btn);
        interest_3Btn.setBackgroundColor(Color.WHITE);
        interest_4Btn = (Button)findViewById(R.id.interest_4Btn);
        interest_4Btn.setBackgroundColor(Color.WHITE);
        interest_rightBtn = (Button)findViewById(R.id.interest_rightBtn);
        interest_rightBtn.setBackgroundColor(Color.WHITE);
        nextBtn = (Button)findViewById(R.id.nextBtn);


        Button.OnClickListener onClickListener = new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    //클릭한 이미지에 따라 이름 전달 -> 받는 인텐트에서 이름을 기준으로 사진 연동
                    case R.id.interest_img_1_1:
                        cur_name = interest_text_1_1.getText().toString();
                        break;
                    case R.id.interest_img_1_2:
                        cur_name = interest_text_1_2.getText().toString();
                        break;
                    case R.id.interest_img_1_3:
                        cur_name = interest_text_1_3.getText().toString();
                        break;
                    case R.id.interest_img_2_1:
                        cur_name = interest_text_2_1.getText().toString();
                        break;
                    case R.id.interest_img_2_2:
                        cur_name = interest_text_2_2.getText().toString();
                        break;
                    case R.id.interest_img_2_3:
                        cur_name = interest_text_2_3.getText().toString();
                        break;

                    //왼쪽버튼
                    case R.id.interest_leftBtn :
                        switch(interest_1Btn.getText().toString()){
                            case "5":
                                interest_1Btn.setText("1");
                                interest_2Btn.setText("2");
                                interest_3Btn.setText("3");
                                interest_4Btn.setText("4");
                                break;
                            case "9":
                                interest_1Btn.setText("5");
                                interest_2Btn.setText("6");
                                interest_3Btn.setText("7");
                                interest_4Btn.setText("8");
                                break;
                            case "13":
                                interest_1Btn.setText("9");
                                interest_2Btn.setText("10");
                                interest_3Btn.setText("11");
                                interest_4Btn.setText("12");
                                break;
                        }
                        break;

                    //2번째 버튼(1,5,9,13)
                    case R.id.interest_1Btn:
                        interest_1Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                        interest_2Btn.setBackgroundColor(Color.WHITE);
                        interest_3Btn.setBackgroundColor(Color.WHITE);
                        interest_4Btn.setBackgroundColor(Color.WHITE);
                        switch (interest_1Btn.getText().toString()){
                            case "1":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("사진/영상");
                                interest_text_1_2.setText("패션");
                                interest_text_1_3.setText("메이크업");
                                interest_text_2_1.setText("댄스");
                                interest_text_2_2.setText("요리");
                                interest_text_2_3.setText("여행");
                                break;
                            case "5":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("51");
                                interest_text_1_2.setText("52");
                                interest_text_1_3.setText("53");
                                interest_text_2_1.setText("54");
                                interest_text_2_2.setText("55");
                                interest_text_2_3.setText("56");
                                break;
                            case "9":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("91");
                                interest_text_1_2.setText("92");
                                interest_text_1_3.setText("93");
                                interest_text_2_1.setText("94");
                                interest_text_2_2.setText("95");
                                interest_text_2_3.setText("96");
                                break;
                            case "13":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("131");
                                interest_text_1_2.setText("132");
                                interest_text_1_3.setText("133");
                                interest_text_2_1.setText("134");
                                interest_text_2_2.setText("135");
                                interest_text_2_3.setText("136");
                                break;
                        }
                        break;

                    //2번째 버튼(2,6,10,14)
                    case R.id.interest_2Btn:
                        interest_2Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                        interest_1Btn.setBackgroundColor(Color.WHITE);
                        interest_3Btn.setBackgroundColor(Color.WHITE);
                        interest_4Btn.setBackgroundColor(Color.WHITE);

                        switch (interest_2Btn.getText().toString()){
                            case "2":
                                interest_img_1_1.setImageResource(R.drawable.icon_health);
                                interest_img_1_2.setImageResource(R.drawable.icon_camp);
                                interest_img_1_3.setImageResource(R.drawable.icon_game);
                                interest_img_2_1.setImageResource(R.drawable.icon_book);
                                interest_img_2_2.setImageResource(R.drawable.icon_music);
                                interest_img_2_3.setImageResource(R.drawable.icon_drink);

                                interest_text_1_1.setText("헬스");
                                interest_text_1_2.setText("캠핑");
                                interest_text_1_3.setText("게임");
                                interest_text_2_1.setText("책");
                                interest_text_2_2.setText("음악");
                                interest_text_2_3.setText("음주");
                                break;
                            case "6":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("61");
                                interest_text_1_2.setText("62");
                                interest_text_1_3.setText("63");
                                interest_text_2_1.setText("64");
                                interest_text_2_2.setText("65");
                                interest_text_2_3.setText("66");
                                break;
                            case "10":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("101");
                                interest_text_1_2.setText("102");
                                interest_text_1_3.setText("103");
                                interest_text_2_1.setText("104");
                                interest_text_2_2.setText("105");
                                interest_text_2_3.setText("106");
                                break;
                            case "14":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("141");
                                interest_text_1_2.setText("142");
                                interest_text_1_3.setText("143");
                                interest_text_2_1.setText("144");
                                interest_text_2_2.setText("145");
                                interest_text_2_3.setText("146");
                                break;
                        }
                        break;

                    //3번째 버튼(3,7,11,15)
                    case R.id.interest_3Btn:
                        interest_3Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                        interest_1Btn.setBackgroundColor(Color.WHITE);
                        interest_2Btn.setBackgroundColor(Color.WHITE);
                        interest_4Btn.setBackgroundColor(Color.WHITE);

                        switch (interest_3Btn.getText().toString()){
                            case "3":
                                interest_img_1_1.setImageResource(R.drawable.icon_health);
                                interest_img_1_2.setImageResource(R.drawable.icon_camp);
                                interest_img_1_3.setImageResource(R.drawable.icon_game);
                                interest_img_2_1.setImageResource(R.drawable.icon_book);
                                interest_img_2_2.setImageResource(R.drawable.icon_music);
                                interest_img_2_3.setImageResource(R.drawable.icon_drink);

                                interest_text_1_1.setText("헬스");
                                interest_text_1_2.setText("캠핑");
                                interest_text_1_3.setText("게임");
                                interest_text_2_1.setText("책");
                                interest_text_2_2.setText("음악");
                                interest_text_2_3.setText("음주");
                                break;
                            case "7":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("71");
                                interest_text_1_2.setText("72");
                                interest_text_1_3.setText("73");
                                interest_text_2_1.setText("74");
                                interest_text_2_2.setText("75");
                                interest_text_2_3.setText("76");
                                break;
                            case "11":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("111");
                                interest_text_1_2.setText("112");
                                interest_text_1_3.setText("113");
                                interest_text_2_1.setText("114");
                                interest_text_2_2.setText("115");
                                interest_text_2_3.setText("116");
                                break;
                            case "15":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("151");
                                interest_text_1_2.setText("152");
                                interest_text_1_3.setText("153");
                                interest_text_2_1.setText("154");
                                interest_text_2_2.setText("155");
                                interest_text_2_3.setText("156");
                                break;
                        }
                        break;

                    //4번째 버튼(4,8,12,16)
                    case R.id.interest_4Btn:
                        interest_4Btn.setBackgroundColor(Color.rgb(79, 39, 96));
                        interest_1Btn.setBackgroundColor(Color.WHITE);
                        interest_2Btn.setBackgroundColor(Color.WHITE);
                        interest_3Btn.setBackgroundColor(Color.WHITE);

                        switch (interest_4Btn.getText().toString()){
                            case "4":
                                interest_img_1_1.setImageResource(R.drawable.icon_health);
                                interest_img_1_2.setImageResource(R.drawable.icon_camp);
                                interest_img_1_3.setImageResource(R.drawable.icon_game);
                                interest_img_2_1.setImageResource(R.drawable.icon_book);
                                interest_img_2_2.setImageResource(R.drawable.icon_music);
                                interest_img_2_3.setImageResource(R.drawable.icon_drink);

                                interest_text_1_1.setText("헬스");
                                interest_text_1_2.setText("캠핑");
                                interest_text_1_3.setText("게임");
                                interest_text_2_1.setText("책");
                                interest_text_2_2.setText("음악");
                                interest_text_2_3.setText("음주");
                                break;
                            case "8":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("81");
                                interest_text_1_2.setText("82");
                                interest_text_1_3.setText("83");
                                interest_text_2_1.setText("84");
                                interest_text_2_2.setText("85");
                                interest_text_2_3.setText("86");
                                break;
                            case "12":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("121");
                                interest_text_1_2.setText("122");
                                interest_text_1_3.setText("123");
                                interest_text_2_1.setText("124");
                                interest_text_2_2.setText("125");
                                interest_text_2_3.setText("126");
                                break;
                            case "16":
                                interest_img_1_1.setImageResource(R.drawable.icon_camera);
                                interest_img_1_2.setImageResource(R.drawable.icon_fashion);
                                interest_img_1_3.setImageResource(R.drawable.icon_makeup);
                                interest_img_2_1.setImageResource(R.drawable.icon_dance);
                                interest_img_2_2.setImageResource(R.drawable.icon_food);
                                interest_img_2_3.setImageResource(R.drawable.icon_travel);

                                interest_text_1_1.setText("161");
                                interest_text_1_2.setText("162");
                                interest_text_1_3.setText("163");
                                interest_text_2_1.setText("164");
                                interest_text_2_2.setText("165");
                                interest_text_2_3.setText("166");
                                break;
                        }
                        break;

                    //오른쪽버튼
                    case R.id.interest_rightBtn:
                        switch(interest_1Btn.getText().toString()) {
                            case "1":
                                interest_1Btn.setText("5");
                                interest_2Btn.setText("6");
                                interest_3Btn.setText("7");
                                interest_4Btn.setText("8");
                                break;
                            case "5":
                                interest_1Btn.setText("9");
                                interest_2Btn.setText("10");
                                interest_3Btn.setText("11");
                                interest_4Btn.setText("12");
                                break;
                            case "9":
                                interest_1Btn.setText("13");
                                interest_2Btn.setText("14");
                                interest_3Btn.setText("15");
                                interest_4Btn.setText("16");
                                break;
                        }
                        break;

                    //다음버튼
                    case R.id.nextBtn :
                        //프로필설정으로 선택한 카테고리 이름 보내기
                        Intent a = new Intent(InterestActivity.this, ProfileActivity.class);
                        a.putExtra("interest_name",cur_name);
                        startActivity(a);
                }
            }
        };

        //클릭리스너 달기
        interest_leftBtn.setOnClickListener(onClickListener);
        interest_1Btn.setOnClickListener(onClickListener);
        interest_2Btn.setOnClickListener(onClickListener);
        interest_3Btn.setOnClickListener(onClickListener);
        interest_4Btn.setOnClickListener(onClickListener);
        interest_rightBtn.setOnClickListener(onClickListener);
        nextBtn.setOnClickListener(onClickListener);
        interest_img_1_1.setOnClickListener(onClickListener);
        interest_img_1_2.setOnClickListener(onClickListener);
        interest_img_1_3.setOnClickListener(onClickListener);
        interest_img_2_1.setOnClickListener(onClickListener);
        interest_img_2_2.setOnClickListener(onClickListener);
        interest_img_2_3.setOnClickListener(onClickListener);
    }
}