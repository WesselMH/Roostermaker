package com.roostermaker;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ScannerV3 scanner = new ScannerV3();

        new Kind("wessel", 4.0, "kind");
        new Kind("jasmijn", 4.5, "kind");
        
        new Taken("Afwassen", 0.15);
        new Taken("Stofzuigen", 1.0);
        new Taken("Was op hangen", 0.30);
        // Gezin.printGezin();
        // Taken.printTaken();
        // Taken.maakNieuweTaak(scanner);
        mainMenu(scanner);

        
    }

    public static void mainMenu(IScanner scanner){
        mainMenu: while (true){
            clearScreen();
            System.out.println(
                "1) Print alle gezins leden" + "\n" + 
                "2) Print alle taken" + "\n" +
                "3) Nieuwe taak maken" + "\n" +
                "4) Selecteer een taak" + "\n" +
                "0) Stop programma"
                );
            try {
                switch (scanner.nextLine()){
                    case ("1"):
                        clearScreen();
                        Gezin.printGezin();
                        pauseMenu(scanner);
                        break;
                    case ("2"):
                        clearScreen();
                        Taken.printTaken();
                        pauseMenu(scanner);
                        break;
                    case ("3"):
                        clearScreen();
                        Taken.maakNieuweTaak(scanner);
                        pauseMenu(scanner);
                        break;
                    case ("4"):
                        clearScreen();
                        Taken.kiesTaak(scanner);
                        pauseMenu(scanner);
                        break;
                    case ("0"):
                        break mainMenu;
                    default:
                        clearScreen();
                        System.out.println("dit doet niks");
                        pauseMenu(scanner);
                        break;
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Error in method mainMenu in class App");
                System.out.println(e);
                pauseMenu(scanner);
            }
        }        
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
}
    