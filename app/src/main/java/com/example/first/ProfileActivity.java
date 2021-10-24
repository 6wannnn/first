package com.example.first;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    EditText et_name, et_introduce;
    Button nextBtn2;
    ImageView selected_interest_image;
    String cur_name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        selected_interest_image = (ImageView)findViewById(R.id.selected_interest_image);
        et_name = (EditText)findViewById(R.id.et_name);
        et_introduce = (EditText)findViewById(R.id.et_introduce);
        nextBtn2 = (Button)findViewById(R.id.nextBtn2);

        Intent getfromInterest = getIntent();
        cur_name = getfromInterest.getExtras().getString("interest_name");
        switch (cur_name){
            case "사진/영상":
                selected_interest_image.setImageResource(R.drawable.icon_camera);
                break;
            case "패션":
                selected_interest_image.setImageResource(R.drawable.icon_fashion);
                break;
            case "메이크업":
                selected_interest_image.setImageResource(R.drawable.icon_makeup);
                break;
            case "댄스":
                selected_interest_image.setImageResource(R.drawable.icon_dance);
                break;
            case "요리":
                selected_interest_image.setImageResource(R.drawable.icon_food);
                break;
            case "여행":
                selected_interest_image.setImageResource(R.drawable.icon_travel);
                break;
            case "헬스":
                selected_interest_image.setImageResource(R.drawable.icon_health);
                break;
            case "캠핑":
                selected_interest_image.setImageResource(R.drawable.icon_camp);
                break;
            case "게임":
                selected_interest_image.setImageResource(R.drawable.icon_game);
                break;
            case "책":
                selected_interest_image.setImageResource(R.drawable.icon_book);
                break;
            case "음악":
                selected_interest_image.setImageResource(R.drawable.icon_music);
                break;
            case "음주":
                selected_interest_image.setImageResource(R.drawable.icon_drink);
                break;
        }

        nextBtn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfileActivity.this, MainActivity.class);
                i.putExtra("nickname", et_name.getText().toString());
                i.putExtra("introduce", et_introduce.getText().toString());
                i.putExtra("interest_name",cur_name);
                startActivity(i);
                //finish();
            }
        });
    }
}