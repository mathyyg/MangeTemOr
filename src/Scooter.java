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







}