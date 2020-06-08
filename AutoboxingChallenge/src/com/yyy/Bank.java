package com.yyy;

import java.util.ArrayList;

public class Bank {

    public ArrayList<Branch> branchesList = new ArrayList<>();

    public void addBranch(Branch branch) {
        if (findBranchPosition(branch) > -1) {
            System.out.println(branch.getName() + " could not be added to the branches list. "
                    + "Branch \"" + branch.getName() + "\" is already on the list.");
            System.out.println("");
        }
        else {
            branchesList.add(branch);
            System.out.println(branch.getName() + " has been added to the branches list.");
            System.out.println("");
        }
    }

    public int findBranchPosition(Branch branch) {
        int position = -1;
        for (int i = 0; i < branchesList.size(); i++) {
            if (branch.getName().equals(branchesList.get(i).getName())) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void printBranchesList() {
        System.out.println("List of the bank's branches:");
        for (int i = 0; i < branchesList.size(); i++) {
            System.out.println("\t" + (i + 1) + ". " + branchesList.get(i).getName());
        }
        System.out.println("");
    }

    public void addCustomer(Customer customer, Branch branch) {
        if (findBranchPosition(branch) == -1) {
            System.out.println(customer.getName() + " could not be added to the customers list. "
                    + "There is no branch " + branch.getName() + " on the branches list.");
            System.out.println("");
        }
        else {
            branchesList.get(findBranchPosition(branch)).addCustomer(customer);
        }
    }

    public void addTransaction(Branch branch, String customerName, Double transactionAmount) {
        if (findBranchPosition(branch) == -1) {
            System.out.println(branch.getName() + " not found on the branches list. Transaction not executed.");
            System.out.println("");
        }
        else {
            branchesList.get(findBranchPosition(branch)).addTransaction(customerName, transactionAmount);
        }
    }

    public void printCustomersList(Branch branch) {
        if (findBranchPosition(branch) == -1) {
            System.out.println(branch.getName() + " not found on the branches list. Transaction not executed.");
            System.out.println("");
        }
        else branchesList.get(findBranchPosition(branch)).printCustomersList();
    }

    public void printCustomerBalance(Branch branch, String customerName) {
        if (findBranchPosition(branch) == -1) {
            System.out.println(branch.getName() + " not found on the branches list.");
            System.out.println("");
        }
        else branchesList.get(findBranchPosition(branch)).printCustomerBalance(customerName);
    }

    public void printCustomerTransactionList(Branch branch, String customerName) {
        if (findBranchPosition(branch) == -1) {
            System.out.println(branch.getName() + " not found on the branches list.");
            System.out.println("");
        }
        else branchesList.get(findBranchPosition(branch)).printCustomerTransactionList(customerName);
    }

    public void printBranchTransactionList(Branch branch) {
        if (findBranchPosition(branch) == -1) {
            System.out.println(branch.getName() + " not found on the branches list.");
            System.out.println("");
        }
        else branchesList.get(findBranchPosition(branch)).printBranchTransactionList();
    }

    public void printBranchBalance(Branch branch) {
        if (findBranchPosition(branch) == -1) {
            System.out.println(branch.getName() + " not found on the branches list.");
            System.out.println("");
        }
        else branchesList.get(findBranchPosition(branch)).printBranchBalance();
    }

}
