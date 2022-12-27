package com.example.weatherukraine;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.content.res.AppCompatResources;

public class Other {
    public static void getImageCity(Context context, TextView cityName, ImageView imageView ) {
        if(cityName.getText().toString().equals("Вінниця")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_vinitca));
        }else if(cityName.getText().toString().equals("Луцьк")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_lutck));
        }else if(cityName.getText().toString().equals("Дніпро")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_dnipro));
        }else if(cityName.getText().toString().equals("Донецьк")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_doneck));
        }else if(cityName.getText().toString().equals("Житомир")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_jitomir));
        }else if(cityName.getText().toString().equals("Ужгород")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_ushorod));
        }else if(cityName.getText().toString().equals("Запоріжжя")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_zp));
        }else if(cityName.getText().toString().equals("Івано-Франківськ")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_ivano_frankivsk));
        }else if(cityName.getText().toString().equals("Київ")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_kiev));
        }else if(cityName.getText().toString().equals("Луганськ")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_lugansk));
        }else if(cityName.getText().toString().equals("Львів")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_lviv));
        }else if(cityName.getText().toString().equals("Одеса")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_odessa));
        }else if(cityName.getText().toString().equals("Полтава")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_poltava));
        }else if(cityName.getText().toString().equals("Рівне")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_rivne));
        }else if(cityName.getText().toString().equals("Суми")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_sumi));
        }else if(cityName.getText().toString().equals("Тернопіль")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_ternopil));
        }else if(cityName.getText().toString().equals("Харків")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_harkiv));
        }else if(cityName.getText().toString().equals("Херсон")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_herson));
        }else if(cityName.getText().toString().equals("Хмельницький")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_hmelnickiy));
        }else if(cityName.getText().toString().equals("Черкаси")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_cherksi));
        }else if(cityName.getText().toString().equals("Чернігів")) {
            imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.big_chernigiv));
        }

    }
}
