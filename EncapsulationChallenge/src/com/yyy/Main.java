package com.yyy;

public class Main {

    public static void main(String[] args) {
        Printer printer1 = new Printer(105, 5, false);
        System.out.println("Toner level is " + printer1.getTonerLevel() + "%");
        printer1.fillUpToner();
        System.out.println("Toner level is " + printer1.getTonerLevel() + "%");
        System.out.println("Number of printed pages is equal to " + printer1.getNumberOfPagesPrinted());

        for (int i = 1; printer1.getTonerLevel() >= 0; i++) {
            printer1.print();
            System.out.println("Toner level is " + printer1.getTonerLevel() + "%");
            System.out.println("Number of printed pages is equal to " + printer1.getNumberOfPagesPrinted());
        }


    }
}
