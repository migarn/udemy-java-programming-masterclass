package com.yyy;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger1 = new Hamburger("white roll", "rare meat", true, false, true, true, false, false, true);
        System.out.println("Price of onion is " + hamburger1.getOnionPrice() + " zł.");
        System.out.println("Total price is " + hamburger1.totalPrice() + " zł.");
        hamburger1.totalDescription();
        System.out.println("");
        Hamburger hamburger2 = new Hamburger("brown roll", "well done meat", false, true, false, false, false, false, false);
        hamburger2.totalDescription();
        System.out.println("");
        Hamburger hamburger3 = new Hamburger("big roll", "chicken", true, true, true, true, true, true, false);
        System.out.println("Total price is " + hamburger3.totalPrice() + " zł.");
        hamburger3.totalDescription();
        System.out.println("");
        HealthyBurger healthyBurger1 = new HealthyBurger("chicken",true,true,true,false,false,false,false,true,true);
        System.out.println("Total price is " + healthyBurger1.totalPrice() + " zł.");
        healthyBurger1.totalDescription();
        System.out.println("");
        HealthyBurger healthyBurger2 = new HealthyBurger("pork",true,true,true,true,true,true,true,false,false);
        System.out.println("Total price is " + healthyBurger2.totalPrice() + " zł.");
        healthyBurger2.totalDescription();
        System.out.println("");
        DeluxeHamburger deluxeHamburger1 = new DeluxeHamburger("white roll","bacon",true,true, false);
        System.out.println("Total price is " + deluxeHamburger1.totalPrice() + " zł.");
        deluxeHamburger1.totalDescription();
        System.out.println("");
        DeluxeHamburger deluxeHamburger2 = new DeluxeHamburger("white roll","bacon",true,false, false);
        System.out.println("Total price is " + deluxeHamburger2.totalPrice() + " zł.");
        deluxeHamburger2.totalDescription();
        System.out.println("");
        DeluxeHamburger deluxeHamburger3 = new DeluxeHamburger("brown roll","pork",false,false, true);
        System.out.println("Total price is " + deluxeHamburger3.totalPrice() + " zł.");
        deluxeHamburger3.totalDescription();
        System.out.println("");
        DeluxeHamburger deluxeHamburger4 = new DeluxeHamburger("full-grain roll","beef",false,false, false);
        System.out.println("Total price is " + deluxeHamburger4.totalPrice() + " zł.");
        deluxeHamburger4.totalDescription();
    }
}
