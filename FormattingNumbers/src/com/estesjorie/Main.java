package com.estesjorie;

import java.text.NumberFormat;

public class Main {
    public static void main(String[] args){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(1234567.891);
        System.out.println(result); //three digits after decimal

        String percentResult = NumberFormat.getPercentInstance().format(0.12);
        System.out.println(percentResult);
    }
}
