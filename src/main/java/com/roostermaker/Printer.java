package com.roostermaker;

import com.roostermaker.gezin_zaken.Gezin;

public class Printer {

    public static void printGezin() {
        System.out.println("Alle gezinsleden: ");
        for (int i = 0; i < Gezin.gezin.size(); i++) {
            System.out.println("-" + Gezin.gezin.get(i).getNaam() +
                    "(" + Gezin.gezin.get(i).getGezinverhouding() + ")");
            printTaakSelectie(i);
        }
    }
    
    public static void printTaakSelectie(int i){
        int gezinIndex = 0;
        for (String gezinslid : Gezin.gekozenGezinslid) {
            if (gezinslid.equals(Gezin.gezin.get(i).getNaam()) && gezinIndex == 0) {
                for (int j = 0; j < Taken.gekozenTaken.size(); j++) {
                    if (Gezin.gezin.get(i).getNaam().equals(Gezin.gekozenGezinslid.get(j))) {
                        if (gezinIndex == 0) {
                            System.out.print("      *Gekozen taak/taken: ");
                            System.out.print(Taken.gekozenTaken.get(j).getTaak());
                            gezinIndex++;
                        } else {
                            System.out.print(", " + Taken.gekozenTaken.get(j).getTaak());
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
