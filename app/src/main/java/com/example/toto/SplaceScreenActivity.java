package com.example.toto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplaceScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace_screen);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(SplaceScreenActivity.this, SelectActivity.class));
                finish();
            }
        }, 3000);

    }
}