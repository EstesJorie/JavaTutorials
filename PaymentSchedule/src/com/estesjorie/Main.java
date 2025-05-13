package com.estesjorie;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte PERCENT = 100;
    final static byte MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        int principal = (int)readNumber("Principal", 1000, 1_000_000);
        float annualRate = (float)readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte)readNumber("Period (Years): ", 1, 30);

        double mortgage = calcMortgage(principal, annualRate, years);
        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("Mortgage: \n");
        System.out.println("-------------");
        System.out.println("Monthly Payments: \n" + mortgageFormat);

        System.out.println();
        System.out.println("Payment Schedule:");
        System.out.println("-------------");
        for (short month = 1; month <= years * MONTHS_IN_YEAR; month++) {
            double bal = calcBalance(principal, annualRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(bal));
        }
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

    public static double calcBalance(double principal, double annualRate, byte years, short numOfPaymentsMade) {
        short numOfPayments = (short)(years * MONTHS_IN_YEAR);
        double monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;
        double balance = principal * (Math.pow(1 + monthlyRate, numOfPayments) - Math.pow(1 + monthlyRate, numOfPaymentsMade))
                        / (Math.pow(1 + monthlyRate, numOfPayments) - 1);

        return balance;
    }

    public static double calcMortgage(double principal, float annualRate, byte years){
        short numOfPayments = (short)(years * MONTHS_IN_YEAR);
        float monthlyRate = annualRate / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyRate * Math.pow(1 + monthlyRate, numOfPayments))
                / (Math.pow(1 + monthlyRate, numOfPayments) - 1);

        return mortgage;
    }
}
