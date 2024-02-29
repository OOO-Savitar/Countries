package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] countries = {
            "Indiana", "China", "Australia", "Portugal", "USA", "New Zealand",
            "Canada", "Brazil", "Japan", "Germany", "United Kingdom", "France",
            "Italy", "Russia", "South Korea", "Spain", "Mexico", "Indonesia",
            "Netherlands", "Switzerland", "Saudi Arabia", "Sweden", "Turkey",
            "Poland", "Norway", "Belgium", "Argentina", "Austria", "Thailand",
            "Iran", "Ukraine", "Denmark", "South Africa", "Egypt", "Finland",
            "Greece", "Czech Republic", "Israel", "Ireland", "Singapore",
            "Malaysia", "Philippines", "Vietnam", "Hungary", "Romania",
            "New Zealand", "Australia", "China", "India"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView countriesList = findViewById(R.id.countriesList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        countriesList.setAdapter(adapter);
    }
}