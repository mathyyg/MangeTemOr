package main;

public class Salaree {

    private String name;
    private double weight;
    private double salaire;
    private double utilityweight;
    private boolean isCyclist;
    private TypeOfCyclist cylcistType; //Expert, Average, Firsttime
    private double cyclistspeed;

    public Salaree (String s, double w, double sal, boolean c, TypeOfCyclist typeOfCyclist) throws Exception {
        this.name = s;
        this.weight = w;
        this.salaire = sal;
        this.isCyclist = c;
        this.utilityweight = weight/8;
        if (this.isCyclist) {
            this.cylcistType = WhichTypeOfCyclist(typeOfCyclist);
        }
    }

    public TypeOfCyclist WhichTypeOfCyclist(TypeOfCyclist typeOfCyclist) throws Exception{
        TypeOfCyclist typeC = TypeOfCyclist.AVERAGE;
        if (typeOfCyclist == TypeOfCyclist.EXPERT) {
            typeC = TypeOfCyclist.EXPERT;
            this.cyclistspeed = 20;
        }
        else if (typeOfCyclist == TypeOfCyclist.AVERAGE) {
            typeC = TypeOfCyclist.AVERAGE;
            this.cyclistspeed = 15;
        }
        else if (typeOfCyclist == TypeOfCyclist.FIRSTTIME) {
            typeC = TypeOfCyclist.FIRSTTIME;
            this.cyclistspeed = 10;
        }
        else {
            throw new Exception("Bon à un moment faut pas faire exprès non plus");
        }
        return typeC;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getUtilityweight() {
        return utilityweight;
    }

    public void setUtilityweight(double utilityweight) {
        this.utilityweight = utilityweight;
    }

    public boolean isCyclist() {
        return isCyclist;
    }

    public void setCyclist(boolean cyclist) {
        isCyclist = cyclist;
    }

    public TypeOfCyclist getCylcistType() {
        return cylcistType;
    }

    public void setCylcistType(TypeOfCyclist cylcistType) {
        this.cylcistType = cylcistType;
    }

    public double getcyclistspeed() {
        return cyclistspeed;
    }

    public void setcyclistspeed(double cyclistspeed) {
        this.cyclistspeed = cyclistspeed;
    }
}