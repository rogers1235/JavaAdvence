package com.sda.cristi.javafundamentals.javafundamentals.numberguessinggame;

import java.util.Scanner;

public class ScannerUtils {


        private static Scanner scanner;

        public static Scanner getScanner() {
            if (scanner == null) {
                scanner = new Scanner(System.in);
            }
            return scanner;
        }

        public static int getNumberFromConsole() {
            Scanner scanner = getScanner();
            int userInput;
            try {
                userInput = scanner.nextInt();
            } catch (Exception exception) {
                System.out.println("Introdu un numar valid:");
                scanner.nextLine();
                userInput = getNumberFromConsole();
            }
            return userInput;
        }
    }
