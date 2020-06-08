package com.yyy;

public class Windows {
    private int quantity;
    private String material;
    private int height;

    public Windows(int quantity, String material, int height) {
        this.quantity = quantity;
        this.material = material;
        this.height = height;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getMaterial() {
        return material;
    }

    public int getHeight() {
        return height;
    }

    public void thisIsWindow() {
        System.out.println("This is a window");
    }
}
