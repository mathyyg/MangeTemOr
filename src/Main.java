import main.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Entreprise entreprise = new Entreprise();
        Salaree s1 = new Salaree("Jade",55,7.1,true, TypeOfCyclist.FIRSTTIME);
        Salaree s2 = new Salaree("Alfred", 80, 7.2,false, TypeOfCyclist.FIRSTTIME); //à chnager pour non cycliste
        Salaree s3 = new Salaree("Anna",67,7.4,true,TypeOfCyclist.EXPERT);
        Salaree s4 = new Salaree("Tiago",62,7.2,false, TypeOfCyclist.FIRSTTIME); //a changer pour non cycliste
        Salaree s5 = new Salaree("Blaise",74,7.25,true,TypeOfCyclist.AVERAGE);
        entreprise.addSalaree(s1);
        entreprise.addSalaree(s2);
        entreprise.addSalaree(s3);
        entreprise.addSalaree(s4);
        entreprise.addSalaree(s5);

        Vehicule v1 = new Velo("Cylcou",450,15);
        Vehicule v2 = new Velo("Vavite",500,15);
        entreprise.addGa(v1);
        entreprise.addGa(v2);

        Vehicule sc1 = new Scooter("YAMAMA",3500,50,300,7.5);
        Vehicule sc2 = new Scooter("Vespo",2500,30,125,5.5);
        Vehicule sc3 = new Scooter("Piagigi",2000,35,150,6);
        entreprise.addGa(sc1);
        entreprise.addGa(sc2);
        entreprise.addGa(sc3);

        LancementFrame lancementFrame = new LancementFrame(entreprise);
        lancementFrame.setVisible(true);

    }
}
