/* Write the Java code of a program that reads two numbers from the user. The program should then  print "First is greater" if the first number is greater, "Second is greater" if the second number is  greater, and "The numbers are equal" otherwise.

Sample Input:  
-33  
-3  
Sample Output:  
Second is greater  
 */

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        int NumA, NumB;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();
        NumB = sc.nextInt();

        if (NumA > NumB) {
            System.out.println("First is greater");
        } else if (NumA < NumB) {
            System.out.println("Second is greater");
        } else {
            System.out.println("The numbers are equal");
        }

        sc.close();
    }
}
