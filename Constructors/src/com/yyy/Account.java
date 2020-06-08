package com.yyy;

public class Account {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerTelephone;

    public Account() {
        this("default account number",0,"default name",
                "default email","default telephone");
        System.out.println("Default constructor called");
    }

    public Account(String accountNumber, double balance, String customerName,
                   String customerEmail, String customerTelephone) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerTelephone = customerTelephone;
    }

    public Account(String customerName, String customerEmail, String customerTelephone) {
        this("99999",100.55,customerName,customerEmail,customerTelephone);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public String getCustomerTelephone() {
        return this.customerTelephone;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerTelephone(String customerTelephone) {
        this.customerTelephone = customerTelephone;
    }

    public void depositFunds(double deposit) {
        this.balance += deposit;
        System.out.println("You have deposited " + deposit + " and new balance is " + balance);
    }

    public void withdrawFunds(double withdrawal) {
        if (withdrawal > this.balance)
            System.out.println("You cannot withdraw " + withdrawal);
        else {
            this.balance -= withdrawal;
            System.out.println("You have withdrawn " + withdrawal + " and new balance is " + balance);
        }
    }
}
