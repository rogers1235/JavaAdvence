package com.sda.cristi.javafundamentals.javafundamentals.varargs;

public class ExempleVarargs {

    public static void main(String[] args) {

        System.out.println(sum(2, 3, 7, 9));
        System.out.println(sum(5, 8));

        printSomeTextAndAverage("Average of numbers is: ", 2, 6, 8, 7);

        printShortestText("Alex", "Lavinia", "Cristian", "Elena");

        boolean firstCondition = 5 < 3;
        boolean secondCondition = "Lavinia".length() > 7;
        System.out.println(atLeastOneConditionIsTrue(firstCondition, secondCondition));
    }

    public static boolean atLeastOneConditionIsTrue(boolean... conditions) {
        for (boolean condition : conditions) {
            if (condition)
                return true;
        }
        return false;
    }

    public static void printShortestText(String... words) {
        String shortestText = words[0];
        for (String word : words) {
            if (word.length() < shortestText.length()) {
                shortestText = word;
            }
        }
        System.out.println(shortestText);
    }


    public static void printSomeTextAndAverage(String text, int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println(text + average);
    }


    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


}


