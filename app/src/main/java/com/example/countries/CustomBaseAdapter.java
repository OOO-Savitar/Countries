package com.example.countries;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String[] countriesList;
    int[] imagesList;
    LayoutInflater inflater;


    public CustomBaseAdapter(Context ctx, String[] countriesList, int[] imagesList) {
        this.context = ctx;
        this.countriesList = countriesList;
        this.imagesList = imagesList;
        inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return imagesList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView textView = view.findViewById(R.id.countryTextView);
        ImageView countryImage = view.findViewById(R.id.countryImageView);
        textView.setText(countriesList[i]);
        countryImage.setImageResource(imagesList[i]);
        return view;
    }
}