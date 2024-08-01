/* Getting user input in Java and handling different types of data (strings, integers, and doubles)

Imports: The Scanner class is imported to handle user input.
Resource Management: try-with-resources is used to automatically close the Scanner object after use. 
 */

import java.util.Scanner; // Import the Scanner class

public class E_UserInput {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Create a Scanner object to read input

            System.out.print("Enter name: ");
            // String name = scanner.next(); // Reads a single word
            String name = scanner.nextLine(); // Read a line of text (String)

            System.out.print("Enter age: ");
            int age = scanner.nextInt(); // Read an integer

            System.out.print("Enter Income: ");
            double height = scanner.nextDouble(); // Read a double

            System.out.println("Name is " + name);
            System.out.println("Age is " + age);
            System.out.println("Income is " + height);
        }
    }
}
