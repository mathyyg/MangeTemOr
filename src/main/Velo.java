package main;

public class Velo extends Vehicule { //subclass java.Velo

    private double avgspeed;
    private double veloco2;
    private double veloweight;
    private double velousingPrice;

    public Velo(String s, double p, double sp, double up) {
        super(s,p,sp,0,0,p/3000); // revoir pour la speed car dépend du cycliste
        this.veloco2 = 0;
        this.veloweight = 0;
        this.velousingPrice = p/30000;


    }

    public double getAvgspeed() {
        return avgspeed;
    }

    public void setAvgspeed(double avgspeed) {
        this.avgspeed = avgspeed;
    }

    public double getVelousingPrice() {
        return velousingPrice;
    }

    public void setVelousingPrice(double velousingPrice) {
        this.velousingPrice = velousingPrice;
    }
}