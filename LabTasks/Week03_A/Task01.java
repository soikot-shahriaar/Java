/* Write a Java program that takes a String as an stringInput from the user and prints that String in reverse order. 
Note: You cannot use the built-in reverse() function for this task.

Sample stringInput:
Java Programming
Sample Output:
gnimmargorP avaJ
 */

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();

        String reversed = "";
        for (int i = stringInput.length() - 1; i >= 0; i--) {
            reversed = reversed + stringInput.charAt(i);
        }
        System.out.println(reversed);
        sc.close();
    }
}
