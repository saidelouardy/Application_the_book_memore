package com.example.firstprojet.prancipale;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.example.firstprojet.R;
import com.example.firstprojet.prancipale.MainActivity;

import java.util.Timer;
import java.util.TimerTask;

public class firstpage extends AppCompatActivity {
    ProgressBar progressBar;
    int count = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        prg();
        Handler handler =new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        },9000);
    }

    private void prg() {
        progressBar =(ProgressBar) findViewById(R.id.progrss);
        Timer timer = new Timer();
        TimerTask timerTask =new TimerTask() {
            @Override
            public void run() {
             count++;
             progressBar.setProgress(count);
             if (count == 100){
                 timer.cancel();
             }
            }
        };
        timer.schedule(timerTask,0,100);
    }

}