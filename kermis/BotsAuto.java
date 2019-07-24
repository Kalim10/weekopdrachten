package nl.Weekopdrachten.kermis;

class BotsAuto extends Attractie {

    public BotsAuto() {
        name = "BOTSAUTO(1)";
        prijs = 250;
        aantalKaartjes =0;
    }


    public void draaien() {
        omzet += prijs;
        aantalKaartjes++;
        System.out.println("U zit nu in de botsauto's BOEM BENG BAFFF!!! " + "dit kostte" + prijs);
        System.out.println("botautokaartjes verkocht "+aantalKaartjes);

    }


}

