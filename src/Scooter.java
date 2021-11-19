import java.util.*;

pubic class Scooter extends Vehicule { //subclass Scooter

    private double zyl;
    private double scooterconso;
    private double scooterspeed;
    private double scooterco2;
    private double scooterusingprice;
    private double sp98price;

    public Scooter(String s, double p, double w, double cyl, double cons) {
        this.zyl = cyl;
        this.scooterconso = cons;
        this.scooterspeed = 30 + (this.zyl/50);
        this.scooterco2 = (this.zyl/4);
        this.sp98price = 1.65;
        this.scooterusingprice = (p/20000) + (this.scooterconso * this.sp98price);
        super(s,p,scooterspeed,scooterco2,w,scooterusingprice);

    }

    public double getScooterco2() {
        return scooterco2;
    }

    public double getScooterconso() {
        return scooterconso;
    }

    public double getScooterspeed() {
        return scooterspeed;
    }

    public double getScooterusingprice() {
        return scooterusingprice;
    }

    public double getSp98price() {
        return sp98price;
    }

    public double getZyl() {
        return zyl;
    }

    public void setZyl(double zyl) {
        this.zyl = zyl;
    }

    public void setScooterconso(double scooterconso) {
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

    public void setSp98price(double sp98price) {
        this.sp98price = sp98price;
    }
}