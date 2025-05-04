package com.estesjorie;

public class Main {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30){
            System.out.println("It's a hot day!");
            System.out.println("Drink lots of water!");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("It's a nice day!");
        } else {
            System.out.println("Cold day!");
        }
    }
}
