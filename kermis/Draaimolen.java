package nl.Weekopdrachten.kermis;

public class Draaimolen extends Attractie {

    public Draaimolen() {
        name = "DRAAIMOLEN(2)";
        prijs = 300;
        aantalKaartjes = 0;
    }


    public void draaien() {
        omzet += prijs;
        aantalKaartjes++;
        System.out.println("U zit nu in de draaimolen Lekker Draaien! :) " + prijs);
        System.out.println("draaimolenkaartjes verkocht:" + aantalKaartjes);


    }

}
