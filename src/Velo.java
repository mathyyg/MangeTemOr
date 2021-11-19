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







}