package com.estesjorie;

public class Main {
    public static void main(String[] args) {
        int role = 1;
        switch (role) {
            case 1:
                System.out.println("Admin");
                break;
            case 2:
                System.out.println("Moderator");
                break;
            default:
                System.out.println("Guest");
        }
    }
}
