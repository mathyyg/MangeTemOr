package main;

import java.util.HashMap;

public class Garage {

    private HashMap<Vehicule, Boolean> garage;

    public Garage() {
        this.garage = new HashMap<>();
    }

    public void addVehicule(Vehicule v) {
        this.garage.put(v, true);
    }

    public void removeVehicule(Vehicule v) throws VehiculeIntrouvableException  {
        if(this.garage.containsKey(v)) {
            this.garage.remove(v);
        }
        throw new VehiculeIntrouvableException("Véhicule introuvable dans ce garage, suppresion annule");
    }

    public HashMap<Vehicule, Boolean> getGarage() {
        return garage;
    }



    public void setGarage(HashMap<Vehicule, Boolean> garage) {
        this.garage = garage;
    }
}