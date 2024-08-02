// Program to find the factorial of a given number using for loop

import java.util.Scanner;

public class X_Factorial {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter a number to find its factorial: ");
            int number = scanner.nextInt();

            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}
