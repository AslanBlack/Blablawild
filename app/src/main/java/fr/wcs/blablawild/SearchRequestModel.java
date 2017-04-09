package fr.wcs.blablawild;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.EditText;

import java.util.Date;

import static fr.wcs.blablawild.R.id.search_departure;


public class SearchRequestModel  implements Parcelable {


    private String mDeparture;
    private String mDestination;
    private String mDate;



    public SearchRequestModel(String departure, String destination, String date){
        mDeparture = departure;
        mDestination = destination;
        mDate = date;

    }

    protected SearchRequestModel(Parcel in) {
        mDeparture = in.readString();
        mDestination = in.readString();
        mDate = in.readString();
    }

    public static final Creator<SearchRequestModel> CREATOR = new Creator<SearchRequestModel>() {
        @Override
        public SearchRequestModel createFromParcel(Parcel in) {
            return new SearchRequestModel(in);
        }

        @Override
        public SearchRequestModel[] newArray(int size) {
            return new SearchRequestModel[size];
        }
    };

    private SearchRequestModel() {


    }


    public String getmDeparture() {
        return this.mDeparture;
    }

    public String getmDestination() { return this.mDestination;}


    public String getmDate() {
        return this.mDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mDeparture);
        dest.writeString(mDestination);
        dest.writeString(mDate);

    }
}
