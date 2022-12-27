package com.example.weatherukraine.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weatherukraine.R;

import java.util.List;

public class CityTimeInfoAdapter extends RecyclerView.Adapter<CityTimeInfoAdapter.CityTimeInfoAdapterViewHolder> {

    List<com.example.weatherukraine.retrofit.forecast.List> list;
    Context context;

    public CityTimeInfoAdapter(List<com.example.weatherukraine.retrofit.forecast.List> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public CityTimeInfoAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CityTimeInfoAdapterViewHolder(LayoutInflater.from(context).inflate(R.layout.weather_time_info, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CityTimeInfoAdapterViewHolder holder, int position) {
          com.example.weatherukraine.retrofit.forecast.List lists = list.get(position);
          holder.data.setText(""+lists.getDt_txt());
          double temp_double = lists.getMain().getTemp();
          String temp_string = String.format("%.0f", temp_double);
          holder.temp.setText(temp_string+" C  ͦ");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class CityTimeInfoAdapterViewHolder extends RecyclerView.ViewHolder {
        TextView data, temp;
        public CityTimeInfoAdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            data = itemView.findViewById(R.id.dt);
            temp = itemView.findViewById(R.id.temp_list);

        }
    }
}
