package com.yyy;

public class Room {
    private Wall wall;
    private Floor floor;
    private Windows windows;
    private Furniture furniture;

    public Room(Wall wall, Floor floor, Windows windows, Furniture furniture) {
        this.wall = wall;
        this.floor = floor;
        this.windows = windows;
        this.furniture = furniture;
    }

    public Wall getWall() {
        return wall;
    }

    public Floor getFloor() {
        return floor;
    }

    public Windows getWindows() {
        return windows;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public void whatIsFloor() {
        floor.thisIsFloor();
    }

    private void whatIsWall() {
        wall.thisIsWall();
    }
}
