package main;

import org.jxmapviewer.viewer.Waypoint;

import java.util.*;

public class Course implements Comparable<Course>{

    private double weight;
    private Salaree salaree;
    private Vehicule vehicule;
    private double chargeutile;
    private ArrayList<GpsPoint> trajet;
    private int tempsParcours;
    private int nbiterations = 0;

    public Course(double w, Salaree salaree, Vehicule vehicule) throws CourseImpossibleException  {
        this.salaree = salaree;
        this.vehicule = vehicule;

        this.weight = w;
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
        else if (getDistanceKm() / getSpeed() * 60 > 60) {
            throw new CourseImpossibleException("Course impossible: temps de parcours supérieur à 1h (60 minutes)");
        }
    }

    public void setTrajet(ArrayList<Waypoint> points ){
        for (Waypoint wp : points) {
            trajet.add(new GpsPoint(wp.getPosition().getLatitude(), wp.getPosition().getLongitude()));
        }
//        if(!points.isEmpty()) {
//            trajet.add(new GpsPoint(47.23813941987686, -1.5541809153407529));
//        }
    }

    public double getSpeed() {
        if(salaree.isCyclist()) {
            return salaree.getcyclistspeed();
        }
        else {
            return vehicule.getSpeed();
        }
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public Salaree getSalaree() {
        return salaree;
    }

    public void setSalaree(Salaree salaree) {
        this.salaree = salaree;
    }

    public int getNbiterations() {
        return nbiterations;
    }

    public void addIteration() {
        this.nbiterations++;
    }

    public double getCo2Emis() {
        return this.getVehicule().getCo2() * getDistanceKm()*2;
    }

    public double getCo2EmisSimulation() {
        return this.getVehicule().getCo2() * 3 *2;
    }

    public double getPrix() {
        System.out.println(salaree.getSalaire());
        System.out.println(vehicule.getPrice());
        return (salaree.getSalaire() + (vehicule.getUsingPrice() * getDistanceKm())) * 2;
    }

    public double getPrixSimulation() {
        return salaree.getSalaire() + (vehicule.getUsingPrice()*3)*2;
    }

    public double getDistanceKm() {
        GpsPoint g1 = trajet.get(0);
        GpsPoint g2 = trajet.get(trajet.size()-1);
//        System.out.println("Vitesse: "+this.vehicule.getCo2() * calculateDistance(g1.getLatittude(), g1.getLongitude(), g2.getLatittude(), g2.getLongitude()));
        return calculateDistance(g1.getLatittude(), g1.getLongitude(), g2.getLatittude(), g2.getLongitude());
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

    private int getProgress() {
        double tempsRestant = getDistanceKm() / getSpeed() * 60;
        double distanceRestante = getDistanceKm();
        distanceRestante -= getSpeed() * getNbiterations()/60;
        tempsRestant -= distanceRestante / getSpeed() * 60;
        return (int) (100- (distanceRestante/getDistanceKm() * 100));
    }

    public boolean estFinie() {
        if(getNbiterations()==0) {
            return false;
        }
        else if(getNbiterations() >0 && getProgress() >=100) {
            return true;
        }
        return false;
    }

    public int compareTo(Course c){
        if (((this.getCo2EmisSimulation() > c.getCo2EmisSimulation()) && (this.getPrixSimulation() > c.getPrixSimulation())) ||
                ((this.getCo2EmisSimulation() > c.getCo2EmisSimulation()) && (this.getPrixSimulation() == c.getPrixSimulation())) ||
                ((this.getCo2EmisSimulation() == c.getCo2EmisSimulation()) && (this.getPrixSimulation() > c.getPrixSimulation()))) {
            return -1;
        }
        if ((this.getCo2EmisSimulation() == c.getCo2EmisSimulation()) && (this.getPrixSimulation()) == c.getPrixSimulation()) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Employé: "+this.getSalaree().getName()+" | Véhicule: "+this.getVehicule().getName()+" | CO2 émis: "+getCo2EmisSimulation()+" | Prix: "+getPrixSimulation()+"\n";
    }
}