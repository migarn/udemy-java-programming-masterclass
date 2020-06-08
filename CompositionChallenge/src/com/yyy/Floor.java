package com.yyy;

public class Floor {
    private String material;
    private int thickness;
    private String covering;

    public Floor(String material, int thickness, String covering) {
        this.material = material;
        this.thickness = thickness;
        this.covering = covering;
    }

    public String getMaterial() {
        return material;
    }

    public int getThickness() {
        return thickness;
    }

    public String getCovering() {
        return covering;
    }

    public void thisIsFloor() {
        System.out.println("This is a floor");
    }
}
