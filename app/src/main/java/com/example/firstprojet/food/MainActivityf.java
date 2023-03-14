package com.example.firstprojet.food;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstprojet.R;

public class MainActivityf extends AppCompatActivity {
    TextView titlef, desf;
    ImageView imagef;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityf);
        titlef=findViewById(R.id.textf);
        desf=findViewById(R.id.desff);
        imagef=findViewById(R.id.imagef);
        Intent intenttake = getIntent();
        titlef.setText(intenttake.getStringExtra("titlef"));
        desf.setText(intenttake.getIntExtra("desf",1));
        imagef.setImageResource(intenttake.getIntExtra("imagef",1));
    }
}