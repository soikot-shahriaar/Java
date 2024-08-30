/* Write the Java code of a program that reads two numbers, subtracts the smaller number from the larger one, and prints the result.  
Hint: First, we may check which number is greater  

Sample Input:  
-40  
-4  
Sample Output:  
36  
 */

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {

        int NumA, NumB;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();
        NumB = sc.nextInt();

        if (NumA > NumB) {
            System.out.println(NumA - NumB);
        } else if (NumA < NumB) {
            System.out.println(NumB - NumA);
        } else {
            System.out.println("The numbers are equal");
        }

        sc.close();
    }
}
