package com.yyy;

public class Wall {
    private String material;
    private int thickness;
    private int height;

    public Wall(String material, int thickness, int height) {
        this.material = material;
        this.thickness = thickness;
        this.height = height;
    }

    public String getMaterial() {
        return this.material;
    }

    public int getThickness() {
        return this.thickness;
    }

    public int getHeight() {
        return this.height;
    }

    public void thisIsWall() {
        System.out.println("This is a wall");
    }
}
