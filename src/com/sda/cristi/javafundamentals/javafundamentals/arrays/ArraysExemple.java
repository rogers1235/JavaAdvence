package com.sda.cristi.javafundamentals.javafundamentals.arrays;

public class ArraysExemple {

    public static void main(String[] args) {

        String[] arrayOfStrings = new String[3];
        arrayOfStrings[0] = "Lavinia";
        arrayOfStrings[1] = "Teo";
        arrayOfStrings[2] = "Andrei";

        String[] arrayOfNames = {"Cristi", "Elena", "Alina"};

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.println(arrayOfStrings[i]);
        }

        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        for (String element : arrayOfStrings) {
            System.out.println(element);
        }

        System.out.println("-------------------");
        System.out.println(arrayOfStrings[2]);

        int[] arrayOfInt = {6, -8, 10, 15};
        System.out.println(sumOfElements(arrayOfInt));
        System.out.println(maxNumberFromArray(arrayOfInt));
        System.out.println("-------------------");
        printInReverse(arrayOfNames);
        System.out.println("-------------------");
        playWith2DArray();
        System.out.println("-------------------");
        int [][] otherGrades = { {97, 85, 67}, {54, 75} };
        System.out.println(returnMaxValueFrom2DArray(otherGrades));
        System.out.println("-------------------");
        String [][] names = { {"Alin", "Paul", "Cristian"}, {"Alin", "Alin"} };
        System.out.println(returnTheLongestTextFrom2DArray(names));
        System.out.println(howManyDuplicates(names));
    }

    public static int sumOfElements(int[] arrayOfInt) {
        int sum = 0;
        for (int element : arrayOfInt) {
            sum = sum + element;
        }
        return sum;
    }

    public static int maxNumberFromArray(int[] arrayOfInt) {
        int max = 0;
        for (int element : arrayOfInt) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static void printInReverse(String[] arrayOfStrings) {
        for (int i = arrayOfStrings.length - 1; i >= 0; i--) {
            System.out.println(arrayOfStrings[i]);
        }
    }

    public static void playWith2DArray(){
        int [][] grades = new int[2][3];
        grades[0][0] = 97;
        grades[0][1] = 85;
        grades[0][2] = 97;
        grades[1][0] = 54;
        grades[1][1] = 75;
        grades[1][2] = 68;

        for (int i = 0; i < grades.length; i++){
            for (int j = 0; j < grades[i].length; j++){
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");
        int [][] otherGrades = { {97, 85, 67}, {54, 75} };

        for (int i = 0; i < otherGrades.length; i++){
            for (int j = 0; j < otherGrades[i].length; j++){
                System.out.print(otherGrades[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int returnMaxValueFrom2DArray(int [][] intArray){
        int maxValue = intArray[0][0];
        for (int i = 0; i < intArray.length; i++){
            for (int j = 0; j < intArray[i].length; j++){
                if(maxValue < intArray[i][j]){
                    maxValue = intArray[i][j];
                }
            }
        }
        return maxValue;
    }

    public static String returnTheLongestTextFrom2DArray(String [][] stringArray){
        String longestValue = stringArray[0][0];
        for (int i = 0; i < stringArray.length; i++){
            for (int j = 0; j < stringArray[i].length; j++){
                if(longestValue.length() < stringArray[i][j].length()){
                    longestValue = stringArray[i][j];
                }
            }
        }
        return longestValue;
    }

    public static int howManyDuplicates(String [][] stringArray){
        int count = 0;

        for (int i = 0; i < stringArray.length; i++){
            for (int j = 0; j < stringArray[i].length; j++){
                if(isDuplicate(stringArray, stringArray[i][j])){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isDuplicate(String [][] stringArray, String element){
        int count = 0;
        for (int i = 0; i < stringArray.length; i++){
            for (int j = 0; j < stringArray[i].length; j++){
                if(element.equals(stringArray[i][j]))
                    count++;
            }
        }
        return count > 1;
    }

}
