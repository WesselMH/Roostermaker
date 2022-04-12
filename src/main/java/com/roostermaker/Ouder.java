package com.roostermaker;

import java.util.ArrayList;

public class Ouder extends Gezin {
    //private String naam;
    //private double beschikbareTijd;
    public ArrayList<Gezin> ouder = new ArrayList<>();

    public Ouder(String naam, double beschikbareTijd, String gezinsverhouding) {
        super(naam, beschikbareTijd, gezinsverhouding);
        Gezin.gezin.add(this);
    }


    public String getNaam(){
        return this.naam;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }
}
