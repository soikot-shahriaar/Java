/* Write the Java code of a program that reads the radius of a circle and prints its circumference and  area.  
Hint(1): You may need to import the Math class to use Math.PI for getting the value of π (pi).
Hint(2): You can use the formula Math.pow(number, power) for calculating the square of the radius, or simply use the multiplication operator, e.g., radius * radius.

Sample Input:  
4  
Sample Output:  
Area is 50.26548245743669  
Circumference is 25.132741228718345  
 */

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        double Rad, Area, Cir;

        Scanner sc = new Scanner(System.in);
        Rad = sc.nextDouble();

        // area = Math.PI * radius * radius;
        Area = Math.PI * Math.pow(Rad, 2);
        Cir = 2 * Math.PI * Rad;

        System.out.println("Area is " + Area);
        System.out.println("Circumference is " + Cir);

        sc.close();
    }
}
