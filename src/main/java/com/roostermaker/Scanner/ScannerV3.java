package com.roostermaker.Scanner;

import java.util.Scanner;

public class ScannerV3 implements IScanner{
    Scanner scanner = new Scanner(System.in);

    //public ScannerV3(){}

    @Override
    public int nextInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } 
            catch (NumberFormatException e) {
                System.out.println("Voer enkel cijfers in.");
            }
        }
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }

    @Override
    public Integer nextInteger() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } 
            catch (NumberFormatException e) {
                System.out.println("Voer enkel cijfers in.");
            }
        }
    }    
}