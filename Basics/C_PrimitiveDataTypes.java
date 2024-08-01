// Primitive data types are the simplest types of data with predefined sizes and ranges. 
// They are used to store simple values.

public class C_PrimitiveDataTypes {

    public static void main(String[] args) {
        
        // Integer types
        byte b = 10; // 8-bit integer
        short s = 1000; // 16-bit integer
        int i = 100000; // 32-bit integer
        long l = 10000000000L; // 64-bit integer, notice the 'L' suffix

        // Floating-point types
        float f = 10.5f; // 32-bit floating-point, notice the 'f' suffix
        double d = 10.5; // 64-bit floating-point

        // Character type
        char c = 'A'; // 16-bit Unicode character

        // Boolean type
        boolean bool = true; // true or false

        // Printing the values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Integer value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Character value: " + c);
        System.out.println("Boolean value: " + bool);
    }
}
