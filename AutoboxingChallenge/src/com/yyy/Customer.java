package com.yyy;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double initialTransaction;

    public ArrayList<Double> customerTransactions = new ArrayList<>();

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.initialTransaction = initialTransaction;
    }

    public void addTransaction(Double transactionAmount) {
        if (calculateBalance() + transactionAmount < 0) {
            System.out.println("Amount of transaction exceeds customer's balance. Transaction not executed.");
            System.out.println("");
        }
        else {
            customerTransactions.add(transactionAmount);
            System.out.println("Transaction with amount of " + transactionAmount + " $ has been executed.");
            System.out.println("");
        }

    }

    public double calculateBalance() {
        double balance = initialTransaction;
        for (int i = 0; i < customerTransactions.size(); i++) {
            balance += customerTransactions.get(i);
        }
        return balance;
    }

    public String getName() {
        return name;
    }

    public double getInitialTransaction() {
        return initialTransaction;
    }

    public void printCustomerTransactionList() {
        System.out.println("\nList of the " + name + "'s transaction:");
        for (int i = 0; i < customerTransactions.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + customerTransactions.get(i) + " $.");
        }
        System.out.println("");
    }


}
