// Literals are the constant values assigned to variables.
// They can be of various types like integer, float, double, char, boolean, and string.

public class D_LiteralsExample {

    public static void main(String[] args) {
        
        // Integer literals
        int decimalLiteral = 100; // Decimal literal
        int hexLiteral = 0x64; // Hexadecimal literal (100 in decimal)
        int octalLiteral = 0144; // Octal literal (100 in decimal)
        int binaryLiteral = 0b1100100; // Binary literal (100 in decimal)

        // Long literal
        long longLiteral = 10000000000L; // Notice the 'L' suffix

        // Floating-point literals
        float floatLiteral = 10.5f; // Notice the 'f' suffix
        double doubleLiteral = 10.5; // Default type for decimals

        // Character literal
        char charLiteral = 'A'; // Single character in single quotes

        // Boolean literals
        boolean trueLiteral = true;
        boolean falseLiteral = false;

        // String literal
        String stringLiteral = "Hello, World!"; // String in double quotes

        // Printing the values
        System.out.println("Decimal Literal: " + decimalLiteral);
        System.out.println("Hexadecimal Literal: " + hexLiteral);
        System.out.println("Octal Literal: " + octalLiteral);
        System.out.println("Binary Literal: " + binaryLiteral);
        System.out.println("Long Literal: " + longLiteral);
        System.out.println("Float Literal: " + floatLiteral);
        System.out.println("Double Literal: " + doubleLiteral);
        System.out.println("Character Literal: " + charLiteral);
        System.out.println("Boolean Literal (true): " + trueLiteral);
        System.out.println("Boolean Literal (false): " + falseLiteral);
        System.out.println("String Literal: " + stringLiteral);
    }
}
