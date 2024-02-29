package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String[] countriesNames = {
            "Indiana", "China", "Australia", "Portugal", "USA", "New Zealand",
            "Canada", "Brazil", "Japan", "Germany", "United Kingdom", "France",
            "Italy", "Russia", "South Korea", "Spain", "Mexico", "Indonesia",
            "Netherlands", "Switzerland", "Saudi Arabia", "Sweden", "Turkey"
    };

    int[] countriesImages = {
            R.drawable.india, R.drawable.china, R.drawable.australia,
            R.drawable.portugal, R.drawable.united_states, R.drawable.new_zealand,
            R.drawable.canada, R.drawable.brazil, R.drawable.japan, R.drawable.germany,
            R.drawable.united_kingdom, R.drawable.france, R.drawable.italy, R.drawable.russia,
            R.drawable.south_korea, R.drawable.spain, R.drawable.mexico, R.drawable.indonesia,
            R.drawable.netherlands, R.drawable.switzerland, R.drawable.saudi_arabia,
            R.drawable.sweden, R.drawable.turkey
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Country> countryList = new ArrayList<>();
        ListView listView = findViewById(R.id.countriesList);

        for (int i = 0; i < countriesNames.length; i++) {
            countryList.add(new Country(countriesNames[i], countriesImages[i]));
        }

        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), countryList);
        listView.setAdapter(customBaseAdapter);
    }
}