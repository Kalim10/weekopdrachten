package nl.nl.qien.weekopdrachten.yathzee;

import java.util.ArrayList;

public class Dobbelstenen {
    boolean vasthouden;
    int worp;
    int positie;

    Dobbelstenen(int positie) {
        this.positie = positie;
    }

    public void setWorp() {
        worp = (int)(Math.random() * 6 + 1);

    }

    public int getWorp() {
        worp = (int)(Math.random() * 6 + 1);
        this.worp = worp;
        return worp;
    }
    public void setVasthouden(){
        vasthouden = false;

    }
     public boolean getVasthouden(){
        return false;
     }

//    public boolean isVasthouden(){
//        vasthouden = false;
//        return vasthouden;
//    }


}
