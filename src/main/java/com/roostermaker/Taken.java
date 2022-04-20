package com.roostermaker;

import java.util.ArrayList;
import java.util.Scanner;

public class Taken {
    Scanner scanner = new Scanner(System.in);

    private String taak;
    private Double tijdDuur;
    public static ArrayList<Taken> taken = new ArrayList<>();

    public Taken(String taak, Double tijdDuur){
        this.taak = taak;
        this.tijdDuur = tijdDuur;
        taken.add(this);
    }

    public String getTaak() {
        return taak;
    }    

    public Double getTijdDuur() {
        return tijdDuur;
    }

    public static void maakNieuweTaak(Scanner scanner){
        System.out.println("Voer de naam van de taak in: ");
        taak = scanner.nextLine();
        System.out.println("Voer de tijds duur van de taak in: ");
        tijdDuur = scanner.nextDouble();
        Taken taken = new Taken(taak, tijdDuur);
    }

    public static void printTaken(){
        for (Taken printTaak : taken) {
            System.out.println("Naam van de taak: " + printTaak.getTaak());
        }
    }

    
}
