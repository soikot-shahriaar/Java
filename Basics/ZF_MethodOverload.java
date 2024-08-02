/* Method overloading allows a class to have more than one method with the same name, provided their parameter lists are different. This is a way to define multiple behaviors for a method based on different input parameters. 
Rules for Method Overloading: 
1. Different Number of Parameters.
2. Different Types of Parameters.
3. Changing the order of Parameters if they have different types.
 */

public class ZF_MethodOverload {

    public static void main(String[] args) {
        // Calling the overloaded methods
        System.out.println("Sum of two numbers: " + addNumbers(5, 10));
        System.out.println("Sum of three numbers: " + addNumbers(5, 10, 15));
        System.out.println("Concatenation of strings: " + addNumbers("Soikot ", "Shahriar"));
    }

    // Method to add two integers
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to concatenate two strings
    public static String addNumbers(String a, String b) {
        return a + b;
    }
}

/*
Method Signature: The combination of the method name and parameter list (number, type, and order of parameters) is called the method signature. Method overloading is based on different method signatures.

Return Type: The return type of the method is not considered for method overloading. You cannot overload methods just by changing the return type.

Access Modifiers: Overloaded methods can have different access modifiers, but this does not affect overloading.
 */
