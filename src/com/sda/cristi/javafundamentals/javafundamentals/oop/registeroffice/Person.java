package com.sda.cristi.javafundamentals.javafundamentals.oop.registeroffice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {


        private String cnp;
        private String name;
        private Residence address;
        private int age;
        private String gender;

        public Person(String cnp, String name, String gender) {
            if (isCnpValid(cnp)) {
                this.cnp = cnp;
            }else {
                System.out.println("Cnp is not valid");
            }
            this.name = name;
            this.gender = gender;
        }

        private boolean isCnpValid(String cnp){
            Pattern pattern = Pattern.compile("[0-9]{13}$");
            Matcher matcher = pattern.matcher(cnp);
            return matcher.matches();
        }

        public String getCnp() {
            return cnp;
        }

        public String getName() {
            return name;
        }

        public Residence getAddress() {
            return address;
        }

        public int getAge() {
            return age;
        }

        public String getGender() {
            return gender;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(Residence address) {
            this.address = address;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "cnp='" + cnp + '\'' +
                    ", name='" + name + '\'' +
                    ", address=" + address +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }




