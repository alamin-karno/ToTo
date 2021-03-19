package com.example.toto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static com.example.toto.SelectActivity.VALUE;

public class MainActivity extends AppCompatActivity {

    private String value;
    private String ScreenName = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       value = getIntent().getStringExtra(VALUE);

       if(value.equals(SelectActivity.DROP_OUT)){
           ScreenName = SelectActivity.DROP_OUT;
       }
       else{
           ScreenName = SelectActivity.PICK_UP;
       }

    }

    public void AB01(View view) {
        intentToAlertActivity(ScreenName);
    }

    public void AB04(View view) {
        intentToAlertActivity(ScreenName);
    }

    public void Auditorium(View view) {
        intentToAlertActivity(ScreenName);
    }

    public void Main_gate(View view) {
        intentToAlertActivity(ScreenName);
    }

    private void intentToAlertActivity(String value) {

        Intent intent = new Intent(MainActivity.this,AleartActivity.class);
        intent.putExtra(VALUE,value);
        startActivity(intent);
    }
}