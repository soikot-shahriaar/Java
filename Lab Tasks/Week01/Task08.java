/* Write the Java code of a program that reads an integer, and prints the integer if it is a multiple of 2 AND 5 and prints "Not multiple of 2 and 5 both" otherwise.  
For Example: 10, 20, 30, 40, 50 … i.e. this only includes numbers which are multiples of both 2 and 5.  
Hint(1): We may use the modulus (%) operator for checking the divisibility.
Hint(2): We can consider the number to be an integer. 


Sample Input:  
30 
Sample Output:  
30
Sample Input:  
15
Sample Output:  
Not multiple of 2 and 5 both  
 */

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        int NumA;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();

        if (NumA % 2 == 0 && NumA % 5 == 0) {
            System.out.println(NumA);
        } else {
            System.out.println("Not multiple of 2 and 5 both");
        }

        sc.close();
    }
}
