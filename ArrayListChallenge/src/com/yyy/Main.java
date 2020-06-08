package com.yyy;

import java.util.Scanner;

public class Main {

    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("\nType your choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    findByName();
                    break;
                case 4:
                    findByNumber();
                    break;
                case 5:
                    modifyContact();
                    break;
                case 6:
                    removeContact();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void addContact() {
        System.out.println("Please enter the name of the contact, you want to add:");
        String name = scanner.nextLine();
        System.out.println("Please enter " + name + "'s telephone number:");
        String number = scanner.nextLine();
        mobilePhone.addContact(new Contacts(name,number));
    }

    public static void modifyContact() {
        System.out.println("Please enter the name of the contact, you want to modify:");
        String oldName = scanner.nextLine();
        System.out.println("Please enter new name of the contact:");
        String newName = scanner.nextLine();
        System.out.println("Please enter " + newName + "'s telephone number:");
        String newNumber = scanner.nextLine();
        mobilePhone.modifyContact(oldName,new Contacts(newName,newNumber));
    }

    public static void removeContact() {
        System.out.println("Please enter the name of the contact, you want to remove:");
        String name = scanner.nextLine();
        mobilePhone.removeContact(name);
    }

    public static void findByName() {
        System.out.println("Please enter the name of the contact, you want to find:");
        String name = scanner.nextLine();
        mobilePhone.findByName(name);
    }

    public static void findByNumber() {
        System.out.println("Please enter the number of the contact, you want to find:");
        String number = scanner.nextLine();
        mobilePhone.findByNumber(number);
    }

    public static void printInstructions() {
        System.out.println("\nType:");
        System.out.println("\t0 - to print choice options.");
        System.out.println("\t1 - to print the contact list.");
        System.out.println("\t2 - to add a contact to the contact list.");
        System.out.println("\t3 - to find a contact on the contact list by name.");
        System.out.println("\t4 - to find a contact on the contact list by telephone number.");
        System.out.println("\t5 - to modify a contact.");
        System.out.println("\t6 - to remove a contact.");
        System.out.println("\t7 - to quit the program.");
    }
}
