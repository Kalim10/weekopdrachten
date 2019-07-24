package nl.Weekopdrachten.kermis;

public class SpookHuis extends Attractie {

    public SpookHuis() {
        name = "SPOOKHUIS(7)";
        prijs = 225;
        aantalKaartjes = 0;
    }

    public void draaien() {
        omzet += prijs;
        aantalKaartjes++;
        System.out.println("U zit nu in het spookhuis BOEEHOEEHOEEEE!! dit kostte :"+prijs);
        System.out.println("aantal kaartjes spookhuis verkocht: "+aantalKaartjes);
    }

}
