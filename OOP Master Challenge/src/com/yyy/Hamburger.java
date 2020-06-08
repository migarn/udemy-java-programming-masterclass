package com.yyy;

public class Hamburger {
    private String rollType;
    private String meatType;
    private boolean lettuce;
    private boolean tomato;
    private boolean onion;
    private boolean mayonnaise;
    private boolean ketchup;
    private boolean mustard;
    private boolean cheese;
    private double price;
    private double lettucePrice;
    private double tomatoPrice;
    private double onionPrice;
    private double mayonnaisePrice;
    private double ketchupPrice;
    private double mustardPrice;
    private double cheesePrice;

    public Hamburger(String rollType, String meatType, boolean lettuce, boolean tomato, boolean onion, boolean mayonnaise, boolean ketchup, boolean mustard, boolean cheese) {
        this.rollType = rollType;
        this.meatType = meatType;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.onion = onion;
        this.mayonnaise = mayonnaise;
        this.ketchup = ketchup;
        this.mustard = mustard;
        this.cheese = cheese;
        this.price = 8;
        this.lettucePrice = 1.5;
        this.tomatoPrice = 0.8;
        this.onionPrice = 1.2;
        this.mayonnaisePrice = 1.6;
        this.ketchupPrice = 0.7;
        this.mustardPrice = 0.9;
        this.cheesePrice = 2.2;
    }

    public double getPrice() {
        return price;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getOnionPrice() {
        return onionPrice;
    }

    public double getMayonnaisePrice() {
        return mayonnaisePrice;
    }

    public double getKetchupPrice() {
        return ketchupPrice;
    }

    public double getMustardPrice() {
        return mustardPrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }

    public boolean isOnion() {
        return onion;
    }

    public boolean isMayonnaise() {
        return mayonnaise;
    }

    public boolean isKetchup() {
        return ketchup;
    }

    public boolean isMustard() {
        return mustard;
    }

    public boolean isCheese() {
        return cheese;
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double totalPrice() {
        double total = price;
        int extraQuantity = 0;
        if (lettuce) {
            total += lettucePrice;
            extraQuantity += 1;
        }
        if (tomato) {
            total += tomatoPrice;
            extraQuantity += 1;
        }
        if (onion) {
            total += onionPrice;
            extraQuantity += 1;
        }
        if (mayonnaise) {
            total += mayonnaisePrice;
            extraQuantity += 1;
        }
        if (ketchup) {
            total += ketchupPrice;
            extraQuantity += 1;
        }
        if (mustard) {
            total += mustardPrice;
            extraQuantity += 1;
        }
        if (cheese) {
            total += cheesePrice;
            extraQuantity += 1;
        }
        if (extraQuantity > 4)
            return -1;
        else
            return (double) Math.round(total * 100) / 100;
    }

    public void totalDescription() {
        if (totalPrice() == -1)
            System.out.println("You can choose up to 4 additions.");
        else {
            System.out.print("The chosen hamburger consists of: \n- "
                    + rollType + ", \n- " + meatType + ", which price is " + price + " zł");
            if (lettuce)
                System.out.print(",\n- lettuce, with the extra price of " + lettucePrice + " zł");
            if (tomato)
                System.out.print(",\n- tomato, with the extra price of " + tomatoPrice + " zł");
            if (onion)
                System.out.print(",\n- onion, with the extra price of " + onionPrice + " zł");
            if (mayonnaise)
                System.out.print(",\n- mayonnaise, with the extra price of " + mayonnaisePrice + " zł");
            if (ketchup)
                System.out.print(",\n- ketchup, with the extra price of " + ketchupPrice + " zł");
            if (mustard)
                System.out.print(",\n- mustard, with the extra price of " + mustardPrice + " zł");
            if (cheese)
                System.out.print(",\n- cheese, with the extra price of " + cheesePrice + " zł");
            System.out.println(".\nPrice of chosen hamburger is " + totalPrice() + " zł.");
        }
    }
}
