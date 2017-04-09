package fr.wcs.blablawild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static fr.wcs.blablawild.R.id.button;
import static fr.wcs.blablawild.R.id.price;


public class SubmitItineraryActivity extends AppCompatActivity {

    public Button buttonCreate;
    public EditText editTextDeparture;
    public EditText editTextDestination;
    public EditText editTextDate;
    public EditText editTextPrice;



   FirebaseDatabase database = FirebaseDatabase.getInstance();
   DatabaseReference ref = database.getReference("itinerary");



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_itinerary);

        buttonCreate = (Button) findViewById(R.id.create);
        editTextDate = (EditText) findViewById(R.id.date);
        editTextDeparture = (EditText) findViewById(R.id.departure);
        editTextPrice = (EditText) findViewById(R.id.price);
        editTextDestination = (EditText) findViewById(R.id.destination);

        buttonCreate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v){

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Itinerary");




                String departureDate = editTextDate.getText().toString();
                int price = Integer.parseInt(editTextPrice.getText().toString());
                String driverFirstName = "Paul";
                String driverLastName = "Scholes";
                String departure = editTextDeparture.getText().toString().trim();
                String destination = editTextDestination.getText().toString().trim();


                ItineraryModel itinerary = new ItineraryModel(driverFirstName, driverLastName, departureDate, price, departure, destination  );

                itinerary.setDepartureDate(departureDate);
                itinerary.setPrice(price);
                itinerary.setDriverFistname(driverFirstName);
                itinerary.setDriverLastName(driverLastName);

                myRef.push().setValue(itinerary);



            }



        });



    }














    }
