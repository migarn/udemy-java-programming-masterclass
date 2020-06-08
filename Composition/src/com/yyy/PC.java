package com.yyy;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }

//    private Case getTheCase() {
//        return this.theCase;
//    }
//
//    private Monitor getMonitor() {
//        return this.monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return this.motherboard;
//    }

}
