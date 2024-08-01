
import java.util.Scanner;

public class L_Strings {

    public static void main(String[] args) {
        
        // Create strings using string literal
        String strA = "Hello, World!";
        String strB = "Java Programming";

        // Display strings
        System.out.println("String A: " + strA);
        System.out.println("String B: " + strB);

        // Formatted printing
        int number = 42;
        double decimal = 3.14159;
        System.out.printf("Formatted Output: number = %d, decimal = %.2f%n", number, decimal);

        // String user input
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}
