/*
Program to print the following pattern using functions and recursion:
      *
     * *
    * * *
   * * * *
1. Define a recursive function to print a line with the required spaces and stars.
2. Define another recursive function to call the line printing function for each line of the pattern.
 */

public class I_PatternPrintingRecursion {

    public static void main(String[] args) {
        int n = 4;
        printPattern(n, 1);
    }

    // Print spaces
    public static void printSpaces(int n) {
        if (n > 0) {
            System.out.print(" ");
            printSpaces(n - 1);
        }
    }

    // Print stars
    public static void printStars(int n) {
        if (n > 0) {
            System.out.print("*");
            printStars(n - 1);
        }
    }

    // Print a single line with leading spaces and stars
    public static void printLine(int totalLines, int currentLine) {
        if (currentLine <= totalLines) {
            printSpaces(totalLines - currentLine);
            printStars(currentLine);
            System.out.println();
        }
    }

    // Print entire pattern
    public static void printPattern(int totalLines, int currentLine) {
        if (currentLine <= totalLines) {
            printLine(totalLines, currentLine);
            printPattern(totalLines, currentLine + 1);
        }
    }
}
