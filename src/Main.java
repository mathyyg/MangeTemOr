import main.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Entreprise entreprise = new Entreprise();
        Salaree salaree = new Salaree("La Voisine",55,0,false, TypeOfCyclist.AVERAGE);
        entreprise.addSalaree(salaree);
        Vehicule velo = new Velo("Gitane",500,15);
        entreprise.addGa(velo);
        Vehicule scooter = new Scooter("YAMAMA",500,150,125,8);
        entreprise.addGa(scooter);
        LancementFrame lancementFrame = new LancementFrame(entreprise);
        lancementFrame.setVisible(true);

    }
}
