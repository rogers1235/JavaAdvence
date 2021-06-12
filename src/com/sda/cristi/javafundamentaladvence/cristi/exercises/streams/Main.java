package com.sda.cristi.javafundamentaladvence.cristi.exercises.streams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jhon", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        System.out.println("Sort the list");
        names
                .stream()
                .sorted((s1, s2) ->s1.compareToIgnoreCase(s2))
                .forEach((name) -> System.out.println(name));

        System.out.println("Filter by E");
        names
                .stream()
                .filter((name)-> name.startsWith("E"));

        }
    }



