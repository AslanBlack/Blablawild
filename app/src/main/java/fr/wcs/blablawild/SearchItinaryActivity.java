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



    public class SearchItinaryActivity extends AppCompatActivity {

        public static String ozef;
        public static String fezo;
        EditText search_destination;
        EditText search_departure;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_search_itinary);
}


            public void goToNextActivity(View view) {


                EditText search_destination = (EditText) findViewById(R.id.search_destination);
                EditText search_departure = (EditText) findViewById(R.id.search_departure);

                Context context = getApplicationContext();
                CharSequence text = getString(R.string.error );
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);

                if (search_destination.length() > 0 && search_departure.length() > 0) {

                    Intent changeActivity = new Intent(SearchItinaryActivity.this, ViewSearchItinaryResultsListActivity.class);

                    String message = search_departure.getText().toString();
                    String message2 = search_destination.getText().toString();

                    changeActivity.putExtra("osef", message );
                    changeActivity.putExtra("feso", message2 );

                    startActivity(changeActivity);
                }
                else toast.show();


            }


    }

