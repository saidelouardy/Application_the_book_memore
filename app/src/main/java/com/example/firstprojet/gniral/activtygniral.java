package com.example.firstprojet.gniral;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstprojet.R;
import com.example.firstprojet.advice.adviceActivity;
import com.example.firstprojet.booktime.booktimeActivity;
import com.example.firstprojet.food.foodActivity;
import com.example.firstprojet.sport.sportactivity;

public class activtygniral extends AppCompatActivity  implements View.OnClickListener{
    TextView fname,lname;
    ImageView food,sport,advice,booktimeginiral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activtygniral);
        fname= findViewById(R.id.fname);
        lname=findViewById(R.id.lname);
        food =findViewById(R.id.food);
        sport=findViewById(R.id.sport);
        advice=findViewById(R.id.advice);
        booktimeginiral=findViewById(R.id.booktimeginiral);
        food.setOnClickListener(this);
        sport.setOnClickListener(this);
        advice.setOnClickListener(this);
        booktimeginiral.setOnClickListener(this);

        Bundle b =getIntent().getExtras();
        fname.setText(b.getString("fname"));
        lname.setText(b.getString("lname"));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sport:
                if (sport.isClickable()) {
                    Intent sportintent =  new Intent(activtygniral.this, sportactivity.class);
                    startActivity(sportintent);
                }
                break;
            case R.id.food:
                if (food.isClickable()) {
                    Intent foodintent =  new Intent(activtygniral.this, foodActivity.class);
                    startActivity(foodintent);
                }
                break;
            case R.id.advice:
                if (advice.isClickable()) {
                    Intent adviceintent =  new Intent(activtygniral.this, adviceActivity.class);
                    startActivity(adviceintent);
                }
                break;
            case R.id.booktimeginiral:
                if (booktimeginiral.isClickable()) {
                    Intent fintent =  new Intent(activtygniral.this, booktimeActivity.class);
                    startActivity(fintent);
                }
                break;
        }
    }
}