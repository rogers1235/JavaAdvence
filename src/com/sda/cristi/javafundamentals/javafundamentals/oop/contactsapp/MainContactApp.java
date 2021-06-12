package com.sda.cristi.javafundamentals.javafundamentals.oop.contactsapp;

public class MainContactApp {
    public static void main(String[] args) {
        ContactsManager contactsManager = new ContactsManager();

        Contact mihai = new Contact("Mihai Lascu", "0725694991");

        contactsManager.addContact(mihai);

        contactsManager.printContactList();

        Contact contact1 = new Contact("Tartar Lavinia", "0771762625");
        Contact andreea = new Contact("Andreea Dumitru", "0724831608");
        Contact cristian = new Contact("Cristian Dumitru", "072031816");

        contactsManager.addContact(contact1);
        contactsManager.addContact(andreea);
        contactsManager.addContact(cristian);

        contactsManager.printContactList();

        System.out.println("----------------------------------");
        Contact searchedContact = contactsManager.searchContact("Lav");
        if(searchedContact != null){
            System.out.println(searchedContact.getNumber());
        }
        System.out.println(searchedContact);

        System.out.println("----------------------------------");
        contactsManager.deleteContact(contact1);
        System.out.println("----------------------------------");
        contactsManager.printContactList();

        System.out.println("----------------------------------");
        System.out.println(contactsManager.editContact(2, "Marcel", "0742546567"));
        System.out.println("----------------------------------");
        contactsManager.printContactList();

    }

}
