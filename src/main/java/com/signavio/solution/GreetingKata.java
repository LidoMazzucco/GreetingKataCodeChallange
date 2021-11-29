package com.signavio.solution;

import java.util.ArrayList;
import java.util.List;

public class GreetingKata {

    private static final String LOWERCASE_START = "Hello,";
    private static final String UPPERCASE_START = "HELLO";
    private static final String LOWERCASE_AND = " and ";
    private static final String UPPERCASE_AND = " AND ";
    private static final String LOWERCASE_END = ".";
    private static final String UPPERCASE_END = "!";

    public static void main(String[] args) {
        String name = "";
        System.out.println(greet(name));
//        String[] names = {"Bob", "JANE", "Mark", "LISA"};
        String[] names = {"Bob", "JANE"};
        String[] nameUpper = {"JANE", "LISA", "OTTO"};

        System.out.println(greet(names));
    }

    public static String greet(String name) {

        if (name == null || name.equals("")) return LOWERCASE_START + " my friend" + LOWERCASE_END;
        if (name.toUpperCase().equals(name)) return UPPERCASE_START + " " + name + UPPERCASE_END;

        return LOWERCASE_START + name + LOWERCASE_END;
    }


    public static String greet(String[] names) {
        StringBuilder result = new StringBuilder();
        List<String> lowercaseNames = new ArrayList<>();
        List<String> uppercaseNames = new ArrayList<>();

        for (String name : names) {
            if (name.toUpperCase().equals(name)) {
                uppercaseNames.add(name);
            } else {
                lowercaseNames.add(name);
            }
        }

        if (!lowercaseNames.isEmpty()) {
            result.append(buildGreet(lowercaseNames, LOWERCASE_START, LOWERCASE_END, LOWERCASE_AND));
            if (!uppercaseNames.isEmpty()) {
                result.append(buildGreet(uppercaseNames, UPPERCASE_AND + UPPERCASE_START, UPPERCASE_END, UPPERCASE_AND));
            }
        } else {
            result.append(buildGreet(uppercaseNames, UPPERCASE_START, UPPERCASE_END, UPPERCASE_AND));
        }

        return result.toString();
    }

    private static String buildGreet(List<String> namesList, String startMessage, String endMessage, String andMessage) {
        StringBuilder result = new StringBuilder();
        result.append(startMessage).append(" ").append(namesList.get(0));
        if (namesList.size() > 1) {
            for (int i = 1; i < namesList.size() - 1; i++) {
                result.append(", ").append(namesList.get(i));
            }
            result.append(andMessage).append(namesList.get(namesList.size() - 1));
        }
        return result.append(endMessage).toString();
    }
}
