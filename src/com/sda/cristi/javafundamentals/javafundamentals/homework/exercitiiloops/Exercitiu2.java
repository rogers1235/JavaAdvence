package com.sda.cristi.javafundamentals.javafundamentals.homework.exercitiiloops;

public class Exercitiu2 {
    public static void main(String[] args) {

    }
    public int indexOfFirstOccurrence(String[] stringArray, String target){
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
}
