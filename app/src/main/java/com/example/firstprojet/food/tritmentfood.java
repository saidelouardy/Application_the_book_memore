package com.example.firstprojet.food;

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

public class tritmentfood  extends RecyclerView.Adapter<tritmentfood.ViewHolder> {
    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardfood;
        TextView textfod;
        ImageView imagefod;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardfood=(CardView) itemView.findViewById(R.id.cardfood);
            textfod = (TextView) itemView.findViewById(R.id.textrecycleviewfood);
            imagefod = (ImageView) itemView.findViewById(R.id.imagerecycleviewfood);
        }
    }
    private Interfacefooditmeclik interfacefooditmeclik;

    private Context contextfood;
    private List<datafood> listfood;
    public tritmentfood(Context contextfood , List<datafood> listfood , Interfacefooditmeclik interfacefooditmeclik){
        this.contextfood=contextfood;
        this.listfood=listfood;
        this.interfacefooditmeclik = interfacefooditmeclik;
    }
    @NonNull
    @Override
    public tritmentfood.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view =  LayoutInflater.from(contextfood).inflate(R.layout.desingrecycleviewfod,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tritmentfood.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        datafood datafod = listfood.get(position);
        holder.textfod.setText(datafod.getTitlefood());
        holder.imagefod.setImageResource(datafod.getImagefood());
        holder.cardfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                interfacefooditmeclik.OnItemClickedfood(listfood.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listfood.size();
    }


}
