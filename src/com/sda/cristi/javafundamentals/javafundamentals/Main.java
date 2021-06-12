package com.sda.cristi.javafundamentals.javafundamentals;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        byte maxShortNUmber = Byte.MAX_VALUE;
        int number = maxShortNUmber + 1;
        byte anotherByte = (byte) number;
        System.out.println(number);
        System.out.println(anotherByte);
    }

    public static void playWithWeather() {
        boolean isRaining = false;
        int temperature = 21;

        if (isRaining) {
            System.out.println("Stam in casa");
        } else if (temperature > 20) {
            System.out.println("Mergem la plimbare");
        } else {
            System.out.println("Mergem la plimbare cu geaca");
        }
        System.out.println("-------------------------");
        boolean passport = false;
        boolean birthCertificate = true;

        if (passport) {
            System.out.println("passport true");
        } else {
            System.out.println("inside else");
            if (birthCertificate) {
                System.out.println("birth certificate true");
            } else {
                if (temperature >= 20) {
                    System.out.println("last if");
                }
            }
        }
        System.out.println("-------------------------");
        System.out.println("next line after if statement");
    }

    public static void playWithStrings() {

        String firstText = "First text\nSecond\tThird";

        System.out.println(firstText.indexOf("text"));

        System.out.println(firstText.toUpperCase());

        System.out.println(firstText.toLowerCase());

        System.out.println(firstText.substring(6));

        System.out.println(firstText.contains("st"));

        System.out.println(firstText);

        System.out.println(firstText.replace("text", "name"));

        String formattedString = "First value is %s, second value is %s";
        System.out.println("First value is " + 5 + ", second value is " + 6);
        System.out.println(String.format(formattedString, 5, 6));

        float floatNumber = 5.256F;
        System.out.println(String.format("%.2f", floatNumber));

        double firstNumber = 0.999999;
        double secondNumber = 0.01;
        BigDecimal firstDecimal = new BigDecimal(0.999999);
        BigDecimal secondDecimal = new BigDecimal(0.01);
        System.out.println(firstNumber + secondNumber);
        System.out.println(firstDecimal.add(secondDecimal));
    }


    private static void playWithPrimitiveDataTypes() {
        System.out.println("Hello world");
        System.out.print("Hello world");
        System.out.println();
        System.out.println(2 + 3);

        int passengers;
        passengers = 0;
        passengers = passengers + 5;
        passengers = passengers - 3;
        passengers = passengers - 1 + 5;

        System.out.println("Valoarea variabilei passengers este: " + passengers);

        boolean isRaining = true;
        System.out.println(isRaining);

        byte smallNumber = 127;
        byte otherSmallNumber = 127;
        short sumOfByeNumbers = (short) ((short) smallNumber + (short) otherSmallNumber);

        int maxValueOfAnInt = Integer.MAX_VALUE;
        long anotherMaxValueOfAnInt = Integer.MAX_VALUE;

        System.out.println(maxValueOfAnInt + anotherMaxValueOfAnInt);

        System.out.println((int) smallNumber + (byte) 1);

        char character = 'a';
        System.out.println(character);

        String text = "Azi suntem la curs";
        System.out.println(text);

        // wrapper classes for primitive types
        Integer number = 25;
        Byte byteNumber = 127;
        Short shortNumber = 45;
        Long longNumber = 23L;
        Float floatNumber = 12.5F;
        Double doubleNumber = 15.54;
        Character character1 = 's';
        Boolean booleanValue = true;

        System.out.println(number);
    }

}
