package com.example.firstprojet.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.firstprojet.R;

import java.util.ArrayList;

public class foodActivity extends AppCompatActivity implements Interfacefooditmeclik {
    private  RecyclerView recyclerViewfood;
    private  tritmentfood tritmentfod;
    private  ArrayList<datafood> listfood;

    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        recyclerViewfood =findViewById(R.id.recycleviewfood);
        listfood = new ArrayList<>();
        listfood.add(new datafood("Foods that help increase length ",R.drawable.fiikwih,R.string.definition_eat1));
        listfood.add(new datafood("Turnip",R.drawable.lft,R.string.definition_eat2));
        listfood.add(new datafood("Eggs",R.drawable.bid,R.string.definition_eat3));
        listfood.add(new datafood("Spinach",R.drawable.sbanikh,R.string.definition_eat4));
        listfood.add(new datafood("Whole grains",R.drawable.hbob,R.string.definition_eat5));
        listfood.add(new datafood("Yogurt",R.drawable.zbdaa,R.string.definition_eat6));
        listfood.add(new datafood("chickens",R.drawable.djaj,R.string.definition_eat7));
        listfood.add(new datafood("Islands",R.drawable.jazar,R.string.definition_eat8));
        listfood.add(new datafood("Milk",R.drawable.halib,R.string.definition_eat9));
        listfood.add(new datafood("soybeans",R.drawable.foul,R.string.definition_eat10));
        tritmentfod = new tritmentfood((Context) this,listfood,this);
        recyclerViewfood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewfood.setAdapter(tritmentfod);
    }

    @Override
    public void OnItemClickedfood(datafood datafod) {
        Intent intent = new Intent(foodActivity.this , MainActivityf.class);
        intent.putExtra("titlef",datafod.getTitlefood());
        intent.putExtra("imagef",datafod.getImagefood());
        intent.putExtra("desf",datafod.getDesfood());
        startActivity(intent);
    }
}