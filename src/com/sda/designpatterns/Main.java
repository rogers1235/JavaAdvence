package com.sda.designpatterns;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //DRY
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdu primul numar");
        int firstNumber = getValidIntNumberFromConsole(scanner);

        System.out.println("Introdu al doilea numar");
        int secondNumber = getValidIntNumberFromConsole(scanner);

        int sum = firstNumber + secondNumber;
        System.out.println("Suma numerelor introduse este: " + sum);

    }

    private static int getValidIntNumberFromConsole(Scanner scanner){
        int numberFromConsole = 0;
        try {
            numberFromConsole = scanner.nextInt();
        }catch (InputMismatchException exception){
            System.out.println("Te rog introdu un numar valid");
            scanner.nextLine();
            numberFromConsole = getValidIntNumberFromConsole(scanner);
        }
        return numberFromConsole;
    }

}
