package com.estesjorie;

public class Main {
    public static void main(String[] args) {
        short x = 1;
        int y = x +2; //implicit casting (smaller datatype converted to bigger)
        System.out.println(y);

        double x1 = 1.1;
        double y1 = x1 + 2;
        System.out.println(y1); //returns 3.1

        double x2 = 1.1;
        int y2 = (int)x + 2;
        System.out.println(y2); //explicitly casted to int

        String x3 = "1";
        int y3 = Integer.parseInt(x3) + 3;
        System.out.println(y3);
    }
}
