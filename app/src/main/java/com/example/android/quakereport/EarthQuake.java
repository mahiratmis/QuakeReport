package com.example.android.quakereport;

/**
 * Created by mahir on 19.07.2017.
 */

public class EarthQuake {
    String mMagnitude;
    String mLocation;
    String mDate;

    public EarthQuake(String Magnitude, String Location, String Date) {
        this.mMagnitude = Magnitude;
        this.mLocation = Location;
        this.mDate = Date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}
