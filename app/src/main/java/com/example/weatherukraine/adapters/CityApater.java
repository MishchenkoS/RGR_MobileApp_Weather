package com.example.weatherukraine.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherukraine.City;
import com.example.weatherukraine.InfoActivity;
import com.example.weatherukraine.R;
import com.example.weatherukraine.StartActivity;

import java.util.List;

public class CityApater extends RecyclerView.Adapter<CityApater.CityAdapterViewHolder> {
    List<City> list;
    Context context;

    public CityApater(List<City> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CityAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_city, parent, false);
        return new CityAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CityAdapterViewHolder holder, int position) {
         City city = list.get(position);
         holder.textView.setText(city.getName());
         holder.imageView.setImageResource(city.getImage());
         holder.cardView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(context, InfoActivity.class);
                 intent.putExtra("name_city", holder.textView.getText().toString());
                 context.startActivity(intent);
             }
         });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CityAdapterViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        CardView cardView;
        public CityAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.icon_city);
            textView = itemView.findViewById(R.id.name_city);
            cardView = itemView.findViewById(R.id.card_city);


        }
    }
}
