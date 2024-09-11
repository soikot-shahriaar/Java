/* Write a Java program that takes an input from the user, then creates a new list excluding the first two and last two elements of the given list and prints the new list. 
If there are not enough elements in the list to do the task, print "Not possible".
Hint: You may use list slicing.

Sample Input:
10, 20, 24, 25, 26, 35, 70
Sample Output:
[24, 25, 26]
Sample Input:
10, 20, 24, 25, 26
Sample Output:
[24]
Sample Input:
10, 20, 24, 25
Sample Output:
[]
Sample Input:
10, 20, 24
Sample Output:
Not possible
 */

import java.util.*;

public class Task02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the numbers separated by commas:");
        String input = sc.nextLine();
        String[] inputArray = input.split(",");

        for (String str : inputArray) {
            numbers.add(Integer.parseInt(str.trim()));
        }

        if (numbers.size() < 4) {
            System.out.println("Not possible");
        } else {
            List<Integer> newList = numbers.subList(2, numbers.size() - 2);
            System.out.println(newList);
        }
    }
}
