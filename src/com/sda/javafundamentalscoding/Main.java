package com.sda.javafundamentalscoding;
import com.sda.javafundamentalscoding.exercises.*;

public class Main {


        public static void main(String[] args) {
            PrintingAndFormatting printObject = new PrintingAndFormatting();
            printObject.printNameAndSurname("Nitu", "Cristian");

            printObject.printLeftJustify("Cristian");

            printObject.printRightJustify("Cristian");

            printObject.printTable();

            printObject.printFormattedNumber(12);

            printObject.printFormattedDecimalNumber(12.42464);

            printObject.division(122, 35);

            printObject.drawWaves(5, 5);

            System.out.println("--------------------------------------");
            Numbers printNumbers = new Numbers();

            printNumbers.testSumForDoubles();
            printNumbers.roundNumberWithDecimalFormat(2.8699);
            printNumbers.roundNumberWithBigDecimal(2.454, 2);
            printNumbers.roundNumberWithMath(2.356, 2);

            System.out.println("--------------------------------------");
            ComplexMathEquations equations = new ComplexMathEquations();
            equations.calculateQuadraticEquation(-49, 135, 6);
        equations.sumOfHarmonicSeries();
       System.out.println("Numarul lui fibonacci este: " +  equations.fibonacciNumber());

            System.out.println("--------------------------------------");

            CalculatorSimulation simulationCalculator = new CalculatorSimulation();
          simulationCalculator.simulateMathOperation();

            System.out.println("--------------------------------------");
            SumOfDigitsFromNumber sumOfDigitsFromNumber = new SumOfDigitsFromNumber();
            System.out.println("Suma cifrelor numarului introdus este: " + sumOfDigitsFromNumber.sumDigits(1254));

            System.out.println("--------------------------------------");
            Exercises exercisesObj = new Exercises();
            int[] arrayOfInts = {1, 3, 8, 4, 2, 5, 3, 11, 13, 7};
            System.out.println("Lungimea celei mai lungi secvente crescatoare din array este " + exercisesObj.getLengthOfLongestSubsequence(arrayOfInts));
       exercisesObj.calculateDaysUntilNextCourse();
            exercisesObj.printDateTime();
        }

    }




