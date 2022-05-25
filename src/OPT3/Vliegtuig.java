package com.roostermaker.OPT3;

import java.util.ArrayList;

public class Vliegtuig {
    public int gewicht;
    public int passagiers;
    public boolean bagageAfhandeling;
    public boolean nederlands;
    public static ArrayList<Vliegtuig> vliegtuigen = new ArrayList<>();
    

    
    public Vliegtuig(int gewicht, int passagiers, boolean bagageAfhandeling, boolean nederlands) {
        this.gewicht = gewicht;
        this.passagiers = passagiers;
        this.bagageAfhandeling = bagageAfhandeling;
        this.nederlands = nederlands;
        vliegtuigen.add(this);
    }

    public int getGewicht() {
        return gewicht;
    }

    public boolean isNederlands() {
        return nederlands;
    }
    

    public static boolean vliegen(boolean toestemming, double gewicht, double tegenwind) {
        if (toestemming) {
            if (gewicht < 1000 || tegenwind > 50) {
                return true;
            }
        }
        return false;
    }

    public int tariefBerekenen(){
        int tarief;
        if(gewicht < 1000){
            tarief = 100;
        }else if(gewicht < 5000){
            tarief = 500;
        }else{
            tarief = 2500;
        }
        

        if(passagiers > 2){
            tarief *= 1.5;
        }
        if(bagageAfhandeling){
            tarief += 800;
        }
        if(nederlands){
            tarief *= 1.21;
        }
        return tarief;
    }    
}


