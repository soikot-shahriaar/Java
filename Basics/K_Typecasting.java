// Typecasting is the process of converting a variable from one type to another. This can be automatic (implicit) or manual (explicit)

public class K_Typecasting {

    public static void main(String[] args) {
        
        // Implicit Typecasting (Widening Conversion)
        int intValue = 100;
        double doubleValue = intValue; // int is automatically cast to double
        System.out.println("Implicit Typecasting:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);

        // Explicit Typecasting (Narrowing Conversion)
        double doubleValue2 = 9.78;
        int intValue2 = (int) doubleValue2; // double is explicitly cast to int
        System.out.println("\nExplicit Typecasting:");
        System.out.println("Double value: " + doubleValue2);
        System.out.println("Integer value: " + intValue2);

        // Typecasting with Characters
        char charValue = 'A';
        int asciiValue = charValue; // char is implicitly cast to int
        char newCharValue = (char) (asciiValue + 1); // int is explicitly cast to char
        System.out.println("\nTypecasting with Characters:");
        System.out.println("Character value: " + charValue);
        System.out.println("ASCII value: " + asciiValue);
        System.out.println("New character value: " + newCharValue);
    }
}

/*  
Implicit Typecasting (Widening Cast):
    Occurs automatically when converting from a smaller type to a larger type (e.g., int to float).
    Example: int a = 10; float b = a; (No explicit cast needed)

Explicit Typecasting (Narrowing Cast):
    Requires manual intervention to convert from a larger type to a smaller type (e.g., double to int).
    Example: double d = 9.8; int i = (int)d; (Explicit cast needed)

Typecasting with Characters:
    Characters are essentially integers represented by their ASCII values.
    When performing arithmetic operations with characters, they are implicitly converted to their integer values. We need to cast them back to char if we want to use them as characters.

Arithmetic with Characters:
    Arithmetic operations on characters involve their ASCII values.
    After performing operations, casting back to char is necessary to get the resulting character.
 */
