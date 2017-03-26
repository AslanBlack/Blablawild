package fr.wcs.blablawild;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.Query;


import java.util.ArrayList;
import java.util.List;





public class TripResultAdapter extends FirebaseListAdapter<ItineraryModel>{




    EditText editTextDate;
    EditText editTextDeparture;
    EditText editTextPrice;
    EditText editTextDestination;

    TextView tripDriverFirstName;
    TextView departureDate;
    TextView tripPrice;


    //private ArrayList<TripResultModel> trip;

    public TripResultAdapter(Query ref, Activity activity, int layout) {
        super(ref, ItineraryModel.class, layout, activity);

        this.tripDriverFirstName = tripDriverFirstName;
        this.departureDate = departureDate;
        this.tripPrice = tripPrice;



    }




    @Override
    protected void populateView(View v, ItineraryModel newTrip) {


        tripDriverFirstName = (TextView)v.findViewById(R.id.tripDriver);
        departureDate = (TextView)v.findViewById(R.id.tripDateTime);
        tripPrice = (TextView)v.findViewById(R.id.tripPrice);




        tripDriverFirstName.setText(String.valueOf(newTrip.getDriverFistname()));
        departureDate.setText(String.valueOf(newTrip.getDepartureDate()));
        tripPrice.setText(String.valueOf(newTrip.getmPrice()));

    }
}



