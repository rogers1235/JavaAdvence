package com.sda.javaadvenceexercises.vendingmachine;

import java.util.Scanner;

public class ScannerUtils {
    private static Scanner scanner;
    public static Scanner getScanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }


    public static int getNumberFromMachine(){
        Scanner scanner = getScanner();
        int userInput;
        try {
            userInput = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Introdu un numar valid.");
            scanner.nextLine();
            userInput = getNumberFromMachine();
        }

        return userInput;
    }

}
