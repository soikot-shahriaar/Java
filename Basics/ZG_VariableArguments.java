/* Variable Arguments (VarArgs) in Java allow to create methods that accept an arbitrary number of arguments. This feature provides a flexible way to handle multiple arguments without needing to define overloaded methods for different numbers of parameters.

To declare a method with variable arguments, you use the ellipsis (...) syntax. 

returnType methodName(dataType... variableName) {
    // method body
}
 */

public class ZG_VariableArguments {

    public static void main(String[] args) {
        // Calling the method with different numbers of arguments
        printNumbers(1, 2, 3);
        printNumbers(4, 5, 6, 7, 8);
        printNumbers(9);
    }

    // Method that accepts variable number of integer arguments
    public static void printNumbers(int... numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

/*
VarArgs as Arrays: Inside the method, the variable argument is treated as an array.

Single VarArgs Parameter: A method can have only one variable argument, and it must be the last parameter in the method's parameter list.
 */
