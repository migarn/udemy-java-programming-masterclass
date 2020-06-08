package com.yyy;

public class Student extends Osoba {

    public Student(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis() {
        System.out.println("Jestem studentem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}
