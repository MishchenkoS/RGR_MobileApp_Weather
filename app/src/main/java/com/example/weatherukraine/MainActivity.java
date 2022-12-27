package com.example.weatherukraine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    boolean start = true;
    boolean start_tho = true;
    int time = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler handler = new Handler();

       handler.post(new Runnable() {
           @Override
           public void run() {
               Log.d("Hello", "run");
               if(start){
                   start=false;
               }else if(start==false&&start_tho){
                   Intent intent = new Intent(MainActivity.this, StartActivity.class);
                   startActivity(intent);
                   MainActivity.this.finish();
                   start_tho=false;
                   time=999999;
               }
               handler.postDelayed(this,  time);
           }
       });
    }
}