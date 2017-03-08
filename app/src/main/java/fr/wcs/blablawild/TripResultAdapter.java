package fr.wcs.blablawild;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by apprenti on 07/03/17.
 */

public class TripResultAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<TripResultModel> trip;

    public TripResultAdapter(Context context, ArrayList<TripResultModel> trip) {
        this.context = context;
        this.trip = trip;
    }

    @Override
    public int getCount() {
        return trip.size();
    }



    @Override
    public Object getItem(int position) {
        return trip.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).
                    inflate(R.layout.trip_item, parent, false);
        }

        TripResultModel currentTrip = (TripResultModel) getItem(position);


        TextView tripDateTime = (TextView)
                convertView.findViewById(R.id.tripDateTime);
        TextView tripDriver = (TextView)
                convertView.findViewById(R.id.tripDriver);
        TextView tripPrice = (TextView)
                convertView.findViewById(R.id.tripPrice);


        tripDateTime.setText(currentTrip.getmTripDateTime().toString());
        tripDriver.setText(currentTrip.getmDriverName());

        tripPrice.setText(currentTrip.getmTripPrice()+"");

        return convertView;
    }



}
