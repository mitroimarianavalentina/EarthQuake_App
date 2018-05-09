package com.example.android.quakereport;

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
    private long mMilliseconds;
    private String mUrl;

    public Earthquake(Double mMagnitude, String mLocation, long mMilliseconds, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mMilliseconds = mMilliseconds;
        this.mUrl = mUrl;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmMilliseconds() {return mMilliseconds;}

    public String getmUrl() {
        return mUrl;
    }
}
