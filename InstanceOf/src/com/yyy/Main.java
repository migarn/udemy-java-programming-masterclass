package com.yyy;

public class Main {

    public static void main(String[] args) {
	    Osoba[] osoba = new Osoba[4];
	    osoba[0] = new Pracownik("Arkadiusz", "Włodarczyk",10000);
	    osoba[1] = new Student("Alusia","Matiukusa");

	    osoba[0].pobierzOpis();

	    for (Osoba o : osoba) {
	    	if (o instanceof Osoba)
				o.pobierzOpis();
		}

		((Pracownik)osoba[0]).pracuj();

    }
}
