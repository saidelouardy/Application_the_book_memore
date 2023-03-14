package com.example.firstprojet.sport;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.firstprojet.R;

import java.util.List;

public class Ttitmentsport extends RecyclerView.Adapter<Ttitmentsport.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardsport;
        TextView textView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView =(TextView) itemView.findViewById(R.id.textrecycleview);
            imageView =(ImageView) itemView.findViewById(R.id.imagerecycleview);
            cardsport =(CardView) itemView.findViewById(R.id.cardsport);
        }
    }
    private InterfaceSportItemclick interfaceSportItemclick;
    private Context context;
    private List<datasport> list;
    public Ttitmentsport(Context context, List<datasport> list , InterfaceSportItemclick interfaceSportItemclick){
        this.interfaceSportItemclick=interfaceSportItemclick;
        this.context=context;
        this.list=list;
    }
    @NonNull
    @Override
    public Ttitmentsport.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(context).inflate(R.layout.desingrecycleview,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Ttitmentsport.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        datasport data =list.get(position);
        holder.textView.setText(data.getTitlesport());
        holder.imageView.setImageResource(data.getImagesport());
        holder.cardsport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfaceSportItemclick.OnClickItmeSport(list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
