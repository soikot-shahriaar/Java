/*
Write a Java program to calculate the income tax paid by an employee to the government based on the following income slabs:

1. Income up to 2.5 Lakhs: No tax.
2. Income from 2.5 Lakhs to 5 Lakhs: 5% 
3. Income from 5 Lakhs to 10 Lakhs: 20%
4. Income above 10 Lakhs: 30%
 */

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter income in Taka: ");
            double income = sc.nextDouble();
            double tax = 0;

            if (income <= 250000) {
                tax = 0;
            } else if (income > 250000 && income <= 500000) {
                tax = 0.05 * (income - 250000);
            } else if (income > 500000 && income <= 1000000) {
                tax = 0.05 * (500000 - 250000);
                tax += 0.20 * (income - 500000);
            } else if (income > 1000000) {
                tax = 0.05 * (500000 - 250000);
                tax += 0.20 * (1000000 - 500000);
                tax += 0.30 * (income - 1000000);
            }
            System.out.println("The total tax paid by the employee is: " + tax + " Tk");
        }
    }
}
