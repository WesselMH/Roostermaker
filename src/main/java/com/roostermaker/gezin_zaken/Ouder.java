package com.roostermaker.gezin_zaken;

public class Ouder extends Gezin {
    
    public Ouder(String naam, int beschikbareTijd) {
        super(naam, beschikbareTijd, "Ouder");
        System.out.println("Nieuwe ouder aangemaakt.");
    }
}
