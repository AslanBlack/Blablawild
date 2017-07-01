package fr.wcs.blablawild;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by apprenti on 13/03/17.
 */

public class ItineraryModel {



    private String mDriverLastName;
    private String mDriverFirstname;
    private String mDepartureDate;
    private int mPrice;
    private String mDeparture;
    private String mDestination;
    private String mUserId;
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private FirebaseUser user;
    FirebaseDatabase database = FirebaseDatabase.getInstance();


    // GETTERS & SETTERS



    public String getDriverLastName() {
        return mDriverLastName;
    }

    public String getDriverFistname() {
        return mDriverFirstname;
    }

    public String getDepartureDate() {
        return mDepartureDate;
    }

    public int getmPrice() {
        return mPrice;
    }

    public String getDeparture() {
        return mDeparture;
    }

    public String getDestination() {
        return mDestination;
    }

    public String getmUserId(){return mUserId;}



    public void setDriverLastName(String mDriverLastName) {
        this.mDriverLastName = mDriverLastName;
    }

    public void setDriverFistname(String mDriverFistname) {
        this.mDriverFirstname = mDriverFistname;
    }

    public void setDepartureDate(String mDepartureDate) {
        this.mDepartureDate = mDepartureDate;
    }

    public void setPrice(int mPrice) {
        this.mPrice = mPrice;
    }

    public void setUserId(String mUserId){ this.mUserId = mUserId; }

    public void setDeparture(String mDeparture) {
        this.mDeparture = mDeparture;
    }

    public void setDestination(String mDestination) {
        this.mDestination = mDestination;
    }

    //Constructors



    public ItineraryModel(String driverLastName, String driverFirstName, String departureDate, int price, String departure, String destination, String userId ){


             mDriverLastName = driverLastName;
             mDriverFirstname = driverFirstName;
             mDepartureDate = departureDate;
             mPrice = price;
             mDeparture = departure;
             mDestination = destination;
             mUserId = userId;
    }


    private ItineraryModel() {
    }









}






