package nl.Weekopdrachten.kermis;

import java.util.ArrayList;

public class Kassa {
    int totaalomzet;


    public void getTotaalOmzet(ArrayList<Attractie> attractieList) {
        for (Attractie x : attractieList) {
            totaalomzet += x.omzet;
            System.out.println("Omzet" + x.name + ":" + x.omzet);
            System.out.println("totale omzet kermis:"+totaalomzet);
        }
    }
}
