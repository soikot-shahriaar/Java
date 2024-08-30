/* Write the Java code of a program that reads an integer as input from the user, and prints the integer if it is a multiple of 2 OR 5 and prints "Not a multiple of 2 OR 5" otherwise.  
For Example: 2, 4, 5, 6, 8, 10, 12, 14, 15, 16, 18, 20, 22 … i.e. this includes multiples of 2 only,  multiples of 5 only and multiples of 2 and 5 both.  
Hint(1): We may use the modulus (%) operator for checking the divisibility.
Hint(2): We can consider the number to be an integer. 
Sample Input:  
5  
Sample Output:  
5  
Sample Input:   
3  
Sample Output:  
Not a multiple of 2 OR 5 
 */

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        int NumA;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();

        if (NumA % 2 == 0 || NumA % 5 == 0) {
            System.out.println(NumA);
        } else {
            System.out.println("Not a multiple of 2 OR 5");
        }

        sc.close();
    }
}
