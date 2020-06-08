package com.yyy;

public class Main {

    public static void main(String[] args) {
        //Account account = new Account("1111111",1200.53,"Jerzy Lubicz","małpa@małpa.pl","997");

        //account.setAccountNumber("11111111111");
        //account.setBalance(1200.53);
        //account.setCustomerEmail("małpa@onet.pl");
        //account.setCustomerName("Jerzy Lubicz");
        //account.setCustomerTelephone("997");
        Account account = new Account();
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        System.out.println(account.getCustomerEmail());
        System.out.println(account.getCustomerName());
        System.out.println(account.getCustomerTelephone());
        account.depositFunds(125.13);
        account.withdrawFunds(54.13);
        account.withdrawFunds(2000);

        Account mojeKonto = new Account("Michał", "mail@mail.com", "123456");
        System.out.println(mojeKonto.getAccountNumber() + " name " + mojeKonto.getCustomerName());


        System.out.println("CHALLENGE");

        VipCustomer vip1 = new VipCustomer();
        System.out.println(vip1.getName());
        System.out.println(vip1.getCreditLimit());
        System.out.println(vip1.getEmailAddress());

        VipCustomer vip2 = new VipCustomer("Imię",1000000);
        System.out.println(vip2.getName());
        System.out.println(vip2.getCreditLimit());
        System.out.println(vip2.getEmailAddress());

        VipCustomer vip3 = new VipCustomer("Jerzy",15,"jurek@onet.pl");
        System.out.println(vip3.getName());
        System.out.println(vip3.getCreditLimit());
        System.out.println(vip3.getEmailAddress());




    }
}
