package com.sda.javafundamentalscoding.exercises;
import java.util.Scanner;
public class ScannerUtils {


    private static Scanner scanner;
    public static Scanner getScanner() {
        if (scanner == null) { //am verificat daca e initializat
            scanner = new Scanner(System.in);//initializare scanner
        }
        return scanner;
    }
    public static int getNumberFromConsole() {
        Scanner scanner = getScanner();
        int userInput;
        try {
            userInput = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Nu ai introdus un caracter valid.Incearca din nou: ");
            scanner.nextLine();
            userInput = getNumberFromConsole();
        }
        return userInput;
    }
    public static float getFloatNumberFromConsole() {
        Scanner scanner = getScanner();
        float userInput;
        try {
            userInput = scanner.nextFloat();
        } catch (Exception e) {
            System.out.println("Nu ai introdus un caracter valid.Incearca din nou: ");
            scanner.nextLine();
            userInput = getFloatNumberFromConsole();
        }
        return userInput;
    }
    public static char getCharSymbolFromConsole() {
        Scanner scanner = getScanner();
        char userInput;
        try {
            userInput = scanner.next().charAt(0);
        } catch (Exception e) {
            System.out.println("Nu ai introdus un caracter valid.Incearca din nou: ");
            scanner.nextLine();
            userInput = getCharSymbolFromConsole();
        }
        return userInput;
    }
    public static String getWordFromConsole() {
        Scanner scanner = getScanner();
        String userInput;
        try {
            userInput = scanner.next();
        } catch (Exception e) {
            System.out.println("Nu ai introdus un text.Incearca din nou: ");
            scanner.nextLine();
            userInput = getWordFromConsole();
        }
        return userInput;
    }

}