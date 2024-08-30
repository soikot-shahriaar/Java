/* Write the Java code of a program that finds the number of hours, minutes, and seconds in a given number of seconds. The number of seconds is taken as input from the user.  
Hint(1): We may consider our user input to be an integer value and use the / and % operators to solve the problem. 
Hint(2): 1 hour = 60 mins = 3600 seconds and 1 min = 60 seconds. 

Sample Input:  
10000  
Sample Output:  
Hours:2 Minutes:46 Seconds:40  
 */

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        int NumA;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();

        System.out.println("Hours:" + NumA / 3600 + " Minutes:" + NumA % 3600 / 60 + " Seconds:" + NumA % 3600 % 60);

        sc.close();
    }
}
