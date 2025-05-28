package com.estesjorie;

public class Main {
    public static void main(String[] args) {
        var employee1 = new Employee();
        employee1.baseSalary = 50_000;
        employee1.hourlyRate = 20;
        int wage = employee1.calcWage(10);
        System.out.println(wage);
    }
}
