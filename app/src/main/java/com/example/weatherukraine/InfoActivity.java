package com.example.weatherukraine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.weatherukraine.adapters.CityTimeInfoAdapter;
import com.example.weatherukraine.retrofit.ApiInterface;
import com.example.weatherukraine.retrofit.ApiRetrofit;
import com.example.weatherukraine.retrofit.OpenWhether;
import com.example.weatherukraine.retrofit.forecast.Example;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InfoActivity extends AppCompatActivity {
    TextView cityName, temp;
    RecyclerView recyclerView;
    ImageView imageView, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        cityName = findViewById(R.id.city_name);
        temp = findViewById(R.id.temp);
        imageView = findViewById(R.id.image_city);
        recyclerView = findViewById(R.id.recycler_time_Info);
        back = findViewById(R.id.back);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InfoActivity.this, StartActivity.class);
                startActivity(intent);
            }
        });



        Intent intent = getIntent();
        cityName.setText(intent.getStringExtra("name_city"));
        getWeather(intent.getStringExtra("name_city"));
        Other.getImageCity(this, cityName, imageView);
    }


    public void getWeather(String city) {

        ApiInterface apiInterface = ApiRetrofit.getMyRetrofit().create(ApiInterface.class);

        Call<OpenWhether> call = apiInterface.getCityWeather(city);
        Call<Example> callListForecast = apiInterface.getListForecast(city);


        call.enqueue(new Callback<OpenWhether>() {
            @Override
            public void onResponse(Call<OpenWhether> call, Response<OpenWhether> response) {
                temp.setText(response.body().getMain().getTemp() + " C  ͦ");
            }

            @Override
            public void onFailure(Call<OpenWhether> call, Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


        callListForecast.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {

                List<com.example.weatherukraine.retrofit.forecast.List> myList = new ArrayList<>();

                for(int a=1; a<response.body().getList().size(); a+=4) {
                   myList.add(response.body().getList().get(a));
                }
                CityTimeInfoAdapter cityTimeInfoAdapter = new CityTimeInfoAdapter(myList, InfoActivity.this);
                recyclerView.setAdapter(cityTimeInfoAdapter);


            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {

            }
        });

    }




}