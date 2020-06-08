package com.yyy;

public class HealthyBurger extends Hamburger {
    private boolean cucumber;
    private boolean grains;
    private double cucumberPrice;
    private double grainsPrice;
    private double price;

    public HealthyBurger(String meatType, boolean lettuce, boolean tomato, boolean onion, boolean mayonnaise, boolean ketchup, boolean mustard, boolean cheese, boolean cucumber, boolean grains) {
        super("brown rye bread roll", meatType, lettuce, tomato, onion, mayonnaise, ketchup, mustard, cheese);
        this.cucumber = cucumber;
        this.grains = grains;
        this.price = 9;
        this.cucumberPrice = 0.65;
        this.grainsPrice = 0.4;
    }

    public double getCucumberPrice() {
        return cucumberPrice;
    }

    public double getGrainsPrice() {
        return grainsPrice;
    }

    @Override
    public double totalPrice() {
        double total = price;
        int extraQuantity = 0;
        if (super.isLettuce()) {
            total += super.getLettucePrice();
            extraQuantity += 1;
        }
        if (super.isTomato()) {
            total += super.getTomatoPrice();
            extraQuantity += 1;
        }
        if (super.isOnion()) {
            total += super.getOnionPrice();
            extraQuantity += 1;
        }
        if (super.isMayonnaise()) {
            total += super.getMayonnaisePrice();
            extraQuantity += 1;
        }
        if (super.isKetchup()) {
            total += super.getKetchupPrice();
            extraQuantity += 1;
        }
        if (super.isMustard()) {
            total += super.getMustardPrice();
            extraQuantity += 1;
        }
        if (super.isCheese()) {
            total += super.getCheesePrice();
            extraQuantity += 1;
        }
        if (cucumber) {
            total += cucumberPrice;
            extraQuantity += 1;
        }
        if (grains) {
            total += grainsPrice;
            extraQuantity += 1;
        }
        if (extraQuantity > 6)
            return -1;
        else
            return (double) Math.round(total * 100) / 100;
    }

    @Override
    public void totalDescription() {
        if (totalPrice() == -1)
            System.out.println("You can choose up to 6 additions.");
        else {
            System.out.print("The chosen healthy hamburger consists of: \n- "
                    + super.getRollType() + ", \n- " + super.getMeatType() + ", which price is " + price + " zł");
            if (super.isLettuce())
                System.out.print(",\n- lettuce, with the extra price of " + getLettucePrice() + " zł");
            if (super.isTomato())
                System.out.print(",\n- tomato, with the extra price of " + getTomatoPrice() + " zł");
            if (super.isOnion())
                System.out.print(",\n- onion, with the extra price of " + getOnionPrice() + " zł");
            if (super.isMayonnaise())
                System.out.print(",\n- mayonnaise, with the extra price of " + getMayonnaisePrice() + " zł");
            if (super.isKetchup())
                System.out.print(",\n- ketchup, with the extra price of " + getKetchupPrice() + " zł");
            if (super.isMustard())
                System.out.print(",\n- mustard, with the extra price of " + getMustardPrice() + " zł");
            if (super.isCheese())
                System.out.print(",\n- cheese, with the extra price of " + getCheesePrice() + " zł");
            if (cucumber)
                System.out.print(",\n- cucumber, with the extra price of " + getCucumberPrice() + " zł");
            if (grains)
                System.out.print(",\n- grains, with the extra price of " + getGrainsPrice() + " zł");
            System.out.println(".\nPrice of chosen healthy hamburger is " + totalPrice() + " zł.");
        }
    }
}
