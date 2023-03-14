package com.example.firstprojet.sport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.firstprojet.R;

public class MainActivitys extends AppCompatActivity {
    TextView texts,dess;
    ImageView images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitys);
        texts=findViewById(R.id.texts);
        dess=findViewById(R.id.dess);
        images=findViewById(R.id.images);
        Intent intenttakesport=getIntent();
        texts.setText(intenttakesport.getStringExtra("titles"));
        images.setImageResource(intenttakesport.getIntExtra("images",1));
        dess.setText(intenttakesport.getIntExtra("dess",1));
    }
}