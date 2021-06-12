package com.sda.javaadvenceexercises.ex6;

import java.util.Map;
import java.util.TreeMap;

/**
 * Create a method that accepts
 * TreeMap
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("Moto", "Honda");
        treeMap.put("Auto", "Audi");
        treeMap.put("Race", "BMW");

       printTreeMapp(treeMap);
    }
    public  static void printTreeMapp(TreeMap<String,String>treeMap){
        Map.Entry<String,String>firstEntry  =  treeMap.firstEntry();
        System.out.println(firstEntry.getKey()  + "  -  " + firstEntry.getValue());

        Map.Entry<String,String > lasEntry = treeMap.lastEntry();
        System.out.println(lasEntry.getKey()  + " - " + lasEntry.getKey());
    }

}
