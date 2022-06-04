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
                if (keuze == 1) {
                    return "Zaterdag";
                }
                if (keuze == 2) {
                    return "Zondag";
                }
            } else {
                App.foutMelding(scanner);
            }
        }
    }

    public String getDagdeel(){
        return dagdeel;
    }

    @Override
    public String getGekozenDagDeel() {
        // TODO Auto-generated method stub
        return null;
    }

    
}
