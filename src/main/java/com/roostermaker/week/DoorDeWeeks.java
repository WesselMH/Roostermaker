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
                if (keuze == 1) {
                    return "Maandag";
                }
                if (keuze == 2) {
                    return "Dinsdag";
                }
                if (keuze == 3) {
                    return "Woensdag";
                }
                if (keuze == 4) {
                    return "Donderdag";
                }
                if (keuze == 5) {
                    return "Vrijdag";
                }
            }
            else{
                App.foutMelding(scanner);
            }
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
                if (keuze == 1) {
                    dagdeel = "ochtend";
                } else if (keuze == 2) {
                    dagdeel = "middag";
                } else {
                    dagdeel = "avond";
                }
                break;
            } else {
                App.foutMelding(scanner);
            }
        }
        App.clearScreen();
        return dagdeel;
    };

}
