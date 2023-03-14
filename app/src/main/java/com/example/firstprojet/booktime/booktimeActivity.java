package com.example.firstprojet.booktime;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.firstprojet.R;

public class booktimeActivity extends AppCompatActivity {
    LinearLayout layoutbooktime;
    EditText editedaybooktime,editedescriptionbooktime;
    Button senddtatDateDescription;
    TextView textbooktimeday,textbooktimedescription;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booktime);
        editedaybooktime =findViewById(R.id.editedaybooktime);
        layoutbooktime=findViewById(R.id.layoutbooktime);
        editedescriptionbooktime = findViewById(R.id.editedescriptionbooktime);
        senddtatDateDescription =findViewById(R.id.senddtatDateDescription);
        textbooktimeday = findViewById(R.id.textbooktimeday);
        textbooktimedescription =findViewById(R.id.textbooktimedescription);
        senddtatDateDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textbooktimeday.setText(editedaybooktime.getText().toString());
                textbooktimedescription.setText(editedescriptionbooktime.getText().toString());
            }
        });
        textbooktimeday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int vv = (textbooktimedescription.getVisibility() ==View.GONE)? View.VISIBLE:View.GONE;
                TransitionManager.beginDelayedTransition(layoutbooktime,new AutoTransition());
                textbooktimedescription.setVisibility(vv);
            }
        });
    }

}