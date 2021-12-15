package java;

import java.util.*;

public class GpsPoint {

    private double longitude;
    private double latittude;

    public GpsPoint(double lo, double la) {
        this.longitude = lo;
        this.latittude = la;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatittude() {
        return latittude;
    }

    public void setLatittude(double latittude) {
        this.latittude = latittude;
    }
}