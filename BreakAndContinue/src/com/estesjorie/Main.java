package com.estesjorie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input = "";

        while (true){ //requires break statement
            System.out.print("Input:");
            input = scanner.next().toLowerCase();

            if (input.equals("pass"))
                continue;

            if (input.equals("quit"))
                break;
        }
    }
}
