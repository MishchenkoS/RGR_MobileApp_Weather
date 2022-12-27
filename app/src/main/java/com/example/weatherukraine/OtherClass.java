package com.example.weatherukraine;

import java.util.ArrayList;
import java.util.List;

public class OtherClass {

    public static List<City> cityList() {
        List<City> list = new ArrayList<>();
        list.add(new City(R.drawable.vinica, "Вінниця"));
        list.add(new City(R.drawable.luck, "Луцьк"));
        list.add(new City(R.drawable.dnipro, "Дніпро"));
        list.add(new City(R.drawable.doneck, "Донецьк"));
        list.add(new City(R.drawable.zhytomir, "Житомир"));
        list.add(new City(R.drawable.uzshorod, "Ужгород"));
        list.add(new City(R.drawable.zaporisha, "Запоріжжя"));
        list.add(new City(R.drawable.ivano_frankivsk, "Івано-Франківськ"));
        list.add(new City(R.drawable.kiev, "Київ"));
        list.add(new City(R.drawable.lugansk, "Луганськ"));
        list.add(new City(R.drawable.lviv, "Львів"));
        list.add(new City(R.drawable.odessa, "Одеса"));
        list.add(new City(R.drawable.poltava, "Полтава"));
        list.add(new City(R.drawable.rivne, "Рівне"));
        list.add(new City(R.drawable.sumi, "Суми"));
        list.add(new City(R.drawable.ternipil, "Тернопіль"));
        list.add(new City(R.drawable.harkiv, "Харків"));
        list.add(new City(R.drawable.herson, "Херсон"));
        list.add(new City(R.drawable.hmelnicki, "Хмельницький"));
        list.add(new City(R.drawable.cherkasi, "Черкаси"));
        list.add(new City(R.drawable.chernigiv, "Чернігів"));
        return list;
    }
}
