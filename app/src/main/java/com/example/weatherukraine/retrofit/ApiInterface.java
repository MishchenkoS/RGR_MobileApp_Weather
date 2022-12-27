package com.example.weatherukraine.retrofit;

import com.example.weatherukraine.retrofit.forecast.Example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=92756c24107bc39dd0a7541f66ba55c5&units=metric")
    Call<OpenWhether> getCityWeather(@Query("q") String city);

    @GET("forecast?&appid=92756c24107bc39dd0a7541f66ba55c5&units=metric")
    Call<Example> getListForecast(@Query("q") String city);


}
