package com.sda.cristi.javafundamentals.javafundamentals.oop.registeroffice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Platform {


        private Person[] personList;
        private int freePosition;

        public Platform() {
            personList = new Person[5];
            freePosition = 0;
        }

        public void addPerson(Person person) {
            if (freePosition < personList.length) {
                personList[freePosition] = person;
                freePosition++;
            } else {
                System.out.println("Nu mai este loc");
            }
        }

        public void printPlatformBody() {
            for (Person person : personList) {
                System.out.println(person);
            }
        }

        public int countPersonsFromCity(String cityName) {
            int count = 0;
            for (Person element : personList) {
                if (element.getAddress().getCity().equals(cityName)) {
                    count++;
                }
            }
            return count;
        }

        public int countPersonsOver18() {
            int count = 0;
            for (Person element : personList) {
                if (element.getAge() >= 18) {
                    count++;
                }
            }
            return count;
        }

        public int countPersonsOverAge(int age) {
            int count = 0;
            for (Person element : personList) {
                if (element.getAge() >= age) {
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            Person alina = new Person("1515564131315", "Alina", "feminin");
            Residence alinaResidence = new Residence("Oradea", "str Triumfului", 45505);
            alina.setAddress(alinaResidence);
            alina.setAge(18);

            Person mihai = new Person("1515564131315", "Mihai", "masculin");
            Residence mihaiResidence = new Residence("Oradea", "str Triumfului", 45505);
            mihai.setAddress(mihaiResidence);
            mihai.setAge(25);

            Person alin = new Person("1515564131315", "Alin", "masculin");
            Residence alinResidence = new Residence("Cluj", "str Triumfului", 45505);
            alin.setAddress(alinResidence);
            alin.setAge(15);

            Person teo = new Person("1515564131315", "Teo", "masculin");
            Residence teoResidence = new Residence("Braila", "str Triumfului", 45505);
            teo.setAddress(teoResidence);
            teo.setAge(30);

            Person cristi = new Person("1515564131315", "Cristi", "masculin");
            Residence cristiResidence = new Residence("Bucuresti", "str Triumfului", 45505);
            cristi.setAddress(cristiResidence);
            cristi.setAge(20);

            Platform platform = new Platform();

            platform.addPerson(alina);
            platform.addPerson(mihai);
            platform.addPerson(teo);
            platform.addPerson(alin);
            platform.addPerson(cristi);
            platform.printPlatformBody();

            System.out.println("The numbers of persons from the city Oradea are: " + platform.countPersonsFromCity("Oradea"));
            System.out.println(platform.countPersonsOver18());

            System.out.println("Introdu varsta pentru a face verificarea:");
            Scanner scan = new Scanner(System.in);

            try {
                int age = scan.nextInt();
                System.out.println(platform.countPersonsOverAge(age));
            }catch (InputMismatchException exception){
                System.out.println("Varsta introdusa nu este valida");
            }




        }


    }


