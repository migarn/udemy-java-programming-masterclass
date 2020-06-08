package com.yyy;

public class Main {

    public static void main(String[] args) {
        Furniture furniture = new Furniture("szafa", "drewno", 2);

        Room room = new Room(new Wall("cegłą", 50, 2500),
                new Floor("żelbet", 30, "panele"),
                new Windows(2, "aluminium", 1500), furniture);

        room.whatIsFloor();
        System.out.println(room.getFloor().getMaterial());
        System.out.println(room.getFurniture().getName());
    }
}
