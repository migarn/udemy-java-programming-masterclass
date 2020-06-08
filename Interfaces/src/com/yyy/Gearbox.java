package com.yyy;

public class Gearbox {

    private boolean clutchIsIs;

    public void operateClutch (String inOrOut) {
        this.clutchIsIs = inOrOut.equalsIgnoreCase("in");
    }
}
