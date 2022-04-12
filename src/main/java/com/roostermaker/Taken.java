package com.roostermaker;

import java.util.ArrayList;
import java.util.Scanner;

public class Taken {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> taken = new ArrayList<>();

    public void addTaken(){
        taken.add("Tafel afruimen/dekken");
        taken.add("Vaatwasser in/uit ruimen");
        taken.add("Stofzuigen");
    }

    public void invoerenTaak(){
        System.out.println("voer taak in");
        String invoer = scanner.nextLine();
        taken.add(invoer);
    }




}
