package com.estesjorie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine().trim(); //trim any whitespace
        System.out.println("Your name: " + name);
    }
}
