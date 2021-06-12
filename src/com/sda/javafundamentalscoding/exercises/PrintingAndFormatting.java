package com.sda.javafundamentalscoding.exercises;

public class PrintingAndFormatting {

    public void printNameAndSurname(String name, String surname){
        System.out.printf("Numele este %s si prenumele este %s\n", name, surname);
    }

    public void printRightJustify(String name){
        System.out.printf("Aliniem numele %15s la dreapta\n", name);
    }

    public void printLeftJustify(String name){
        System.out.printf("Aliniem numele %-15s la stanga\n", name);
    }

    public void printTable() {
        System.out.printf("%s %17s\n", "Exam name", "Exam Grade");
        System.out.println("----------------------------");
        System.out.printf("%-"+ 20 + "s %s\n", "JAVA", "A");
        System.out.printf("%-20s %s\n", "PHP", "B");
        System.out.printf("%-20s %s\n", "VB NEt", "A");
        System.out.println("----------------------------");
    }

    public void printFormattedNumber(int number){
        System.out.printf("Numarul %04d este formatat\n", number);
    }

    public void printFormattedDecimalNumber(double number){
        System.out.printf("Numarul %9.3f este formatat\n", number);
    }

    public void division(int firstValue, int secondValue){
        double result = (double) firstValue / secondValue;
        System.out.printf("Numarul formatat cu 3 zecimale este: %.3f\n", result);
    }

    public void drawWaves(int lines, int numberOfWaves){
        for (int i = 1; i <= lines; i++){
            for (int j = 1; j <= numberOfWaves; j++){
                int between = (lines * 2) - (i * 2);
                String star = "*";
                String space = "";
                String line = "%" + i + "s%" + between + "s" + "%-" + i + "s";
                if (between == 0){
                    line = "%" + i + "s%s%-" + i + "s";
                }
                System.out.printf(line, star, space, star);
            }
            System.out.println();
        }
    }

}



