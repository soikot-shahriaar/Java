/* Write a program that takes a string as input and prints "Binary Number" if the string contains
only 0s or 1s. Otherwise, print "Not a Binary Number".

Sample Input:
01101101101
Sample Output:
Binary Number
Sample Input:
12344ab0
Sample Output:
Not a Binary Number
 */

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean isBinary = true;
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar != '0' && currentChar != '1') {
                isBinary = false;
                break;
            }
        }

        if (isBinary) {
            System.out.println("Binary Number");
        } else {
            System.out.println("Not a Binary Number");
        }
    }
}
