package com.roostermaker.gezin_zaken;

import java.util.ArrayList;

import com.roostermaker.App;
import com.roostermaker.Scanner.ScannerV3;

public abstract class Gezin {
    protected String naam;
    protected int beschikbareTijd;
    protected String gezinverhouding;
    public static ArrayList<Gezin> gezin = new ArrayList<>();
    //gekozenGezinslid gebruikt class taken zodat die een string en int opslaan.
    public static ArrayList<String> gekozenGezinslid = new ArrayList<>();

    public Gezin(String naam, int beschikbareTijd, String gezinverhouding) {
        this.naam = naam;
        this.beschikbareTijd = beschikbareTijd;
        this.gezinverhouding = gezinverhouding;
        gezin.add(this);
    }

    public String getNaam() {
        return this.naam;
    }

    public int getBeschikbareTijd() {
        return this.beschikbareTijd;
    }

    public void setBeschikbareTijd(int tijd) {
        this.beschikbareTijd = tijd;
    }

    public String getGezinverhouding() {
        return gezinverhouding;
    }

    public static String kiesGezinslid() {
        ScannerV3 scanner = new ScannerV3();
        String gezinslid;
        while (true) {
            System.out.println("Kies een gezinslid:");
            int teller = 1;
            for (Gezin lijst : gezin) {
                System.out.println(teller + ") " + lijst.getNaam());
                teller++;
            }
            int input = scanner.nextInt();
            if (input > 0 && input <= gezin.size()) {
                gezinslid = gezin.get(input - 1).getNaam();
                return gezinslid;
            } else {App.foutMelding();}
        }
    }

    public static void maakNieuwGezinslid() {
        ScannerV3 scanner = new ScannerV3();
        while (true) {
            System.out.println("Wat voor gezinslid wilt u aanmaken?" + "\n" +
                    "1) Een kind" + "\n" +
                    "2) Een ouder" + "\n" +
                    "0) Exit");
            Integer keuze = scanner.nextInt();
            if (keuze > 0 && keuze < 3) {
                String keuzeString = keuze.toString();
                String verhouding = bepaalVerhouding(keuzeString);
                bepalenGegevens(verhouding);
                break;
            }
            if (keuze == 0) {break;}
            else {App.foutMelding();}
        }
    }

    public static void bepalenGegevens(String verhouding){
        ScannerV3 scanner = new ScannerV3();
        System.out.println("Wat is de naam?");
        String naam = scanner.nextLine();
        System.out.println("Hoe veel uur is de beschikbaarheid per week?");
        int beschikbaar = scanner.nextInt();        
        if(verhouding.equals("Kind")){
            new Kind(naam, beschikbaar);}
        else if(verhouding.equals("Ouder")){
            new Ouder(naam, beschikbaar);}
    }

    public static String bepaalVerhouding(String input) {
        switch (input) {
            case ("1"): input = "Kind"; break;
            case ("2"): input = "Volwassenen"; break;
            default: System.out.println("Kies een gegeven optie."); break;
        } return input;
    }
}
