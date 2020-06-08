package com.yyy;

public class Furniture {
    private String name;
    private String material;
    private int quantity;

    public Furniture(String name, String material, int quantity) {
        this.name = name;
        this.material = material;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getQuantity() {
        return quantity;
    }

    public void thisIsFurniture() {
        System.out.println("This is a piece of furniture");
    }
}
