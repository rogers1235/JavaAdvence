package com.sda.cristi.javafundamentals.javafundamentals.oop.registeroffice;

import java.util.Objects;

public class Residence {


        private String city;
        private String street;
        private int zipCode;

        public Residence(String city, String street, int zipCode) {
            this.city = city;
            this.street = street;
            this.zipCode = zipCode;
        }

        public String getCity(){
            return city;
        }

        public void setCity(String city){
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getZipCode() {
            return zipCode;
        }

        public void setZipCode(int zipCode) {
            this.zipCode = zipCode;
        }

        @Override
        public String toString() {
            return "Residence{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", zipCode=" + zipCode +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Residence residence = (Residence) o;
            return zipCode == residence.zipCode &&
                    Objects.equals(city, residence.city) &&
                    Objects.equals(street, residence.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, street, zipCode);
        }
    }


