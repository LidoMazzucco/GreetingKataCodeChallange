package com.signavio.solution;

public class GreetingKata {

    public static void main(String[] args) {
        String name = "Bob";
        System.out.println(greet(name));
    }

    public static String greet(String name) {

        StringBuilder result = new StringBuilder();

        if (name == null || name.equals("")) return "Hello, my friend.";
        if (name.toUpperCase().equals(name)) return "HELLO " + name + "!";

        return "Hello, " + name + ".";
    }


    public static String greet(String[] names) {

        return "Hello, " + names[0] + " and " + names[1] + ".";
    }
}
