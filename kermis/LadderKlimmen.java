package nl.Weekopdrachten.kermis;

public class LadderKlimmen extends Attractie implements GokAttractie {

    public LadderKlimmen() {
        name = "LADDERKLIMMEN(4)";
        prijs = 500;
        aantalKaartjes = 0;
    }

    @Override
    public int kSBelasting() {
        omzet = (omzet/100)*70;
        return omzet;
    }

    public void draaien() {
        omzet += prijs;
        aantalKaartjes++;
        System.out.println("U zit nu in de klimladders pas op dat je er niet uit valt! dit kostte "+prijs);
        System.out.println("aantal kaartjes ladderklimmen verkocht: "+ aantalKaartjes);


    }

}
