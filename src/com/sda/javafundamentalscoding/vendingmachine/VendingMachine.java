package com.sda.javafundamentalscoding.vendingmachine;

import com.sda.javafundamentalscoding.exercises.ScannerUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VendingMachine {




        private Product[] productList;

        public VendingMachine() {
            this.productList = createProducts();
        }

        public VendingMachine(Product[] productList) {
            this.productList = productList;
        }

        public void printProductStock() {
            for (Product product : productList) {
                System.out.println(product);
            }
        }

        private Product[] createProducts() {
            Product cola = new Product(5, "Cola", 2);
            Product candyBar = new Product(10, "Candy Bar", 3);
            Product water = new Product(3, "Water", 1);

            Product[] products = {cola, candyBar, water};
            return products;
        }

        public void simulateShopping() {
            printProductStock();
            System.out.println("Alege un produs din lista de produse disponibile introducand codul produsului");
            int codeChosenByUser = getValidCodeFromUser();
            Product chosenProduct = findProductByCode(codeChosenByUser);
            if (chosenProduct != null) {
                System.out.println("Pretul produsului ales este: " + chosenProduct.getPrice() + "lei");
                System.out.println("Introdu suma pe care vrei sa o platesti");
                payProduct(chosenProduct);
            }
        }

        private void payProduct(Product product) {
            int pricePayedByUser = ScannerUtils.getNumberFromConsole();
            int rest = giveChange(pricePayedByUser, product.getPrice());
            System.out.println("Aici aveti produsul " + product.getName() + " si restul " + rest);
        }

        private int giveChange(int payedPrice, int productPrice) {
            int rest = 0;
            if (productPrice > payedPrice) {
                int restToBePayed = productPrice - payedPrice;
                System.out.println("Trebuie sa mai platesti: " + restToBePayed + "lei");
                int pricePayedByUser = ScannerUtils.getNumberFromConsole();
                rest = giveChange(pricePayedByUser, restToBePayed);
            } else if (productPrice < payedPrice) {
                rest = payedPrice - productPrice;
            }
            return rest;
        }

        private Product findProductByCode(int code) {
            for (Product product : productList) {
                if (product.getCode() == code) {
                    return product;
                }
            }
            return null;
        }

        private int getValidCodeFromUser() {
            int codeFromUser = ScannerUtils.getNumberFromConsole();
            if (!isCodeValid(codeFromUser)) {
                System.out.println("Codul introdus nu face parte din codurile produselor disponibile. Te rog introdu un cod valid");
                codeFromUser = getValidCodeFromUser();
            }
            return codeFromUser;
        }

        private boolean isCodeValid(int code) {
            Pattern pattern = Pattern.compile("^[1-3]");
            Matcher matcher = pattern.matcher(String.valueOf(code));
            return matcher.matches();
        }

    }


