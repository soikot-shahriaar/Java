/* Write a Java program that turns every item of a list into its square. 
Hint: Program should work for any lists, make changes to the lists below and check whether your program works correctly.

Sample Input:
1 2 3 4 5 6 7
Sample Output:
[1, 4, 9, 16, 25, 36, 49]
Sample Input:
3 5 1 6
Sample Output:
[9, 25, 1, 36]
 */

import java.util.*;

public class Task04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers separated by spaces:");

        String[] inputArray = sc.nextLine().split("\\s+");

        for (String str : inputArray) {
            numbers.add(Integer.parseInt(str));
        }

        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * numbers.get(i));
        }

        System.out.println("Squared numbers:");
        System.out.println(numbers);
    }
}
