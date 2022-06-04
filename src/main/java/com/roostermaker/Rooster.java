package com.roostermaker;

import com.roostermaker.Scanner.IScanner;
import com.roostermaker.week.Week;

public class Rooster {
    private static String dag;
    private static int scanDag;
    private static String dagdeel;
    private static int scanDagdeel;
    private static int dagteller = 0;

    
    public static void roosterInvullen(IScanner scanner){
        dag = dagKeuze(scanner);
        System.out.println("Welk dag deel wil je inplannen?");
        for (int i = 0; i < Week.week.size() -1; i++) {
            if(Week.week.get(i).getDag().equals(dag)){
                System.out.println(dagteller + 1 + ") " + Week.week.get(i).getDagdeel());
                dagteller++;
            }            
        }
        scanDagdeel = scanner.nextInt();
        
        dagdeel = dagdeelKeuze(scanDagdeel);
    }

    private static String dagKeuze(IScanner scanner) {
        System.out.println("Voor welke dag van de week wil je inplannen?");
        for (int i = 0; i < 7; i++) {
            System.out.println(i + 1 + ") " + Week.week.get(i).getDag());
        }

        System.out.println("0) Exit");
        scanDag = scanner.nextInt();
        if (scanDag > 0 && scanDag < Week.week.size() - 1) {
            dag = Week.week.get(scanDag).getDag();
        } else {
            App.foutMelding(scanner);
        }
        App.clearScreen();
        return dag;
    }

    private static String dagdeelKeuze(int dagdeelKeuze) {
        if(dagdeelKeuze == 1){
            dagdeel = "ochtend";
        }else if(dagdeelKeuze == 2){
            dagdeel = "middag";
        }else if(dagdeelKeuze == 2){
            dagdeel = "avond";
        } 
        return dagdeel;
    }    
}
