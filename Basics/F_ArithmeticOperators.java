
import java.util.Scanner;

public class F_ArithmeticOperators {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Enter two integers: ");
            System.out.print("Enter x: ");
            int x = scanner.nextInt();
            System.out.print("Enter y: ");
            int y = scanner.nextInt();

            // Arithmetic Operators
            System.out.println("Arithmetic Operators:");
            System.out.println("x + y = " + (x + y)); // Addition
            System.out.println("x - y = " + (x - y)); // Subtraction
            System.out.println("x * y = " + (x * y)); // Multiplication
            System.out.println("x / y = " + (x / y)); // Division
            System.out.println("x % y = " + (x % y)); // Modulus
            System.out.println("x++ = " + (x++)); // Increment
            System.out.println("y-- = " + (y--)); // Decrement
        }
    }
}

/* 
Resulting data type after arithmetic operation:
Result = byte + short -> integer
Result = short + integer -> integer
Result = long + float -> float
Result = integer + float -> float
Result = character + integer -> integer
Result = character + short -> integer
Result = long + double -> double
Result = float + double -> double

Increment and Decrement operators:
    a++, ++a (Increment Operators)
    a--, --a (Decrement Operators)
    a++ -> first use the value and then increment
    ++a -> first increment the value then use it
 */