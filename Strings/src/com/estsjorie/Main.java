package com.estsjorie;

public class Main {
    public static void main(String[] args) {
        String message = new String("Hello World");
        String message2 = "Hello World" + "!"; //use a string literal
        boolean endsCorrect = message.endsWith("!");

        System.out.println(message.length()); //checks length of object
        System.out.println(endsCorrect);
    }
}
