package fr.wcs.blablawild;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ViewSearchItinaryResultsListActivity extends AppCompatActivity {

    ListView mListViewResults;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinary_results_list);




        SearchRequestModel request = getIntent().getExtras().getParcelable("request");
        Intent changeActivity = getIntent();
        this.setTitle(request.getmDeparture() + " >> " + request.getmDestination());

        Context context = getApplicationContext();
        CharSequence text = request.getmDate();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);

        toast.show();

        mListViewResults = (ListView) findViewById(R.id.tripsList);
        //ArrayList<TripResultModel> results = new ArrayList<>();




        mDatabase = FirebaseDatabase.getInstance().getReference("Itinerary");

        TripResultAdapter mTripResultAdapter = new TripResultAdapter(mDatabase, this, R.layout.trip_item);

        mListViewResults = (ListView) findViewById(R.id.tripsList);
        mListViewResults.setAdapter(mTripResultAdapter);






    }




}
