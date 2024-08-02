/* Recursion is a programming technique where a method calls itself to solve a problem. 
Recursion is especially useful for problems that can be broken down into smaller, similar sub-problems. 

One common example of recursion is calculating the factorial of a number.
The factorial of a non-negative integer n is the product of all positive integers less than or equal to n. 
It is denoted by n!.

factorial(n) = n * factorial(n - 1) for n >= 1
factorial(0) = 1
 */

public class ZI_RecursionFactorial {

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }
}
