package com.sda.cristi.javafundamentaladvence.cristi.optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        String name = "criti";
        if (name == null) {
            System.out.println("Name is null");
        }else{
            System.out.println("Name: " + name);

        }
        Optional<String> optionalNameString = Optional.ofNullable(name);
        // verifica daca valoarea lui "name" este null , iar daca este ii returneaza o noua valoare , daca nu returneaza valoarea curenta
        name = optionalNameString.orElse("Cristi");

        System.out.println("New name: " + name);

        System.out.println(optionalNameString.isPresent());
        try{
            name = optionalNameString.orElseThrow();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
