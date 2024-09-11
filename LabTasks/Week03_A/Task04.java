/* Write a Java program that will ask the user to enter a word as an input.
If the length of the input string is less than 4, then your program should print the same string as an output.
If the input string’s length is greater than 3, then your program should add "er" at the end of the input string.
If the input string already ends with "er", then add "est" instead, regardless of the length of the input string.
If the input string already ends with "est", then your program should print the same input string as an output.

Sample Input:
strong
Sample Output:
stronger
Sample Input:
stronger
Sample Output:
strongest
Sample Input:
strongest
Sample Output:
strongest
 */

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.endsWith("est")) {
            System.out.println(input);
        } else if (input.endsWith("er")) {
            String output = input.substring(0, input.length() - 2) + "est";
            System.out.println(output);
        } else if (input.length() < 4) {
            System.out.println(input);
        } else {
            String output = input + "er";
            System.out.println(output);
        }
    }
}
