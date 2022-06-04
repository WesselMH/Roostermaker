package com.roostermaker.week;

import com.roostermaker.Scanner.ScannerV3;

public class DoorDeWeeks extends Week{
    ScannerV3 scanner = new ScannerV3();

    public DoorDeWeeks(String dag, String dagdeel) {
        super(dag, dagdeel, false);
    }
    
    @Override
    public String getDagVanWeek() {
        System.out.println("Welke dag wil je een taak doen?" + "\n" +
                "1) Maandag" + "\n" +
                "2) Dinsdag" + "\n" +
                "3) Woensdag" + "\n" +
                "4) Donderdag" + "\n" +
                "5) Vrijdag");
        int keuze = scanner.nextInt();
        if (keuze == 1) {
            dag = "Maandag";
        }
        if (keuze == 2) {
            dag = "Dinsdag";
        }
        if (keuze == 1) {
            dag = "Woensdag";
        }
        if (keuze == 2) {
            dag = "Donderdag";
        }
        if (keuze == 1) {
            dag = "Vrijdag";
        }
        return dag;
    }
}
