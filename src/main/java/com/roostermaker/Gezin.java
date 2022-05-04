package com.roostermaker;

import java.util.ArrayList;

public class Gezin {
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
    }

    public String getNaam() {
        return this.naam;
    }

    public double getBeschikbareTijd() {
        return this.beschikbareTijd;
    }

    public void setBeschikbareTijd(int tijd) {
        this.beschikbareTijd = tijd;
    }

    public String getGezinverhouding() {
        return gezinverhouding;
    }

    public static void printGezin() {
        System.out.println("Alle gezinsleden: ");
        // for (Gezin printGezin : gezin) {
        for (int i = 0; i < gezin.size(); i++) {
            System.out.println("-" + gezin.get(i).getNaam() +
                    "(" + gezin.get(i).getGezinverhouding() + ")");
            // int gezinIndex = i;
//moet uitzoeken hoe ik dit doe
            // for (String gezinslid : Taken.taken.get(i).getTaak()) {


            //     if (gezinslid.equals(gezin.get(i).getNaam())) {
            //         if (Taken.gekozenTaken.size() == 1) {
            //             System.out.print("      *Gekozen taak: ");
            //             System.out.println(Taken.gekozenTaken.get(0).getTaak());
            //             break;
            //         } else {
            //             System.out.print("      *Gekozen taken: ");
            //             for (int j = 0; j < Taken.gekozenTaken.size(); j++) {
            //                 System.out.print(Taken.gekozenTaken.get(j).getTaak());
            //                 if (j < (Taken.gekozenTaken.size() - 1)) {
            //                     System.out.print(", ");
            //                 }
            //             }
            //             System.out.println();
            //             break;
            //         }
            //     }
            // }
        }
    }

    public static String kiesGezinslid(IScanner scanner) {
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
            } else {
                System.out.println("Kies een optie hier boven gegeven.");
                App.pauseMenu(scanner);
                App.clearScreen();
            }
        }
    }

    public static void maakNieuwGezinslid(IScanner scanner) {
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
