package com.roostermaker.week;

import com.roostermaker.App;
import com.roostermaker.Scanner.ScannerV3;

public class DoorDeWeeks extends Week{
    ScannerV3 scanner = new ScannerV3();

    public DoorDeWeeks(String dag, String dagdeel) {
        super(dag, dagdeel, false);
    }
    
    @Override
    public String getDagVanWeek() {
        while (true) {
            System.out.println("Welke dag wil je een taak doen?" + "\n" +
                    "1) Maandag" + "\n" +
                    "2) Dinsdag" + "\n" +
                    "3) Woensdag" + "\n" +
                    "4) Donderdag" + "\n" +
                    "5) Vrijdag");
            int keuze = scanner.nextInt();
            if(keuze > 0 && keuze < 6){
                dag = DoorDeWeeks.getWeek().get(keuze - 1).getDag();
                return dag;
            }
            else{App.foutMelding(scanner);}            
        }
    }

    @Override
    public String getGekozenDagDeel() {
        while (true) {
            System.out.println("Welk dag deel wil je inplannen?" + "\n" +
                    "1) Ochtend" + "\n" +
                    "2) Middag" + "\n" +
                    "3) Avond");
            int keuze = scanner.nextInt();
            if (keuze > 0 && keuze < 4) {
                dagdeel = DoorDeWeeks.getWeek().get(keuze - 1).getDagdeel();
                break;
            } else {App.foutMelding(scanner);}
        }App.clearScreen(); return dagdeel;
    }
}
