package com.example.first;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;

public class MainActivity extends AppCompatActivity {

    Button tousedtrade, tomain, tochat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tousedtrade = (Button)findViewById(R.id.tousedtrade);
        tousedtrade.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                tousedtrade.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent a = new Intent(MainActivity.this, UsedtradeActivity.class);
                startActivity(a);
                finish();
            }
        });
        tomain = (Button)findViewById(R.id.tomain);
        tomain.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                tomain.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent b = new Intent(MainActivity.this, MainActivity.class);
                startActivity(b);
                finish();
            }
        });
        tochat = (Button)findViewById(R.id.tochat);
        tochat.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                tochat.setBackgroundColor(Color.rgb(79, 39, 96));
                Intent c = new Intent(MainActivity.this, ChatlistActivity.class);
                startActivity(c);
                finish();
            }
        });
        FirebaseRemoteConfig mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        FirebaseRemoteConfigSettings configSettings = new FirebaseRemoteConfigSettings.Builder()
                .setMinimumFetchIntervalInSeconds(3600)
                .build();
        mFirebaseRemoteConfig.setConfigSettingsAsync(configSettings);
        mFirebaseRemoteConfig.setDefaultsAsync(R.xml.remote_config_defaults);

    }
}