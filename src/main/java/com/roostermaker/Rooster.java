package com.roostermaker;

import com.roostermaker.Scanner.IScanner;
import com.roostermaker.week.Week;

public class Rooster {
    private static String dag;
    private static int scanDag;
    private static String dagdeel;
    private static Week dagVanDWeek;

    
    public static void roosterInvullen(IScanner scanner){
        Week selectedDag = isWeekend(scanner);
        dag = selectedDag.getDagVanWeek();
        App.clearScreen();
        dagdeel = selectedDag.getGekozenDagDeel();
        System.out.println("Gekozen dag met dagdeel:" + "\n" + dag + " " + dagdeel);
        System.out.println();
    }

    private static Week isWeekend(IScanner scanner) {
        while (true) {
            System.out.println("Wil je in het weekend of door de weeks?" + "\n" +
                    "1) Door de weeks" + "\n" +
                    "2) Weekend");
            scanDag = scanner.nextInt();
            if (scanDag > 0 && scanDag < 3) {
                if (scanDag == 2) {
                    scanDag = 6;
                }
                dagVanDWeek = Week.week.get(scanDag);
                break;
            } else {App.foutMelding(scanner);}
        }
        App.clearScreen();
        return dagVanDWeek;
    }   
}
