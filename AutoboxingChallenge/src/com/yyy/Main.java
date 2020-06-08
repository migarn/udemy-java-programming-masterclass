package com.yyy;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Bank bank = new Bank();

    public static void main(String[] args) {
        int choice = 0;
        boolean quit = false;
        printBankOperations();

        while(!quit) {
            choice = scanner.nextInt();

            switch(choice) {
                case 0:
                    printBankOperations();
                    break;
                case 1:
                    System.out.println();
                    bank.printBranchesList();
                    break;
                case 2:
                    System.out.println("Please type the name of the branch, you want to enter:");
                    scanner.nextLine();
                    String enteredBranchName = scanner.nextLine();

                    int branchPosition = bank.findBranchPosition(new Branch(enteredBranchName));

                    if (branchPosition == -1) {
                        System.out.println(enteredBranchName + " not found.");
                        System.out.println("");
                        break;
                    }
                    else {
                        int choiceBranch = 0;
                        boolean quitBranch = false;
                        printBranchOperations();

                        while(!quitBranch) {
                            choiceBranch = scanner.nextInt();

                            switch(choiceBranch) {
                                case 0:
                                    printBranchOperations();
                                    break;
                                case 1:
                                    System.out.println();
                                    bank.branchesList.get(branchPosition).printCustomersList();
                                    break;
                                case 2:
                                    printCustomerTransactionList(branchPosition);
                                    break;
                                case 3:
                                    printCustomerBalance(branchPosition);
                                    break;
                                case 4:
                                    addCustomer(branchPosition);
                                    break;
                                case 5:
                                    addTransaction(branchPosition);
                                    break;
                                case 6:
                                    bank.branchesList.get(branchPosition).printBranchTransactionList();
                                    break;
                                case 7:
                                    bank.branchesList.get(branchPosition).printBranchBalance();
                                    break;
                                case 8:
                                    quitBranch = true;
                                    printBankOperations();
                                    break;
                            }
                        }
                        break;
                    }
                case 3:
                    addBranch();
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    addTransaction();
                    break;
                case 6:
                    printCustomersList();
                    break;
                case 7:
                    printCustomerTransactionList();
                    break;
                case 8:
                    printBranchTransactionList();
                    break;
                case 9:
                    printCustomerBalance();
                    break;
                case 10:
                    printBranchBalance();
                    break;
                case 11:
                    quit = true;
                    break;
            }
        }
    }

    public static void printBankOperations() {
        System.out.println("\nYou are at the bank level." +
                "\n\nPlease type:" +
                "\n\t[0] - to print a list of operations possible to execute from the bank level." +
                "\n\t[1] - to print a list of branches." +
                "\n\t[2] - to enter the specific branch." +
                "\n\t[3] - to add a new branch." +
                "\n\t[4] - to add a new customer to the specific branch." +
                "\n\t[5] - to add a new transaction to the specific customer." +
                "\n\t[6] - to print a list of customers of the specific branch." +
                "\n\t[7] - to print a list of transactions of the specific customer." +
                "\n\t[8] - to print a list of transactions of the specific branch." +
                "\n\t[9] - to print a balance of the specific customer." +
                "\n\t[10] - to print a balance of the specific branch." +
                "\n\t[11] - to quit the application." +
                "\n");
    }

    public static void printBranchOperations() {
        System.out.println("\nYou are at the branch level." +
                "\n\nPlease type:" +
                "\n\t[0] - to print a list of operations possible to execute from the branch level." +
                "\n\t[1] - to print a list of customers." +
                "\n\t[2] - to print a list of transactions of the specific customer." +
                "\n\t[3] - to print a balance of the specific customer." +
                "\n\t[4] - to add a new customer." +
                "\n\t[5] - to add a new transaction to the specific customer." +
                "\n\t[6] - to print a list of transactions of the branch." +
                "\n\t[7] - to print a balance of the branch." +
                "\n\t[8] - to return to the bank level." +
                "\n");
    }

    public static void addBranch() {
        System.out.println("\nPlease type a name of the branch, you want to add:");
        scanner.nextLine();
        String name = scanner.nextLine();
        bank.addBranch(new Branch(name));
    }

    public static void addCustomer() {
        System.out.println("\nPlease type a name of the customer, you want to add:");
        scanner.nextLine();
        String customerName = scanner.nextLine();
        System.out.println("Please type initial transaction amount of the customer:");
        double initialTransaction = scanner.nextDouble();
        System.out.println("Please type a name of the branch, to which customer will be added:");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        bank.addCustomer(new Customer(customerName,initialTransaction),new Branch(branchName));
    }

    public static void addTransaction() {
        System.out.println("\nPlease type name of the branch:");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        System.out.println("Please type name of the customer:");
        String customerName = scanner.nextLine();
        System.out.println("Please type amount of the transaction:");
        Double transactionAmount = scanner.nextDouble();
        bank.addTransaction(new Branch(branchName), customerName, transactionAmount);
    }

    public static void printCustomersList() {
        System.out.println("\nPlease type name of the branch:");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        bank.printCustomersList(new Branch(branchName));
    }

    public static void printCustomerBalance() {
        System.out.println("\nPlease type name of the branch:");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        System.out.println("Please type name of the customer:");
        String customerName = scanner.nextLine();
        bank.printCustomerBalance(new Branch(branchName),customerName);
    }

    public static void printCustomerTransactionList() {
        System.out.println("\nPlease type name of the branch:");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        System.out.println("Please type name of the customer:");
        String customerName = scanner.nextLine();
        bank.printCustomerTransactionList(new Branch(branchName),customerName);
    }

    public static void printBranchTransactionList() {
        System.out.println("\nPlease type name of the branch:");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        bank.printBranchTransactionList(new Branch(branchName));
    }

    public static void printBranchBalance() {
        System.out.println("\nPlease type name of the branch:");
        scanner.nextLine();
        String branchName = scanner.nextLine();
        bank.printBranchBalance(new Branch(branchName));
    }

    public static void printCustomerTransactionList(int branchPosition) {
        System.out.println("\nPlease type name of the customer:");
        scanner.nextLine();
        String customerName = scanner.nextLine();
        bank.branchesList.get(branchPosition).printCustomerTransactionList(customerName);
    }

    public static void addCustomer(int branchPosition) {
        System.out.println("\nPlease type a name of the customer, you want to add:");
        scanner.nextLine();
        String customerName = scanner.nextLine();
        System.out.println("Please type initial transaction amount of the customer:");
        double initialTransaction = scanner.nextDouble();
        bank.branchesList.get(branchPosition).addCustomer(new Customer(customerName,initialTransaction));
    }

    public static void printCustomerBalance(int branchPosition) {
        System.out.println("\nPlease type name of the customer:");
        scanner.nextLine();
        String customerName = scanner.nextLine();
        bank.branchesList.get(branchPosition).printCustomerBalance(customerName);
    }

    public static void addTransaction(int branchPosition) {
        System.out.println("\nPlease type name of the customer:");
        scanner.nextLine();
        String customerName = scanner.nextLine();
        System.out.println("Please type amount of the transaction:");
        Double transactionAmount = scanner.nextDouble();
        bank.branchesList.get(branchPosition).addTransaction(customerName,transactionAmount);
    }
}
