package nl.Weekopdrachten.kermis;

public class KermisDemo {
    public static void main(String[] args) {
        System.out.println("Welkom op de kermis u kunt kiezen uit de volgende Attracties: ");
        Kermis kermis = new Kermis();
        kermis.showAttracties();
        kermis.Bezoeken();

    }
}
