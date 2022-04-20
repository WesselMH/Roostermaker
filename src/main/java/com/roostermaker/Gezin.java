package com.roostermaker;
import java.util.ArrayList;

public class Gezin {
    protected String naam;
    protected Double beschikbareTijd;
    private String gezinverhouding;
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

    public void setName(String name){
        naam = name;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }

    public void setBeschikbareTijd(Double tijd){
        beschikbareTijd = tijd;
    }
}
