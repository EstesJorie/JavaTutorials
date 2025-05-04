package com.estesjorie;

public class Main {
    public static void main(String[] args) {
        int result = 10 + 3;
        System.out.println(result); //ans: 13

        double result2 = (double)10 / (double)3; //cast INT to DOUBLE
        System.out.println(result2);

        int x = 1;
        int y = x++; // y = 1 then x incremented (x = 2, y = 1)

        int x1 = 1;
        int y2 = ++x; // x increment so y = 2 (x=2, y=2)

        int x2 = 1;
        x2 = x + 2; //ans: 3
        x2 += 2;
    }
}
