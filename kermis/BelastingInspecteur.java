package nl.Weekopdrachten.kermis;

public class BelastingInspecteur extends Kassa {
    int belasting;

    public void belastingOphalen(){
        belasting = (totaalomzet/100)*30;
        totaalomzet -= belasting;

    }
}
