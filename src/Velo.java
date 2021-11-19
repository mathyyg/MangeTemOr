import java.util.*;

pubic class Velo extends Vehicule { //subclass Velo

    private double avgspeed;
    private double veloco2;
    private double veloweight;
    private double velousingPrice;

    public Velo(String s, double p, double sp, double up) {
        this.veloco2 = 0;
        this.veloweight = 0;
        this.velousingPrice = p/30000;
        super(s,p,sp,veloco2,veloweight,velousingPrice); // revoir pour la speed car dépend du cycliste

    }

    public double getAvgspeed() {
        return avgspeed;
    }

    public void setAvgspeed(double avgspeed) {
        this.avgspeed = avgspeed;
    }

    public double getVeloco2() {
        return veloco2;
    }

    public void setVeloco2(double veloco2) {
        this.veloco2 = veloco2;
    }

    public double getVeloweight() {
        return veloweight;
    }

    public void setVeloweight(double veloweight) {
        this.veloweight = veloweight;
    }

    public double getVelousingPrice() {
        return velousingPrice;
    }

    public void setVelousingPrice(double velousingPrice) {
        this.velousingPrice = velousingPrice;
    }
}