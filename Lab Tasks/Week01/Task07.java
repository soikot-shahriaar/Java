/* Write the Java code of a program that reads an integer, and prints the integer it is a multiple of  either 2 or 5 but not both. If the number is a multiple of 2 and 5 both, then print "Multiple of 2 and 5 both". For all other numbers, the program prints "Not a multiple we want".  
For Example: 2, 4, 5, 6, 8, 12, 14, 15, 16, 18, 22 … i.e. this includes multiples of 2 only and multiples of 5 only, NOT multiples of 2 and 5 both or other numbers.  
Hint(1): We may use the modulus (%) operator for checking the divisibility.
Hint(2): We can consider the number to be an integer. 

Sample Input:  
6  
Sample Output:  
6  
Sample Input:  
17
Sample Output:  
Not a multiple we want
 */

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        int NumA;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();

        if (NumA % 2 == 0 && NumA % 5 == 0) {
            System.out.println("Multiple of 2 and 5 both");
        } else if (NumA % 2 == 0 || NumA % 5 == 0) {
            System.out.println(NumA);
        } else {
            System.out.println("Not a multiple we want");
        }

        sc.close();
    }
}
