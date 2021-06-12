package com.sda.cristi.javafundamentals.javafundamentals;

import java.util.Scanner;

public class Palidrome {

        public static void main(String[] args) {
            System.out.println("Introdu cuvantul pe care vrei sa il verifici daca este sau nu palindrom");
            String word = getWordFromInput();
            if (isPalindrome(word)) {
                System.out.println("Cuvantul " + word + " este palindrom");
            } else System.out.println("Cuvantul " + word + " nu este palindrom");
        }

        public static String getWordFromInput() {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextLine();
        }

        public static boolean isPalindrome(String word) {
            return (new StringBuilder(word).reverse()).toString().equals(word);
        }


}
