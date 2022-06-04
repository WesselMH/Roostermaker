package com.roostermaker;

import javax.swing.Painter;

import com.roostermaker.Scanner.IScanner;
import com.roostermaker.Scanner.ScannerV3;
import com.roostermaker.gezin_zaken.Gezin;
import com.roostermaker.gezin_zaken.Kind;
import com.roostermaker.gezin_zaken.Ouder;
import com.roostermaker.week.DoorDeWeeks;
import com.roostermaker.week.Week;
import com.roostermaker.week.Weekend;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        ScannerV3 scanner = new ScannerV3();
        seed();        
        mainMenu(scanner);       
    }

    private static void seed() {
        new Kind("Wessel", 240);
        new Kind("Jasmijn", 270);
        new Ouder("Gert-jan", 240);        
        Taken.taken.add(new Taken("Afwassen", 15));
        Taken.taken.add(new Taken("Stofzuigen", 60));
        Taken.taken.add(new Taken("Was op hangen", 30));
        String dagdeel = "";
        for (int i = 0; i < 3; i++) {
            if(i == 0){dagdeel = "ochtend";}
            if(i == 1){dagdeel = "middag";}
            if(i == 2){dagdeel = "avond";}
            Week.week.add(new DoorDeWeeks("Maandag", dagdeel));
            Week.week.add(new DoorDeWeeks("Dinsdag", dagdeel));
            Week.week.add(new DoorDeWeeks("Woensdag", dagdeel));
            Week.week.add(new DoorDeWeeks("Donderdag", dagdeel));
            Week.week.add(new DoorDeWeeks("Vrijdag", dagdeel));
            Week.week.add(new Weekend("Zaterdag", dagdeel));
            Week.week.add(new Weekend("Zondag", dagdeel));
        }        
    }

    public static void mainMenu(IScanner scanner){
        mainMenu: while (true){
            clearScreen();
            aanroepMenuKeuzes();
            try {
                switch (scanner.nextLine()){
                    case ("1"): case1PrintGezin(scanner); break;
                    case ("2"): case2PrintTaken(scanner); break;
                    case ("3"): case3MaakNieuweTaak(scanner); break;
                    case ("4"): case4TaakSelecteren(scanner); break;
                    case ("5"): case5MaakNieuweGezinslid(scanner); break;
                    case ("6"): case6RoosterInvullen(scanner); break;
                    case ("0"): break mainMenu;
                    default: caseDefault(scanner); break;
                }
            } catch (Exception e) {
                System.out.println("Error in method mainMenu in class App");
                System.out.println(e);
                pauseMenu(scanner);
            }
        }        
    }

    

    private static void caseDefault(IScanner scanner) {
        clearScreen();
        System.out.println("Voer geldige optie in.");
        pauseMenu(scanner);
    }

    private static void case1PrintGezin(IScanner scanner) {
        clearScreen();
        Gezin.printGezin();
        pauseMenu(scanner);
    }
    private static void case2PrintTaken(IScanner scanner) {
        clearScreen();
        Taken.printTaken();
        pauseMenu(scanner);
    }
    private static void case3MaakNieuweTaak(IScanner scanner) {        
        clearScreen();
        Taken.maakNieuweTaak(scanner);
        pauseMenu(scanner);
    }
    private static void case4TaakSelecteren(IScanner scanner) {
        clearScreen();
        Taken.taakSelecteren(scanner);
        pauseMenu(scanner);
    }
    private static void case5MaakNieuweGezinslid(IScanner scanner) {
        clearScreen();
        Gezin.maakNieuwGezinslid(scanner);
        pauseMenu(scanner);
    }
    private static void case6RoosterInvullen(IScanner scanner) {
        clearScreen();
        Rooster.roosterInvullen(scanner);
        pauseMenu(scanner);
    }

    private static void aanroepMenuKeuzes() {
        System.out.println(
                "1) Print alle gezins leden" + "\n" + 
                "2) Print alle taken" + "\n" +
                "3) Nieuwe taak maken" + "\n" +
                "4) Selecteer een taak" + "\n" +
                "5) Nieuw gezinslid maken" + "\n" +
                "6) Kiezen wanneer de taak wordt uitgevoerd" + "\n" +
                "0) Stop programma"
                );
    }

    //pauseMenu
    public static void pauseMenu(IScanner scanner) {
        System.out.println("Press return to continue.");
        try {
            scanner.nextLine(); // This is just here to wait for input
        } catch (Exception e) {
            System.out.println("Error in method pauseMenu in class App");
            System.out.println(e);
        }
    }

    public static void clearScreen() {
        try{
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } 
        catch (Exception e) {}
    }

    public static void foutMelding(IScanner scanner){
        System.out.println("Kies een optie hier boven gegeven.");
        App.pauseMenu(scanner);
        App.clearScreen();
    }
}
    
