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
        System.out.println("Alle gezinsleden: ");
        for (Gezin printGezin : gezin) {
            System.out.println("-" + printGezin.getNaam() + 
            "(" + printGezin.getGezinverhouding() + ")");

        }
    }

    public static void kiesGezinslid(IScanner scanner) {
        System.out.println("Kies een gezinslid:");
        int teller = 1;
        for (Gezin lijst : gezin) {
            System.out.println(teller + ") " + lijst.getNaam());
            teller++;
        }
    }
    public static void maakNieuwGezinslid(IScanner scanner){
        System.out.println("hier wordt een gezinslid gemaakt");
    }

    public static String bepaalVerhouding(String input) {
        switch (input) {
            case ("1"):
                input = "Kind";
                break;
            case ("2"):
                input = "Volwassenen";
                break;
            default:
                System.out.println("Kies een gegeven optie.");
                break;
        }
        return input;
    }
}
