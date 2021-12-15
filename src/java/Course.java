package java;

import java.util.*;

public class Course{

    private double weight;
    private Salaree salaree;
    private Vehicule vehicule;
    private double chargeutile;
    private ArrayList<GpsPoint> trajet;
    private int tempsParcours;

    public Course(double w, Salaree salaree, Vehicule vehicule, int tempsParcours) throws CourseImpossibleException  {
        this.salaree = salaree;
        this.vehicule = vehicule;
        this.weight = w;
        this.tempsParcours = tempsParcours;
        this.trajet = new ArrayList<>();
        trajet.add(new GpsPoint(47.23813941987686, -1.5541809153407529));
        this.chargeutile = maxChargeUtile();
        isCoursePossible();
    }

    public double maxChargeUtile() {
        if(salaree.getUtilityweight() > vehicule.getWeight()) {
            return salaree.getUtilityweight();
        }
        return vehicule.getWeight();
    }

    public void isCoursePossible() throws CourseImpossibleException {
        if(this.chargeutile < this.weight) {
            throw new CourseImpossibleException("java.Course impossible: charge utilise supérieure au poids");
        }
    }

    public double getCo2Emis() {
        return getDistanceKm()*2;
    }

    public double getPrix() {
        return salaree.getSalaire() + (vehicule.getPrice() * getDistanceKm()) * 2;
    }

    public double getDistanceKm() {
        GpsPoint g1 = trajet.get(0);
        GpsPoint g2 = trajet.get(trajet.size()-1);
        return this.vehicule.getCo2() * calculateDistance(g1.getLatittude(), g1.getLongitude(), g2.getLatittude(), g2.getLongitude());
    }

    // fonction calcul distance GPS
    public final static double AVERAGE_RADIUS_OF_EARTH = 6371;
    public int calculateDistance(double userLat, double userLng, double venueLat, double venueLng) {

        double latDistance = Math.toRadians(userLat - venueLat);
        double lngDistance = Math.toRadians(userLng - venueLng);

        double a = (Math.sin(latDistance / 2) * Math.sin(latDistance / 2)) +
                (Math.cos(Math.toRadians(userLat))) *
                        (Math.cos(Math.toRadians(venueLat))) *
                        (Math.sin(lngDistance / 2)) *
                        (Math.sin(lngDistance / 2));

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return (int) (Math.round(AVERAGE_RADIUS_OF_EARTH * c));

    }
}