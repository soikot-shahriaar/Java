/* Write a Java program that reads 5 numbers from the user into a list. 
After reading each number, print all the numbers that have been entered so far in the list.

Example:
If the user enters 3, prints “Numbers in the list: [3]
If the user enters 5 next, prints “Numbers in the list: [3, 5]
If the user enters 34, prints “Numbers in the list: [3, 5, 34]
If the user then enters -11, prints “Numbers in the list: [3, 5, 34, -11]
Finally, if the user enters 0 as the last number, prints “Numbers in the list: [3, 5, 34, -11, 0]
 */

import java.util.*;

public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            numbers.add(num);
            System.out.println("Numbers in the list: " + numbers);
        }
    }
}
