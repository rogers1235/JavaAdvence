package com.sda.cristi.javafundamentals.javafundamentals.oop.contactsapp;

public class ContactsManager {

    private Contact[] contacts;
    private int freePosition;

    public ContactsManager() {
        contacts = new Contact[3];
        freePosition = 0;
    }

    public void addContact(Contact contact) {
        if (freePosition < contacts.length) {
            contacts[freePosition] = contact;
            freePosition++;
        } else {
            System.out.println("The contacts list is full. Please delete an old contact to make space");
        }
    }

    public void deleteContact(Contact contact){
        for (int i = 0; i < contacts.length; i++){
            if(contacts[i].equals(contact)){
                contacts[i] = null;
                break;
            }
        }
        printContactList();
    }

    public Contact searchContact(String partOfContactName){
        for (Contact contact: contacts) {
            if (contact.getName().contains(partOfContactName)){
                return contact;
            }
        }
        return null;
    }

    public void printContactList(){
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact editContact(int position, String contactName, String phoneNumber){
        Contact editedContact = contacts[position];
        editedContact.setName(contactName);
        editedContact.setNumber( phoneNumber);
        return editedContact;
    }


}
