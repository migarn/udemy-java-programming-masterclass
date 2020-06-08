package com.yyy;

public class DeluxeHamburger extends Hamburger {
    private boolean chips;
    private boolean cola;
    private boolean tea;
    private boolean beer;
    private double price;

    public DeluxeHamburger(String rollType, String meatType, boolean cola, boolean tea, boolean beer) {
        super(rollType, meatType, false, false, false, false, false,
                false, false);
        this.chips = true;
        this.cola = cola;
        this.tea = tea;
        this.beer = beer;
        this.price = 20;
    }

    @Override
    public double totalPrice() {
        int drinksQuantity = 0;
        if (cola)
            drinksQuantity += 1;
        if (tea)
            drinksQuantity += 1;
        if (beer)
            drinksQuantity += 1;
        if (drinksQuantity > 1)
            return -1;
        else
            return price;
    }

    @Override
    public void totalDescription() {
        if (totalPrice() == -1)
            System.out.println("You can choose only 1 drink.");
        else {
            System.out.print("The chosen deluxe hamburger consists of: \n- "
                    + super.getRollType() + ", \n- " + super.getMeatType()
                    + ", \n- chips");
            if (cola)
                System.out.print(",\n- cola");
            if (tea)
                System.out.print(",\n- tea");
            if (beer)
                System.out.print(",\n- beer");
            System.out.println(".\nPrice of chosen healthy hamburger is " + totalPrice() + " zł.");
        }
    }
}
