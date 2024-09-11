/* Write a Java program that takes 2 inputs from the user, where the first input is a string with length greater than 1. 
The second input is the index of the first given string from where you have to start reversing. 
After reversing the first input string from that index, print the new string back to the user.
Hint: Reverse the characters of the string up to a given index and keep the rest of the string unchanged.

Sample Input:
72418
4
Sample Output:
81427
Sample Input:
12345
2
Sample Output:
32145
Explanation: The second input is '2' so we have to reverse from index 2 of our first input.
The 2nd index of our first input String is '3', index 1 is '2' and index 0 is '1'. 
Hence, if we reverse indexes 0 to 2, we get '321'. Index 3 and 4 which is '4' and '5' respectively remains unchanged hence our final output is '32145'. 
Sample Input:
aBcd1234defg
5
Sample Output:
21dcBa34defg 
 */

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int revIndex = sc.nextInt();

        String stringToReverse = inputString.substring(0, revIndex + 1);
        StringBuilder sb = new StringBuilder(stringToReverse);

        String reversedString = sb.reverse().toString();
        String remainingString = inputString.substring(revIndex + 1);
        String finalResult = reversedString + remainingString;

        System.out.println("Reversed string: " + finalResult);
    }
}
