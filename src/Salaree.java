import java.util.Scanner;

public class Salaree {

    private String name;
    private double weight;
    private double salaire;
    private double utilityweight;
    private boolean isCyclist;
    private String cylcistType; //Expert, Average, Firsttime
    private double cyclistspeed;

    public Salaree (String s, double w, double sal, boolean c) throws Exception {
        this.name = s;
        this.weight = w;
        this.salaire = sal;
        this.isCyclist = c;
        this.utilityweight = weight/8;
        if (this.isCyclist) {
            this.cylcistType = WhichTypeOfCyclist();
        }
    }

    public String WhichTypeOfCyclist() throws Exception{
        Scanner entree = new Scanner(System.in);
        System.out.println("Veuillez saisir le type de cycliste (1 => Expert, 2 => Average, 3 => Firsttime \n");
        int res = entree.nextInt();
        String typeC = "Average";
        if (res == 1) {
            typeC = "Expert";
            this.cyclistspeed = 20;
        }
        else if (res == 2) {
            typeC = "Average";
            this.cyclistspeed = 15;
        }
        else   if (res == 3) {
            typeC = "Firsttime";
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

    public String getCylcistType() {
        return cylcistType;
    }

    public void setCylcistType(String cylcistType) {
        this.cylcistType = cylcistType;
    }

    public double getcyclistspeed() {
        return cyclistspeed;
    }

    public void setcyclistspeed(double cyclistspeed) {
        this.cyclistspeed = cyclistspeed;
    }
}