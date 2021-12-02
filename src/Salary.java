import java.util.Scanner;

public class Salary {

    private String name;
    private double weight;
    private double salaire;
    private double utilityweight;
    private boolean isCyclist;
    private String cylcistType; //Expert, Average, Firsttime
    private double cylistspeed;

    public Salary (String s, double w, double sal, boolean c) {
        this.name = s;
        this.weight = w;
        this.salaire = sal;
        this.isCyclist = c;
        this.utilityweight = weight/8;
        if this.isCyclist {
            this.cylcistType = WhichTypeOfCyclist();
        }
    }

    public void WhichTypeOfCyclist() throws Exception{
        Scanner entree = new Scanner(System.in);
        System.out.println("Veuillez saisir le type de cycliste (1 => Expert, 2 => Average, 3 => Firsttime \n");
        int res = entree.nextInt();
        if (res == 1) {
            this.cylcistType = "Expert";
            this.cylistspeed = 20;
        }
        else if (res == 2) {
            this.cylcistType = "Average";
            this.cylistspeed = 15;
        }
        else   if (res == 3) {
            this.cylcistType = "Firsttime";
            this.cylistspeed = 10;
        }
        else {
            throw new Exception("Bon à un moment faut pas faire exprès non plus");
        }
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

    public double getCylistspeed() {
        return cylistspeed;
    }

    public void setCylistspeed(double cylistspeed) {
        this.cylistspeed = cylistspeed;
    }
}