/* A method is a block of code that performs a specific task. Methods are used to perform certain actions, and they are also known as functions.

returnType methodName(parameters) {
    // method body
}
 */

public class ZE_Methods {

    // Main method - execution starts here
    public static void main(String[] args) {
        // Calling the addNumbers method with arguments 5 and 10
        int sum = addNumbers(5, 10);
        // Printing the result to the console
        System.out.println("Sum: " + sum);
    }

    // addNumbers method - takes two integers as input and returns their sum
    public static int addNumbers(int a, int b) {
        // Calculate the sum of a and b
        int result = a + b;
        // Return the result to the caller
        return result;
    }
}
