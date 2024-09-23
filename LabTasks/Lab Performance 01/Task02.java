/* Task B
Write a Java program that will ask the user to input a string (containing exactly one word). 
Then print the ASCII code for each character in the String
To check if your program is working correctly or not, you can find a list of all correct values from the following website.
You may look at "Dec" and "Char" columns only and ignore the other columns for this problem. link: http://www.asciitable.com/

Sample Input: Programming
Sample Output:
P:80
r: 114
0:111
g: 103
г: 114
a: 97
m: 109
m:109
1: 105
n: 110
g: 103
Explanation: Each line prints a letter sequentially from the given string and its corresponding ASCII value separated by ":"
 */

import java.util.*;

public class Task02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a string: (Only one word)");
        String input = sc.next();

        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            int asciiValue = (int) character;

            System.out.println(character + ": " + asciiValue);
        }
        sc.close();
    }
}
