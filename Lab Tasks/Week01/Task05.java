/* Write the Java code of a program that reads a number, and prints "The number is even" or "The  number is odd", depending on whether the number is even or odd.  
Hint(1): We may use the modulus (%) operator to check for even or odd.  
Hint(2): We can consider the number to be an integer.  

Sample Input:  
-33  
Sample Output:  
The number is odd  
 */

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        int NumA;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();

        if (NumA % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        sc.close();
    }
}
