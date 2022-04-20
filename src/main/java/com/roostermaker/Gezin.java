package com.roostermaker;
import java.util.ArrayList;

public class Gezin {
    protected String naam;
    protected Double beschikbareTijd;
    protected String gezinverhouding;
    public static ArrayList<Gezin> gezin = new ArrayList<>();

    public Gezin(String naam, double beschikbareTijd, String gezinverhouding) {
        this.naam = naam;
        this.beschikbareTijd = beschikbareTijd;
        this.gezinverhouding = gezinverhouding;
        gezin.add(this);
    }

    public String getNaam(){
        return this.naam;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }

    public void setBeschikbareTijd(Double tijd){
        this.beschikbareTijd = tijd;
    }

    public String getGezinverhouding() {
        return gezinverhouding;
    }    

    public static void printGezin(){
        for (Gezin printGezin : gezin) {
            System.out.println("Gezinslid: " + printGezin.getNaam() );
        }
    }
}
