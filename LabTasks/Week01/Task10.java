/* Write a Java program to compute and display a person’s weekly salary as determined by the following conditions:  
● If the hours worked is less than or equal to 40, then the person receives Tk 200 per hour.  
● If the hours worked is greater than 40, then the person receives Tk 8000 plus Tk 300 for  each hour worked over 40 hours.  
The program should request the hours worked as an input from the user and display the salary as output. You need to make sure that user input is valid. 
For example, a person cannot work for -5  hours or more than 168 hours in a week. So, the valid hours range is 0 to 168. For invalid hours, print outputs as given in the samples below.  
Hint: You can consider the hour (user input) to be an integer  and use the / and % operators to solve the problem.

Sample Input:  
100  
Sample Output:  
26000  
Explanation: Since, the number of hours worked is 100 > 40, therefore salary = 8000 + (100 -  40) * 300 = 26000.

Sample Input:  
30  
Sample Output:  
6000  
Explanation: Since, the number of hours worked is 30 < 40, therefore salary = 30 * 200 = 6000.  

Sample Input:  
-30  
Sample Output:  
Hour cannot be negative  

Sample Input:  
170  
Sample Output:  
Impossible to work more than 168 hours weekly 
 */

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        int NumA;

        Scanner sc = new Scanner(System.in);
        NumA = sc.nextInt();

        if (NumA < 0) {
            System.out.println("Hour cannot be negative");
        } else if (NumA > 168) {
            System.out.println("Impossible to work more than 168 hours weekly");
        } else if (NumA <= 40) {
            System.out.println(NumA * 200);
        } else {
            System.out.println(8000 + (NumA - 40) * 300);
        }

        sc.close();
    }
}
