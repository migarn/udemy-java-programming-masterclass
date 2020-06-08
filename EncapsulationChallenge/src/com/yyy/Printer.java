package com.yyy;

public class Printer {
    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(double tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            System.out.println("Toner level should be between 0 and 100%.");
            this.tonerLevel = -1;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillUpToner() {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = 100;
            System.out.println("Toner level has been set to 100%.");
        } else {
            System.out.println("Toner level should be between 0 and 100%.");
        }
    }

    public void print() {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.numberOfPagesPrinted += 1;
            this.tonerLevel -= 0.1;
            System.out.println("One page has been printed.");
        } else {
            System.out.println("Toner level should be between 0 and 100%.");
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
