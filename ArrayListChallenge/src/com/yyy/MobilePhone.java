package com.yyy;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactsList = new ArrayList<>();


    public void addContact(Contacts contact) {

        if (contactsList.isEmpty()) {
            contactsList.add(contact);
            System.out.println(contact.getName() + " with telephone number " +
                    contact.getPhoneNumber() + " has been added to the contact list.");
        }
        else {
            boolean isOnList = false;
            for (int i = 0; i < contactsList.size(); i++) {
                if (contact.getName().equals(getContactName(i))) {
                    isOnList = true;
                    break;
                }
            }
            if (isOnList)
                System.out.println(contact.getName() + " is already on the contact list.");
            else {
                contactsList.add(contact);
                System.out.println(contact.getName() + " with telephone number " +
                        contact.getPhoneNumber() + " has been added to the contact list.");
            }
        }
    }


    public void modifyContact(String name, Contacts newContact) {
        int position = -1;
        for (int i = 0; i < contactsList.size(); i++) {
            if (name.equals(getContactName(i))) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            boolean isOnList = false;
            for (int i = 0; i < contactsList.size(); i++) {
                if (newContact.getName().equals(getContactName(i))) {
                    isOnList = true;
                    break;
                }
            }
            if (isOnList)
                System.out.println(newContact.getName() + " is already on the contact list.");
            else {
                String oldName = getContactName(position);
                String oldNumber = getContactNumber(position);

                contactsList.set(position, newContact);
                System.out.println(oldName + " with telephone number " + oldNumber + " has been changed to " +
                        getContactName(position) + " with telephone number " + getContactNumber(position) + ".");
            }
        }
        else {
            System.out.println(name + " has not been found on the contact list.");
        }
    }


    public void removeContact(String name) {
        int position = -1;
        for (int i = 0; i < contactsList.size(); i++) {
            if (name.equals(getContactName(i))) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println(getContactName(position) + " with telephone number " + getContactNumber(position) +
                    " has been removed from the contact list.");
            contactsList.remove(position);
        }
        else {
            System.out.println(name + " has not been found on the contact list.");
        }
    }


    public void findByName(String name) {
        int position = -1;
        for (int i = 0; i < contactsList.size(); i++) {
            if (name.equals(getContactName(i))) {
                position = i;
                break;
            }
        }
        if (position != -1) {
            System.out.println(name + " with telephone number " + getContactNumber(position) +
                    " has been found on the contact list.");
        }
        else {
            System.out.println(name + " has not been found on the contact list.");
        }
    }


    public void printList () {
        System.out.println("You have " + contactsList.size() + " contacts on the contact list:");
        for (int i = 0; i < contactsList.size(); i++) {
            System.out.println("\t" + (i+1) + ". " + getContactName(i) + ", " + getContactNumber(i));
        }
    }


    public void findByNumber(String number) {
        boolean found = false;
        for (int i = 0; i < contactsList.size(); i++) {
            if (number.equals(getContactNumber(i))) {
                found = true;
                System.out.println(getContactName(i) + " with telephone number " + getContactNumber(i) +
                        " has been found on the contact list.");
            }
        }
        if (!found)
            System.out.println("Number " + number + " has not been found on the contact list.");
    }


    private String getContactName(int position) {
        return contactsList.get(position).getName();
    }

    private String getContactNumber(int position) {
        return contactsList.get(position).getPhoneNumber();
    }
}
