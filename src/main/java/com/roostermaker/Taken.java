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
        System.out.println("Voer de naam van de taak in: ");
        String nieuweTaak = scanner.nextLine();
        System.out.println("Voer de tijdsduur van de taak in (minuten): ");
        int nieuweTijdDuur = scanner.nextInt();
        new Taken(nieuweTaak, nieuweTijdDuur);
    }

    public static void printTaken(){
        System.out.println("Alle taken:");
        for (Taken printTaak : taken) {
            System.out.println(printTaak.getTaak() + 
            ", tijdsduur: " + printTaak.getTijdDuur() + "minuten");
        }
    }

    public static void taakSelecteren(IScanner scanner){
        Gezin.kiesGezinslid(scanner);
        kiesTaak(scanner);
    }

    public static void kiesTaak(IScanner scanner){        
        System.out.println("Kies een taak:");
        int teller = 1;
        for (Taken lijst : taken) {            
            System.out.println(teller + ") " + lijst.getTaak());
            teller++;
        }
    }



    
}
