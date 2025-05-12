package com.estesjorie;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal = (int)readNumber("Principal", 1000, 1_000_000);
        float annualRate = (float)readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30)

        double mortgage = calcMortgage(principal, annualRate, years);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormat);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while(true) {
            System.out.println(prompt);
            value = scanner.nextFloat();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a valid value between " + min + " and " + max);
        }

        return value;
    }

    public static double calcMortgage(double principal, float annualRate, byte years){
        final byte PERCENT = 100;
        final byte MONTHS_IN_YEAR = 12;
        short numOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numOfPayments))
                / (Math.pow(1 + monthlyRate, numOfPayments) - 1);

        return mortgage;
    }
}
