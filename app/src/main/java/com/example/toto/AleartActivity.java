package com.example.toto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import static com.example.toto.SelectActivity.VALUE;

public class AleartActivity extends AppCompatActivity {

    private String value;
    private TextView alertTV;
    private LottieAnimationView loopAnimation,seatBeltAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aleart);

        init();

        value = getIntent().getStringExtra(VALUE);

        if(value.equals(SelectActivity.PICK_UP)){
            alertTV.setText("Please Wait...");
            loopAnimation.setVisibility(View.VISIBLE);
            seatBeltAnimation.setVisibility(View.GONE);
        }
        else{
            alertTV.setText("Sit Carefully...");
            loopAnimation.setVisibility(View.GONE);
            seatBeltAnimation.setVisibility(View.VISIBLE);
        }


    }

    private void init() {
        alertTV = findViewById(R.id.alertSMSTV);
        loopAnimation = findViewById(R.id.animationLoopView);
        seatBeltAnimation = findViewById(R.id.animationView);
    }
}