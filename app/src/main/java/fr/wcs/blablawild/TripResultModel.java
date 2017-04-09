package fr.wcs.blablawild;

import java.util.Date;

/**
 * Created by apprenti on 07/03/17.
 */

public class TripResultModel {

    private Date mTripDateTime;
    private String mDriverName;
    private int mTripPrice;

    public Date getmTripDateTime() {
        return mTripDateTime;
    }

    public String getmDriverName() {
        return mDriverName;
    }

    public int getmTripPrice() {
        return mTripPrice;
    }

    public void setmTripDateTime(Date mTripDateTime) {
        this.mTripDateTime = mTripDateTime;
    }

    public void setmDriverName(String mDriverName) {
        this.mDriverName = mDriverName;
    }

    public void setmTripPrice(int mTripPrice) {
        this.mTripPrice = mTripPrice;
    }

    public TripResultModel( String driverName, Date tripDateTime, int tripPrice){

        this.mTripDateTime = tripDateTime;
        this.mDriverName = driverName;
        this.mTripPrice = tripPrice;
    }
}
