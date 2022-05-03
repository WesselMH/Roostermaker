package com.roostermaker;

import java.util.ArrayList;

public class Taken {
    private String taak;
    private int tijdDuur;
    public static ArrayList<Taken> taken = new ArrayList<>();
    public static ArrayList<Taken> gekozenTaken = new ArrayList<>();

    public Taken(String taak, int tijdDuur){
        this.taak = taak;
        this.tijdDuur = tijdDuur;
        taken.add(this);
    }

    public String getTaak() {
        return taak;
    }    

    public int getTijdDuur() {
        return tijdDuur;
    }

    public static void maakNieuweTaak(IScanner scanner){
        String nieuweTaak = chechTaak(scanner);
        System.out.println("Voer de tijdsduur van de taak in (minuten): ");
        int nieuweTijdDuur = scanner.nextInt();
        new Taken(nieuweTaak, nieuweTijdDuur);
    }

    public static void printTaken(){
        System.out.println("Alle taken:");
        for (Taken printTaak : taken) {
            System.out.println("-" + printTaak.getTaak() + 
            ", tijdsduur: " + printTaak.getTijdDuur() + " minuten");
        }
    }

    public static void taakSelecteren(IScanner scanner){
        String geselecteerdeTaak = Gezin.kiesGezinslid(scanner);
        kiesTaak(scanner, geselecteerdeTaak);

    }

    public static String kiesTaak(IScanner scanner, String geselecteerdeTaak) {
        String taak;
        App.clearScreen();
        while (true) {
            System.out.println("Geselecteerd gezinslid: "+ geselecteerdeTaak + "\n" +
                                "Kies een taak:");
            int teller = 1;
            for (Taken lijst : taken) {
                System.out.println(teller + ") " + lijst.getTaak());
                teller++;
            }

            int input = scanner.nextInt();
            if (input > 0 && input <= taken.size()) {
                taak = taken.get(input - 1).getTaak();                
                return taak;
            } else {
                System.out.println("Kies een optie hier boven gegeven.");
                App.pauseMenu(scanner);
                App.clearScreen();
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
