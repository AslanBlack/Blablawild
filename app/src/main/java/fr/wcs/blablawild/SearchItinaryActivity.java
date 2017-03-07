package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import java.util.Date;


public class SearchItinaryActivity extends AppCompatActivity {

        public static String ozef;
        public static String fezo;
        public EditText search_destination;
        public EditText search_departure;
        public EditText search_date;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_search_itinary);
}


            public void goToNextActivity(View view) {


                EditText search_destination = (EditText) findViewById(R.id.search_destination);
                EditText search_departure = (EditText) findViewById(R.id.search_departure);
                EditText search_date = (EditText) findViewById(R.id.search_date);
                String mDeparture = search_departure.getText().toString();
                String mDestination = search_destination.getText().toString();
                String mDate = search_date.getText().toString();

                Context context = getApplicationContext();
                CharSequence text = getString(R.string.error );
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);

                if (search_destination.length() > 0 && search_departure.length() > 0 && search_date.length() > 0) {

                    SearchRequestModel request = new SearchRequestModel( mDeparture, mDestination, mDate);
                    Intent changeActivity = new Intent(SearchItinaryActivity.this, ViewSearchItinaryResultsListActivity.class);


                    changeActivity.putExtra("request", request);


                    startActivity(changeActivity);
                }
                else toast.show();


            }


    }

