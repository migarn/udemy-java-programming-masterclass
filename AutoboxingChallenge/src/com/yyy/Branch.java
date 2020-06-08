package com.yyy;

import java.util.ArrayList;

public class Branch {

    private String name;
    public ArrayList<Customer> customersList = new ArrayList<>();

    public Branch(String name) {
        this.name = name;
    }

    public void addCustomer(Customer customer) {
        if (findCustomerPosition(customer) > -1) {
            System.out.println(customer.getName() + " could not be added to the customers list. "
                    + "Customer \"" + customer.getName() + "\" is already on the list.");
            System.out.println("");
        }
        else if (customer.getInitialTransaction() < 0) {
            System.out.println(customer.getName() + " could not be added to the customers list." +
                    " Initial transaction amount cannot be negative.");
            System.out.println("");
        }
        else {
            customersList.add(customer);
            System.out.println(customer.getName() + " has been added to the customers list with" +
                    " initial transaction amount set to " + customer.getInitialTransaction() + " $.");
            System.out.println("");
        }
    }

    public int findCustomerPosition(Customer customer) {
        int position = -1;
        for (int i = 0; i < customersList.size(); i++) {
            if (customer.getName().equals(customersList.get(i).getName())) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void addTransaction(String customerName, Double transactionAmount) {
        if (findCustomerPosition(findCustomer(customerName)) == -1) {
            System.out.println(customerName + " not found on the customers list. Transaction not executed.");
            System.out.println("");
        }
        else {
            customersList.get(findCustomerPosition(findCustomer(customerName))).addTransaction(transactionAmount);
        }
    }

    public void printCustomersList() {
        System.out.println("\nList of the customers of the " + name + " branch:");
        for (int i = 0; i < customersList.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + customersList.get(i).getName());
        }
        System.out.println("");
    }

    public String getName() {
        return name;
    }

    public Customer findCustomer(String name) {
        Customer customer = new Customer("napewnonikttakiegoniezrobi",0);
        for (int i = 0; i < customersList.size(); i++) {
            if (name.equals(customersList.get(i).getName())) {
                customer = customersList.get(i);
                break;
            }
        }
        return customer;
    }

    public void printCustomerBalance(String customerName) {
        if (findCustomerPosition(findCustomer(customerName)) == -1) {
            System.out.println(customerName + " not found on the customers list.");
            System.out.println("");
        }
        else {
            System.out.println(customerName + "'s balance equals "
                    + findCustomer(customerName).calculateBalance() + " $.");
            System.out.println("");
        }
    }

    public void printCustomerTransactionList(String customerName) {
        if (findCustomerPosition(findCustomer(customerName)) == -1) {
            System.out.println(customerName + " not found on the customers list.");
            System.out.println("");
        }
        else {
            customersList.get(findCustomerPosition(findCustomer(customerName))).printCustomerTransactionList();
        }
    }

    public void printBranchTransactionList() {
        System.out.println("\nList of the branche's transactions:");
        int count = 0;
        for (int i = 0; i < customersList.size(); i++) {
            for (int j = 0; j < customersList.get(i).customerTransactions.size(); j++) {
                count++;
                System.out.println("\t" + count + ". Customer " + customersList.get(i).getName() +
                ", transaction " + (j + 1) + " equals " + customersList.get(i).customerTransactions.get(j) + " $.");
            }
        }
    }

    public void printBranchBalance() {
        double branchBalance = 0;
        for (int i = 0; i < customersList.size(); i++) {
            branchBalance += customersList.get(i).calculateBalance();
        }
        System.out.println("\nTotal balance of the branch equals " + branchBalance + " $.");
    }


}
