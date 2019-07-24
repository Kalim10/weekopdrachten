package nl.Weekopdrachten.kermis;

public class Spin extends Attractie implements RisicoRijk {
    public Spin() {
        name = "SPIN(6)";
        prijs = 225;
        aantalKaartjes = 0;
    }

    public void draaien() {
        omzet += prijs;
        aantalKaartjes++;
        System.out.println("U zit nu in de spin alias turbopolyp! dit kostte "+prijs);
        System.out.println("aantal kaartjes spin verkocht: "+aantalKaartjes);
        if(aantalKaartjes>= 5){
            opstellingsKeuring();
        }


    }

    public void opstellingsKeuring(){
        System.out.println("de attractie moet gekeurd worden");
        aantalKaartjes = 0;
    }


}
