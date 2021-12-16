package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
        else {
            throw new VehiculeIntrouvableException("Véhicule introuvable dans ce garage, suppression annulée");
        }
    }

    public HashMap<Vehicule, Boolean> getGarage() {
        return garage;
    }

    public ArrayList<Vehicule> getVehiculesDispo() {
        ArrayList<Vehicule> res = new ArrayList<>();
        for(Map.Entry<Vehicule, Boolean> entry : garage.entrySet()) {
            if(entry.getValue()) {
                res.add(entry.getKey());
            }
        }
        return res;
    }

    public void setVehiculeDispo(Vehicule v, boolean b) throws VehiculeIntrouvableException {
        if(this.garage.containsKey(v)) {
            this.garage.replace(v, b);
        }
        else {
            throw new VehiculeIntrouvableException("Véhicule introuvable dans ce garage");
        }
    }

    public void setGarage(HashMap<Vehicule, Boolean> garage) {
        this.garage = garage;
    }
}