package com.example.assignment2;

public class TaxCalculator {
    public static double calculateTax(double income, double deduction) {
        double taxable = income - deduction;
        double rate = 0.15;
        double tax = taxable * rate;

        if (tax < 0) {
            return 0;
        }

        return tax;
    }
}
