package com.yyy;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }
    public static boolean hasSharedDigit (int p1, int p2) {
       if (p1 < 10 || p1 > 99 || p2 < 10 || p2 > 99) {return false;}
       int last1 = p1 % 10;
       int first1 = (p1 / 10) % 10;
       int last2 = p2 % 10;
       int first2 = (p2 / 10) % 10;
       return (last1 == last2 || last1 == first2 || first1 == last2 || first1 == first2);
    }
}
