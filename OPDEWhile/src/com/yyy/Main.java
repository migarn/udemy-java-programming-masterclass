package com.yyy;

public class Main {

    public static void main(String[] args) {
	    int[] tablica = new int[10];
        int i = 0;

	    while(i < tablica.length) {
	        tablica[i] = (i + 1) * 10;
            System.out.println(tablica[i]);
	        i++;
        }
    }
}
