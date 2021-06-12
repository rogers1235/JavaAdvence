package com.sda.javaadvenceexercises.ex4;

import java.util.*;

public class Storage {

    private HashMap<String, List<String>> storageHasMap;


    public Storage() {
        this.storageHasMap = new HashMap<>();

    }

    public void addToStorage(String key, String value) {
        List<String> valuesList;
        if (this.storageHasMap.containsKey(key)) {
            valuesList = this.storageHasMap.get(key);
            valuesList.add(value);


        } else {
            valuesList = new LinkedList<>();
            valuesList.add(value);

        }
        this.storageHasMap.put(key, valuesList);
    }

    public void printValue(String key) {
        System.out.println(this.storageHasMap.get(key));
    }

    public void findValues(String value) {
        for (Map.Entry<String, List<String>> entry : this.storageHasMap.entrySet()) {
            for (String item : entry.getValue()) {
                if (item.equals(value)) {
                    System.out.println(entry.getKey());
                }
            }

        }
    }

    public void printStorage() {
        for (Map.Entry<String, List<String>> entry : this.storageHasMap.entrySet()) {
            System.out.println(entry.getKey());
            for (String item : entry.getValue()) {

                    System.out.println("-" + item);
                }

            }
        }
    }

