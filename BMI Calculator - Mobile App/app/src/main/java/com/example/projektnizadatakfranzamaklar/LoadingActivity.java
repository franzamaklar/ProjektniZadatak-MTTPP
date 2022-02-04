package com.example.projektnizadatakfranzamaklar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class LoadingActivity extends AppCompatActivity {

    private ImageView logo;
    private TextView loading_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        logo = findViewById(R.id.logo);
        loading_text = findViewById(R.id.loading_text);
        startLoop();
    }

    private void startLoop() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Utils.switchActivity(LoadingActivity.this, MainActivity.class, true);
            }
        }, 2000);


    }
}