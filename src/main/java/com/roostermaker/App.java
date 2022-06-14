package com.roostermaker;


import com.roostermaker.Scanner.ScannerV3;
import com.roostermaker.gezin_zaken.Gezin;
import com.roostermaker.gezin_zaken.Kind;
import com.roostermaker.gezin_zaken.Ouder;
import com.roostermaker.week.DoorDeWeeks;
import com.roostermaker.week.Week;
import com.roostermaker.week.Weekend;

public class App {
    ScannerV3 scanner = new ScannerV3();
    public void main( String[] args ){
        seed();        
        mainMenu();       
    }

    private static void seed() {
        new Kind("Wessel", 240);
        new Kind("Jasmijn", 270);
        new Ouder("Gert-jan", 240);        
        Taken.taken.add(new Taken("Afwassen", 15));
        Taken.taken.add(new Taken("Stofzuigen", 60));
        Taken.taken.add(new Taken("Was op hangen", 30));
        Week.week.add(new DoorDeWeeks("Maandag", "Ochtend"));
        Week.week.add(new DoorDeWeeks("Dinsdag", "Middag"));
        Week.week.add(new DoorDeWeeks("Woensdag", "Avond"));
        Week.week.add(new DoorDeWeeks("Donderdag", null));
        Week.week.add(new DoorDeWeeks("Vrijdag", null));
        Week.week.add(new Weekend("Zaterdag", "Middag"));
        Week.week.add(new Weekend("Zondag", "Avond"));      
    }

    public void mainMenu(){
        mainMenu: while (true){
            clearScreen();
            aanroepMenuKeuzes();
            try {
                switch (scanner.nextLine()){
                    case ("1"): case1PrintGezin(); break;
                    case ("2"): case2PrintTaken(); break;
                    case ("3"): case3MaakNieuweTaak(); break;
                    case ("4"): case4TaakSelecteren(); break;
                    case ("5"): case5MaakNieuweGezinslid(); break;
                    case ("6"): case6RoosterInvullen(); break;
                    case ("0"): break mainMenu;
                    default: caseDefault(); break;
                }
            } catch (Exception e) {
                System.out.println("Error in method mainMenu in class App");
                System.out.println(e);
                pauseMenu();
            }
        }        
    }

    

    private void caseDefault() {
        clearScreen();
        System.out.println("Voer geldige optie in.");
        pauseMenu();
    }

    private void case1PrintGezin() {
        clearScreen();
        Printer.printGezin();
        pauseMenu();
    }
    private void case2PrintTaken() {
        clearScreen();
        Taken.printTaken();
        pauseMenu();
    }
    private void case3MaakNieuweTaak() {        
        clearScreen();
        Taken.maakNieuweTaak();
        pauseMenu();
    }
    private void case4TaakSelecteren() {
        clearScreen();
        Taken.taakSelecteren();
        pauseMenu();
    }
    private static void case5MaakNieuweGezinslid() {
        clearScreen();
        Gezin.maakNieuwGezinslid();
        pauseMenu();
    }
    private static void case6RoosterInvullen() {
        clearScreen();
        Rooster.roosterInvullen();
        pauseMenu();
    }

    private static void aanroepMenuKeuzes() {
        System.out.println(
        "1) Print alle gezins leden" + "\n" +
        "2) Print alle taken" + "\n" +
        "3) Nieuwe taak maken" + "\n" +
        "4) Selecteer een taak" + "\n" +
        "5) Nieuw gezinslid maken" + "\n" +
        "6) Kiezen wanneer de taak wordt uitgevoerd" + "\n" +
        "0) Stop programma");
    }
    
    public static void foutMelding(){
        System.out.println("Kies een optie hier boven gegeven.");
        pauseMenu();
        clearScreen();
    }

    //pauseMenu
    public static void pauseMenu() {
        ScannerV3 scanner = new ScannerV3();
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
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();}
            else{
                Runtime.getRuntime().exec("clear");}
        }catch (Exception e) {}
    }
}
    
