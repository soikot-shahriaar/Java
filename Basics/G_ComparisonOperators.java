
import java.util.Scanner;

public class G_ComparisonOperators {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter two integers: ");
            System.out.print("Enter x: ");
            int x = scanner.nextInt();
            System.out.print("Enter y: ");
            int y = scanner.nextInt();

            // Comparison Operators
            System.out.println("Comparison Operators:");
            System.out.println("x == y: " + (x == y)); // Equal to
            System.out.println("x != y: " + (x != y)); // Not equal to
            System.out.println("x > y: " + (x > y)); // Greater than
            System.out.println("x < y: " + (x < y)); // Less than
            System.out.println("x >= y: " + (x >= y)); // Greater than or equal to
            System.out.println("x <= y: " + (x <= y)); // Less than or equal to

            scanner.close();
        }
    }
}
