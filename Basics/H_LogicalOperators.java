
import java.util.Scanner;

public class H_LogicalOperators {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {

            System.out.println("Enter two integers: ");
            System.out.print("Enter x: ");
            int x = scanner.nextInt();
            System.out.print("Enter y: ");
            int y = scanner.nextInt();

            // Logical Operators
            System.out.println("Logical Operators:");
            boolean a = x < y;
            boolean b = x != y;
            System.out.println("x < y && x != y: " + (a && b)); // Logical AND
            System.out.println("x < y || x == y: " + (a || (x == y))); // Logical OR
            System.out.println("!(x < y && x == y): " + (!(a && (x == y)))); // Logical NOT
        }
    }
}
