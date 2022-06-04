package com.roostermaker;

import java.util.ArrayList;

import com.roostermaker.Scanner.IScanner;
import com.roostermaker.gezin_zaken.Gezin;

public class Taken {
    private String taak;
    private int tijdDuur;
    public static ArrayList<Taken> taken = new ArrayList<>();
    public static ArrayList<Taken> gekozenTaken = new ArrayList<>();

    public Taken(String taak, int tijdDuur){
        this.taak = taak;
        this.tijdDuur = tijdDuur;
    }

    public String getTaak() {
        return taak;
    }    

    public int getTijdDuur() {
        return tijdDuur;
    }

    public ArrayList<Taken> getTaken(){
        return gekozenTaken;
    }

    public static void maakNieuweTaak(IScanner scanner){
        String nieuweTaak = chechTaak(scanner);
        System.out.println("Voer de tijdsduur van de taak in (minuten): ");
        int nieuweTijdDuur = scanner.nextInt();
        taken.add(new Taken(nieuweTaak, nieuweTijdDuur));
    }

    public static void printTaken(){
        System.out.println("Alle taken:");
        for (Taken printTaak : taken) {
            System.out.println("-" + printTaak.getTaak() + 
            ", tijdsduur: " + printTaak.getTijdDuur() + " minuten");
        }
    }

    public static void taakSelecteren(IScanner scanner) {
        String geselecteerdGezinslid = Gezin.kiesGezinslid(scanner);
        Integer geselecteerdeTaakIndex = kiesTaak(scanner, geselecteerdGezinslid);
        selecteerLoop: while (true) {
            boolean bevestiging = bevestigingAanmaak(scanner);
            if (bevestiging) {
                gekozenTaken.add(taken.get(geselecteerdeTaakIndex));
                Gezin.gekozenGezinslid.add(geselecteerdGezinslid);
                break selecteerLoop;
            } else {
                break selecteerLoop;
            }
        }
    }

    private static boolean bevestigingAanmaak(IScanner scanner) {
        while (true) {
            System.out.println("Weet je het zeker?" + "\n" +
                                "1) Ja zeker!!" + "\n" +
                                "0) Nee doe toch maar niet....");
            int input = scanner.nextInt();
            if (input == 1) {
                return true;
            }if(input == 0){
                return false;
            }else{
                System.out.println("Kies een geldige optie");
                App.pauseMenu(scanner);
                App.clearScreen();
            }
        }
    }

    public static Integer kiesTaak(IScanner scanner, String geselecteerdGezinslid) {
        App.clearScreen();
        while (true) {
            System.out.println("Geselecteerd gezinslid: "+ geselecteerdGezinslid + "\n" +
                                "Kies een taak:");
            int teller = 1;
            for (Taken lijst : taken) {
                System.out.println(teller + ") " + lijst.getTaak());
                teller++;
            }

            Integer input = scanner.nextInteger();
            if (input > 0 && input <= taken.size()) {
                return input - 1;
            } else {
                App.foutMelding(scanner);
            }
        }
    }

    public static String chechTaak(IScanner scanner) {
        while (true) {
            Boolean isNotFound = false;
            System.out.println("Voer de naam van de taak in: ");
            String input = scanner.nextLine();
            for (Taken taak : taken) {
                if (taak.getTaak().equals(input)) {
                    System.out.println("Sorry deze taak bestaat al.");
                    App.pauseMenu(scanner);
                    App.clearScreen();
                    break;
                }else{
                    isNotFound = true;
                    break;
                }
            }
            if (isNotFound) {
                return input;
            }
        }
    }    
}
