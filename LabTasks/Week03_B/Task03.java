/* Write a Java program that reads 5 numbers from the user into a list, and then prints them in the reverse order.
Hint: You may create a list to store the input numbers and then use loop to print them in reverse order.

Sample Input:
5
-5
100
1
0
Sample Output:
0
1
100
-5
5
 */

import java.util.*;

public class Task03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            int number = sc.nextInt();
            numbers.add(number);
        }

        System.out.println("Numbers in reverse order:");
        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
