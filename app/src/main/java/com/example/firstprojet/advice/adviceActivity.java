package com.example.firstprojet.advice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.firstprojet.R;

public class adviceActivity extends AppCompatActivity {
    TextView titleadvicesport,allAdvicesport,titleadvicefood,allAdvicefood;
    LinearLayout layoutadvicefood,layoutadvicesport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);
        titleadvicesport =findViewById(R.id.titleadvicesport);
        allAdvicesport =findViewById(R.id.allAdvicesport);
        titleadvicefood =findViewById(R.id.titleadvicefood);
        allAdvicefood =findViewById(R.id.allAdvicefood);
        layoutadvicefood =findViewById(R.id.layoutadvicefood);
        layoutadvicesport =findViewById(R.id.layoutadvicesport);

        titleadvicesport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vv = (allAdvicesport.getVisibility() ==View.GONE)? View.VISIBLE:View.GONE;
                TransitionManager.beginDelayedTransition(layoutadvicesport,new AutoTransition());
                allAdvicesport.setVisibility(vv);
            }
        });
        titleadvicefood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vv = (allAdvicefood.getVisibility() ==View.GONE)? View.VISIBLE:View.GONE;
                TransitionManager.beginDelayedTransition(layoutadvicefood,new AutoTransition());
                allAdvicefood.setVisibility(vv);
            }
        });

    }
}