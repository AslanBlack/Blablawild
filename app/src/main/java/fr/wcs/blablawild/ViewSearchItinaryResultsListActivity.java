package fr.wcs.blablawild;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ViewSearchItinaryResultsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ListView mListViewResults;
        TripResultAdapter mResultsAdapter;


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
        ArrayList<TripResultModel> results = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy-hh:mm");

        try {
            results.add(new TripResultModel("Bruce", sdf.parse("21/02/2017-15:30"), 15));
            results.add(new TripResultModel("Clark", sdf.parse("21/02/2017-16:00"), 20));
            results.add(new TripResultModel("Bary", sdf.parse("21/02/2017-16:30"), 16));
            results.add(new TripResultModel("Lex", sdf.parse("21/02/2017-17:00"), 40));
            results.add(new TripResultModel("Paul", sdf.parse("21/02/2017-17:00"), 40));
            results.add(new TripResultModel("Lex", sdf.parse("21/02/2017-17:00"), 40));
            results.add(new TripResultModel("Lex", sdf.parse("21/02/2017-17:00"), 40));
        } catch (ParseException e) {
        }
        mResultsAdapter = new TripResultAdapter(this, results);

        mListViewResults.setAdapter(mResultsAdapter);







    }




}
