// Program to generate the multiplication table for a specific number input by user.

import java.util.Scanner;

public class Z_MultiplicationTable {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the number for the multiplication table: ");
            int number = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " X " + i + " = " + (number * i));
            }
        }
    }
}
