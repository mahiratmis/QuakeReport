package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mahir on 19.07.2017.
 */

public class EartQuakeAdapter extends ArrayAdapter<EarthQuake> {

    public EartQuakeAdapter( Context context, List<EarthQuake> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View listItemView = convertView;
        //if there is an existing listItemview use it otherwise inflate new list item layout
        if(listItemView ==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item,parent,false);
        }

        EarthQuake earthQuake = getItem(position);
        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(earthQuake.getMagnitude());
        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(earthQuake.getLocation());
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(earthQuake.getDate());

        return listItemView;
    }
}
