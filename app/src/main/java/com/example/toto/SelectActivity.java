package com.example.toto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectActivity extends AppCompatActivity {

    public static final String VALUE = "Value";
    public static final String DROP_OUT = "Drop Out";
    public static final String PICK_UP = "PICK_UP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
    }

    public void pickup(View view) {

        intentToMainActivity(DROP_OUT);
    }

    private void intentToMainActivity(String value) {

        Intent intent = new Intent(SelectActivity.this,MainActivity.class);
        intent.putExtra(VALUE,value);
        startActivity(intent);
    }

    public void drop_out(View view) {

        intentToMainActivity(PICK_UP);
    }


}