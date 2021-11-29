package com.signavio.solution;

public class GreetingKata {

    public static void main(String[] args) {
        String name = "Bob";
        System.out.println(greet(name));
    }

    public static String greet(String name) {

        //StringBuilder result = new StringBuilder();

        if (name == null || name.equals("")) return "Hello, my friend.";
        if (name.toUpperCase().equals(name)) return "HELLO " + name + "!";

        return "Hello, " + name + ".";
    }


    public static String greet(String[] names) {
        StringBuilder result = new StringBuilder();
        result.append("Hello");

        for (int i = 0; i < names.length -1; i++) {
            result.append(", ").append(names[i]);
        }
        result.append(" and ").append(names[names.length - 1]).append(".");

        return result.toString();
    }
}
