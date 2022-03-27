package com.example.voice_mail_fyp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;


public class OpenActivity extends AppCompatActivity {
    private static int Splash_time = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent HomeIntent = new Intent(OpenActivity.this, UserDetailsActivity.class);
                startActivity(HomeIntent);
                finish();
            }

        }, Splash_time);
    }
}