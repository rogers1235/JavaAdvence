package com.sda.cristi.javafundamentals.javafundamentals.loops;

public class ForExemple {
    public static void main(String[] args) {
//        printAllIntegerNumbersTillGivenNumber(10);
//        printAllIntegerNumbersFromGivenNumberTillZero(10);
//        System.out.println(countBlocks(0));
//        printAllNumbersExceptMultipleBy5(15);
        printNumbersPyramid(5);
    }

    public static void printNumbersPyramid(int maxNumber){
        for (int i = 1; i <= maxNumber; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printAllNumbersExceptMultipleBy5(int limit){
        for (int i = 1; i <= limit; i++){
            if(i%5 == 0){
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printAllIntegerNumbersTillGivenNumber(int limit) {
        for (int i = 0; i <= limit; i++) {
            System.out.println(i);
        }
    }

    public static void printAllIntegerNumbersFromGivenNumberTillZero(int limit) {
        for (int i = limit; i >= 0; i--) {
            System.out.println(i);
        }
    }

    public static int countBlocks(int levels){
        int count = 0;
        for (int i = 1; i <= levels; i++){
            count = count + i*i;
        }
        return count;
    }


}
