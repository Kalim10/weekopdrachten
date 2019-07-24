package nl.Weekopdrachten.kermis.yathzee;

import java.util.ArrayList;
import java.util.Scanner;

class Yathzee {
    String schot;
    int spel;

    int worp = (int) (Math.random() * 6 + 1);
    ArrayList<Dobbelstenen> stenen = new ArrayList<>();

    Dobbelstenen steen1 = new Dobbelstenen(1);
    Dobbelstenen steen2 = new Dobbelstenen(2);
    Dobbelstenen steen3 = new Dobbelstenen(3);
    Dobbelstenen steen4 = new Dobbelstenen(4);
    Dobbelstenen steen5 = new Dobbelstenen(5);


    Yathzee() {

        stenen.add(steen1);
        stenen.add(steen2);
        stenen.add(steen3);
        stenen.add(steen4);
        stenen.add(steen5);


    }


    public void spelen() {
        System.out.println("WELKOM BIJ YATHZEE DRUK 10 OM TE GOOIEN");
        Scanner sc = new Scanner(System.in);
        int spel = sc.nextInt();
        // System.out.println("spelen = " + spel);
        if (spel == 10)
            do {
                sc.nextLine();
                for (Dobbelstenen steen : stenen) {

                    if (steen.vasthouden == false) {
                        int worp = steen.getWorp();
                        int positie = steen.positie;

                        System.out.print("positie:" + positie);
                        System.out.println(" Worp:" + worp);

                    }


                }
                System.out.println("Welke posities wil je vasthouden? (positie,positie)");

                String temp = sc.nextLine();
                String[] split = temp.split(",");
                for (String index : split) {
                    stenen.get(Integer.parseInt(index) - 1).vasthouden = true;

                }


            } while (spel != 0);
    }


}

//   for(//int worp:stenen){
//   System.out.println(steen1.getWorp());
// System.out.println(steen2.getWorp());
// System.out.println(steen3.getWorp());
// System.out.println(steen4.getWorp());
// System.out.println(steen5.getWorp());


// for(stenen:)
//inlezen invoer
//  steen1.werpen();
//opnieuw werpen
//   spel = sc.nextInt();
//      System.out.println("spelen = " + spel);





