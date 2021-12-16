package main;

import java.util.*;

public class Entreprise {

    private ArrayList<Salaree> employe;
    private Garage ga;
    private GpsPoint localisationEntrepot;

    public Entreprise() {
        this.employe = new ArrayList<Salaree>();
        this.ga = new Garage();
        this.localisationEntrepot = new GpsPoint(15.0 , 10.0);
    }

    public void addSalaree(Salaree s) {
        this.employe.add(s);
    }

    public void addGa(Vehicule v){
        this.ga.addVehicule(v);
    }


    public ArrayList<Salaree> getEmploye() {
        return employe;
    }

    public void setVehiculeDispo(Vehicule v, boolean b) throws VehiculeIntrouvableException {
        this.ga.setVehiculeDispo(v, b);
    }

    public void setEmploye(ArrayList<Salaree> employe) {
        this.employe = employe;
    }

    public Garage getGa() {
        return ga;
    }

    public void setGa(Garage ga) {
        this.ga = ga;
    }

    public GpsPoint getLocalisationEntrepot() {
        return localisationEntrepot;
    }

    public void setLocalisationEntrepot(GpsPoint localisationEntrepot) {
        this.localisationEntrepot = localisationEntrepot;
    }
}