/*  Overloading with VarArgs: We can overload methods with VarArgs, but it should be done carefully to avoid ambiguity.

To resolve this ambiguity,  can differentiate the method signatures more clearly. One way to do this is by using a different type of parameter for the second method or by adding an additional parameter that makes the signatures distinct.
 */

public class ZH_VarArgsOverload {

    public static void main(String[] args) {
        displaySingle("Hello");
        displayMultiple("Prefix", "Hello", "World");
        displayMultiple("Prefix");
    }

    // Method to display a single string
    public static void displaySingle(String message) {
        System.out.println(message);
    }

    // Overloaded method with a prefix and variable arguments
    public static void displayMultiple(String prefix, String... messages) {
        System.out.print(prefix + ": ");
        for (String message : messages) {
            System.out.print(message + " ");
        }
        System.out.println();
    }
}
