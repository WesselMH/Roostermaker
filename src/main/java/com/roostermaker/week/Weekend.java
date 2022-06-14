package com.roostermaker.week;

import com.roostermaker.App;
import com.roostermaker.Scanner.ScannerV3;

public class Weekend extends Week{
    ScannerV3 scanner = new ScannerV3();

    public Weekend(String dag, String dagdeel) {
        super(dag, dagdeel, true);
    }
    
    @Override
    public String getDagVanWeek() {
        while (true) {
            System.out.println("Welke dag wil je een taak doen?" + "\n" +
                    "1) Zaterdag" + "\n" +
                    "2) Zondag");
            int keuze = scanner.nextInt();
            if (keuze > 0 && keuze < 3) {
                dag = DoorDeWeeks.getWeek().get(keuze + 4).getDag();
                return dag;
            } else {App.foutMelding(scanner);}
        }
    }

    public String getDagdeel(){
        return dagdeel;
    }

    @Override
    public String getGekozenDagDeel() {
        while (true) {
            System.out.println("Welk dag deel wil je inplannen?" + "\n" +
                    "1) Middag" + "\n" +
                    "2) Avond");
            int keuze = scanner.nextInt();
            if (keuze > 0 && keuze < 3) {
                dagdeel = DoorDeWeeks.getWeek().get(keuze).getDagdeel();
                break;
            } else {App.foutMelding(scanner);
            }
        }App.clearScreen(); return dagdeel;
    }
}
