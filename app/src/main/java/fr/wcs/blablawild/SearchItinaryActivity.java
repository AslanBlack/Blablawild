package fr.wcs.blablawild;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import android.view.View.OnClickListener;



public class SearchItinaryActivity extends AppCompatActivity {

        public static String ozef;
        public static String fezo;

        EditText search_destination;
        EditText search_departure;
        EditText search_date;
        Calendar myCalendar = Calendar.getInstance();


    private void updateLabel() {

        String myFormat = "MM/dd/yy"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);

        search_date.setText(sdf.format(myCalendar.getTime()));
    }





        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_search_itinary);
            search_date = (EditText) findViewById(R.id.search_date);


            final DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {

                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear,
                                      int dayOfMonth) {
                    // TODO Auto-generated method stub
                    myCalendar.set(Calendar.YEAR, year);
                    myCalendar.set(Calendar.MONTH, monthOfYear);
                    myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                    updateLabel();
                }

            };

            search_date.setOnClickListener(new OnClickListener() {

                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    new DatePickerDialog(SearchItinaryActivity.this, date, myCalendar
                            .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                            myCalendar.get(Calendar.DAY_OF_MONTH)).show();
                }
            });





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

