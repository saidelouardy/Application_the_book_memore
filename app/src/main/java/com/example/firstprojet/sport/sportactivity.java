package com.example.firstprojet.sport;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;

import com.example.firstprojet.R;

import java.util.ArrayList;

public class sportactivity extends AppCompatActivity  implements InterfaceSportItemclick{
    private  RecyclerView recyclerView;
    private Ttitmentsport tritmentsport;
    private  ArrayList<datasport> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportactivity);
        recyclerView=findViewById(R.id.recycleviewsport);
        list=new ArrayList<>();
        list.add(new datasport("Benefits of exercise to increase height",R.drawable.tamrin,R.string.definition_sport1));
        list.add(new datasport("Pelvic lift",R.drawable.rfaa,R.string.definition_sport2));
        list.add(new datasport("Cobra extension",R.drawable.koubra,R.string.definition_sport6));
        list.add(new datasport("Swimming",R.drawable.sibhaa,R.string.definition_sport3));
        list.add(new datasport("Running",R.drawable.jraa,R.string.definition_sport4));
        list.add(new datasport("Stretching exercises",R.drawable.tmadad,R.string.definition_sport5));
        list.add(new datasport("Stretching of the spine forward",R.drawable.tmadodliamam,R.string.definition_sport7));
        list.add(new datasport("Hanging tape",R.drawable.tjbad,R.string.definition_sport8));
        list.add(new datasport("Stretching forward",R.drawable.masrjlikbjoj,R.string.definition_sport9));
        tritmentsport =new Ttitmentsport(this,list,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(tritmentsport);
    }

    @Override
    public void OnClickItmeSport(datasport datsport) {
        Intent intentsport = new Intent(sportactivity.this, MainActivitys.class);
        intentsport.putExtra("titles",datsport.getTitlesport());
        intentsport.putExtra("images",datsport.getImagesport());
        intentsport.putExtra("dess",datsport.getDessport());
        startActivity(intentsport);
    }
}
