package com.estesjorie;

public class Main {
    public static void main(String[] args) {
        String output = greetUser("Joe", "T");
        System.out.println(output);
    }

    public static String greetUser(String fName, String lName) {
        return "Hello "+fName+" "+lName+"!";
    }
}
