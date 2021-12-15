package main;

public class VehiculeIntrouvableException extends Exception {
    public VehiculeIntrouvableException(String s) {
        super(s);
    }

    public VehiculeIntrouvableException() {
        super("Vehicule Introuvable");
    }
}
