package com.example.countries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] countriesNames = {
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

        ListView listView;
        listView = findViewById(R.id.countriesList);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(), countriesNames, countriesImages);
        listView.setAdapter(customBaseAdapter);
    }
}