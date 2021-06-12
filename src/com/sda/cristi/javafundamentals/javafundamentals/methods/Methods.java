package com.sda.cristi.javafundamentals.javafundamentals.methods;

public class Methods {
    public static void main(String[] args) {
        String java = "Java";

        printNumber(12);
        printText(java);

        System.out.println(12);
        beep();

        System.out.println(sum(2, 3));
    }

    public static int sum(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public static void printNumber(int number) {
        int sum = number + 5;
        System.out.println(sum);
    }

    public static void printText(String text) {
        System.out.println(text);
        testMethod(text);
    }

    public static void testMethod(String otherText) {
        System.out.println(otherText);
    }

    private static void beep() {
        System.out.println("Beep");
    }


}


