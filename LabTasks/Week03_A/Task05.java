/* Write a Java program that will ask the user to input a string (containing exactly one word).
Then your program should print subsequent substrings of the given string as shown in the examples below.

Sample Input:
BANGLA
Sample Output:
B
BA
BAN
BANG
BANGL
BANGLA

Explanation: The length of the string is 6 so there are 6 lines where in each line a substring of
the input string, of length equal to the line number is printed i.e. substring with only the letter
"B" printed in the first line, substring "BA" of length 2 printed in the 2nd line, "BAN" length of
which is 3 being printed in the 3rd line and so on. 
 */

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String stringInput = sc.nextLine();
        String subString = "";

        for (int i = 0; i <= stringInput.length() - 1; i++) {
            subString = subString + stringInput.charAt(i);
            System.out.println(subString);
        }
    }
}
