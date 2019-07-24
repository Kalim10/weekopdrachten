package nl.Weekopdrachten.kermis;

import java.util.ArrayList;
import java.util.Scanner;

public class Kermis {
    int totaleKaartjes = 0;
    Kassa kassa = new Kassa();
    BelastingInspecteur belastingInspecteur = new BelastingInspecteur();
    Scanner invoer = new Scanner(System.in);
    int keuze;
    BotsAuto botsAuto = new BotsAuto();
    Draaimolen draaimolen = new Draaimolen();
    Hawaii hawaii = new Hawaii();
    LadderKlimmen ladderKlimmen = new LadderKlimmen();
    SpiegelPaleis spiegelPaleis = new SpiegelPaleis();
    Spin spin = new Spin();
    SpookHuis spookhuis = new SpookHuis();

    ArrayList<Attractie> attractieList = new ArrayList<>();


    public ArrayList showAttracties() {
        attractieList.add(botsAuto);
        attractieList.add(draaimolen);
        attractieList.add(hawaii);
        attractieList.add(ladderKlimmen);
        attractieList.add(spiegelPaleis);
        attractieList.add(spin);
        attractieList.add(spookhuis);
        for (Attractie x : attractieList) {
            System.out.println(x.name + " prijs :" + x.prijs);
        }
        return attractieList;

    }
    public void belastingBetalen(){
        belastingInspecteur.belastingOphalen();
        System.out.println("Belasting betalen hoop dat de boeken in orde zijn");
    }
    public void Bezoeken() {

        System.out.println("===WELKE ATTRACTIE WILT U PROBEREN? TOETS UW KEUZE IN====");
        System.out.println("==DRUK OP '9' voor de totale omzet van de kermis");
        System.out.println("===Druk op 0 om de Kermis te verlaten===");
        System.out.println("===de Belasting dienst kan op elk willekeurig moment verschijnen==");
        do {
            attractieKeuze();
            if(totaleKaartjes %15 == 0)
                belastingBetalen();

        } while (keuze != 0);


    }

    public void attractieKeuze() {
        keuze = invoer.nextInt();
        switch (keuze) {
            case 1:
                botsAuto.draaien();
                totaleKaartjes++;
                break;
            case 2:
                draaimolen.draaien();
                totaleKaartjes++;
                break;
            case 3:
                hawaii.draaien();
                totaleKaartjes++;
                break;
            case 4:
                ladderKlimmen.draaien();
                totaleKaartjes++;
                break;
            case 5:
                spiegelPaleis.draaien();
                totaleKaartjes++;
                break;
            case 6:
                spin.draaien();
                totaleKaartjes++;
                break;
            case 7:
                spookhuis.draaien();
                totaleKaartjes++;
                break;
            case 0:
                System.out.println("tot ziens!");
                break;
            case 9:
                kassa.getTotaalOmzet(attractieList);
                break;

            default:
                System.out.println("ongeldige keuze");

        }

    }

}
