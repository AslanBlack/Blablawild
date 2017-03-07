package fr.wcs.blablawild;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ViewSearchItinaryResultsListActivity extends AppCompatActivity {

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







    }




}
