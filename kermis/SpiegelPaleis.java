package nl.Weekopdrachten.kermis;

public class SpiegelPaleis extends Attractie{
    public SpiegelPaleis(){
        name = "SPIEGELPALEIS(5)";
        prijs = 275;
        aantalKaartjes = 0;
    }
    public void draaien(){
        omzet += prijs;
        aantalKaartjes++;
        System.out.println("U zit nu in het spiegelpaleis lekker gekke bekken trekken! dit kostte :"+prijs);
        System.out.println("aantal kaartjes spiegelpaleis verkocht: "+aantalKaartjes);


    }


}
