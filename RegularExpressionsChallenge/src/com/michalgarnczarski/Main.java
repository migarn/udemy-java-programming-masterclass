package com.michalgarnczarski;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        System.out.println(challenge1.matches("I want a bike."));

        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("I want a b.{3}."));
        System.out.println(challenge2.matches("I want a b.{3}."));
        String challenge2not = "I want a banana.";
        System.out.println(challenge2not.matches("I want a b.{3}."));

        System.out.println(challenge1.matches("I want a \\w+."));
        System.out.println(challenge2.matches("I want a \\w+."));

        System.out.println(challenge1.matches("I want a (bike|ball)."));
        System.out.println(challenge2.matches("I want a (bike|ball)."));

        String regExp3 = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp3);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ","_"));
        System.out.println(challenge4.replaceAll("\\s","_"));

        String challenge5 = "aaabccccccccdddefffg";
        String regExp5 = "a{3}bc{8}d{3}ef{3}g";
        System.out.println(challenge5.matches(regExp5));

        regExp5 = "[abcdefg]+";
        System.out.println(challenge5.matches(regExp5));

        regExp5 = "[a-g]+";
        System.out.println(challenge5.matches(regExp5));

        String regExp6 = "^a{3}bc{8}d{3}ef{3}g$";
        System.out.println(challenge5.matches(regExp6));
        System.out.println(challenge5.replaceAll(regExp6,"REPLACED"));

        String challenge7 = "abcd.135";
        String regExp7 = "^[a-zA-Z]+\\.[0-9]+$";
        System.out.println(challenge7.matches(regExp7));
        System.out.println("kjisl.22".matches(regExp7));
        System.out.println("f5.12a".matches(regExp7));

    }
}
