package nl.Weekopdrachten.kermis;

public class Hawaii extends Attractie implements RisicoRijk {

    public Hawaii() {
        name = "HAWAII(3)";
        prijs = 290;
        aantalKaartjes = 0;
    }

    public void draaien() {
        omzet += prijs;
        aantalKaartjes++;
        System.out.println("U zit nu in de hawaii ALOHAWAAAAAI! dit kostte " + prijs);
        System.out.println("aantal kaartjes hawaii verkocht: " + aantalKaartjes);
        if (aantalKaartjes >= 10) {
            opstellingsKeuring();
        }

    }

    public void opstellingsKeuring() {
        System.out.println("de attractie moet gekeurd worden");
        aantalKaartjes = 0;
    }

}
