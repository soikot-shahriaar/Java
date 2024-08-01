/* An array is a data structure that holds a fixed number of values of a single type. Each value is called an element, and each element is accessed using an index. In Java, arrays are used to store multiple values in a single variable. */

public class ZA_ArrayBasic {

    public static void main(String[] args) {

        // 1. Declaration and Memory Allocation
        // This creates an array with a fixed size of 5. The elements are initialized to default values (0 for int).
        int[] marks = new int[5];

        // 2. Declaration and then Memory Allocation
        // First, declare the array. Then, allocate memory for 5 elements.
        // Initialize the array elements individually.
        int[] marks2;
        marks2 = new int[5];
        marks2[0] = 100;
        marks2[1] = 60;
        marks2[2] = 70;
        marks2[3] = 90;
        marks2[4] = 86;

        // 3. Declaration, Memory Allocation, and Initialization Together
        // This creates an array with 5 elements and initializes them with the provided values.
        int[] marks3 = {98, 45, 79, 99, 80};

        // Accessing the Array Elements
        System.out.println(marks[0]); // Empty
        System.out.println(marks2[4]);
        System.out.println(marks3[3]);

        System.out.println(marks.length);
    }
}
