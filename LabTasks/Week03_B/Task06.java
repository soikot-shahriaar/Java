/* Write a Java program that reads a string containing 7 numbers separated by commas, 
then makes a list of those numbers and prints the largest number and its location or index position in the list. 
Hint01: You are not allowed to use the max(), sort(), sorted() function here.
Hint02: You may assume the first input to be the largest value initially and the largest value’s location to be 0.
Hint03: Program should work for any lists, make changes to the lists below and check whether your program works correctly.
Hint04: You may need to be careful while printing the output. Depending on your code, you might need data conversion.

Sample Input:
7, 13, 2, 10, 6, -11, 0
Sample Output:
My list: [7, 13, 2, 10, 6, -11, 0]
Largest number in the list is 13 which was found at index 1 
 */

import java.util.*;

public class Task06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 7 numbers separated by commas:");
        String input = scanner.nextLine();

        String[] numberStrings = input.split("\\s*,\\s*");

        List<Integer> numbers = new ArrayList<>();
        for (String numStr : numberStrings) {
            numbers.add(Integer.parseInt(numStr));
        }

        int largest = numbers.get(0);
        int largestIndex = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
                largestIndex = i;
            }
        }
        System.out.println("My list: " + numbers);
        System.out.println("Largest number in the list is " + largest + " which was found at index " + largestIndex);
    }
}
