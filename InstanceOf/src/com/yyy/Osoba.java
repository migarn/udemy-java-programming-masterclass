package com.yyy;

public abstract class Osoba {
    String imie;
    String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    abstract void pobierzOpis();

    //void pracuj() {

    //}
}
