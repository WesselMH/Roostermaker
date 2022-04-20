package com.roostermaker;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Scanner scannakin = new Scanner();

        System.out.println( "Hello World!" );
        new Kind("wessel", 4.0, "kind");
        new Kind("jasmijn", 4.5, "kind");
        new Taken("Afwassen", 15.0);
        Gezin.printGezin();
        Taken.printTaken();
        Taken.maakNieuweTaak();
    }

}
