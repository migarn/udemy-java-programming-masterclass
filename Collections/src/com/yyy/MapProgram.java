package com.yyy;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java is already exists");
        } else {
            languages.put("Java","a compiled high-level, object-orientated, platform independent language");
            System.out.println("Java added succesfully");
        }

        languages.put("Pyhton","an interpreted, object-orientated, hih-level programming language with dynamic semantics");
        languages.put("Algol","an algorythmic language");
        System.out.println(languages.put("BASIC","Beginners All Purposes Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp","Therein lied madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java","this course is about Java");
        }

        System.out.println("=============================");

//        languages.remove("Lisp");
        if(languages.remove("Algol","an algorythmic language")) {
            System.out.println("Algol removed");
        }
        else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp","Therein lied madness","a functional programing language with imperative features")) {
            System.out.println("Lisp replaced");
        }
        else {
            System.out.println("Lisp was not replaced");
        }

//        System.out.println(languages.replace("Scala","this will not be added"));

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
