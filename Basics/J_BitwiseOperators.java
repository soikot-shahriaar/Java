
import java.util.Scanner;

public class J_BitwiseOperators {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Enter two integers: ");
            System.out.print("Enter x: ");
            int x = scanner.nextInt();
            System.out.print("Enter y: ");
            int y = scanner.nextInt();

            // Bitwise Operators
            System.out.println("Bitwise Operators:");
            System.out.println("x & y: " + (x & y)); // Bitwise AND
            System.out.println("x | y: " + (x | y)); // Bitwise OR
            System.out.println("x ^ y: " + (x ^ y)); // Bitwise XOR
            System.out.println("x << 2: " + (x << 2)); // Left shift
            System.out.println("x >> 2: " + (x >> 2)); // Right shift
        }
    }
}
