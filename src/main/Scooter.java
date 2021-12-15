package main;

public class Scooter extends Vehicule { //subclass java.Scooter


    private double scooterconso;
    private double scooterspeed;
    private double scooterco2;
    private double scooterusingprice;
    private double zyl;

    public Scooter(String s, double p, double w, double cyl, double cons) {
        super(s,p,0,0,w,0);
        this.zyl = cyl;
        this.scooterconso = cons;
        this.scooterspeed = 30 + (cyl/50);
        this.scooterco2 = (cyl/4);
        this.scooterusingprice = (p/20000) + (this.scooterconso * Vehicule.getSp98price())/100;
    }

    public double getScooterco2() {
        return scooterco2;
    }

    public double getConso() {
        return scooterconso;
    }

    public double getScooterspeed() {
        return scooterspeed;
    }

    public double getScooterusingprice() {
        return scooterusingprice;
    }

    public static double getSp98price() {
        return sp98price;
    }

    public double getZylindre() {
        return zyl;
    }

    public void setConso(double scooterconso) {
        this.scooterconso = scooterconso;
    }

    public void setScooterspeed(double scooterspeed) {
        this.scooterspeed = scooterspeed;
    }

    public void setScooterco2(double scooterco2) {
        this.scooterco2 = scooterco2;
    }

    public void setScooterusingprice(double scooterusingprice) {
        this.scooterusingprice = scooterusingprice;
    }

    public static void setSp98price(double sp98price) {
        sp98price = sp98price;
    }
}