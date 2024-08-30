/* Write the Java code of a program that reads two numbers from the user, and prints their sum,  product, and difference. 
Hint: subtract the second number from the first one.  

Sample Input:  
4  
5  
Sample Output:  
Sum = 9  
Product = 20  
Difference = -1  
 */

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        int NumA, NumB, Sum, Product, Difference;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();
        NumB = sc.nextInt();

        Sum = NumA + NumB;
        Product = NumA * NumB;
        Difference = NumA - NumB;

        System.out.println("Sum = " + Sum);
        System.out.println("Product = " + Product);
        System.out.println("Difference = " + Difference);

        sc.close();
    }
}
