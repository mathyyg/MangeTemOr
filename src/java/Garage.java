package java;

import java.util.HashMap;

public class Garage {

    private HashMap<Vehicule, Boolean> garage;

    public Garage() {
        this.garage = new HashMap<>();
    }

    public void addVehicule(Vehicule v) {
        this.garage.put(v, true);
    }

    public void removeVehicule(Vehicule v) {
        garage.remove(v);
    }




}