/* Write a Java program that removes all empty strings from a given list and prints the modified list.
Hint: Program should work for any lists, make changes to the lists below and check whether your program works correctly.

Sample Input:
Hey there! '' what's '' up '' ?
Sample Output:
Original List: ['hey', 'there', '', "what's", '', 'up', '', '?']
Modified List: ['hey', 'there', "what's", 'up', '?']
 */

import java.util.*;

public class Task05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements (use '' for empty strings):");
        String inputLine = scanner.nextLine();

        String[] inputArray = inputLine.replaceAll("''", "'' ").split("\\s+");

        List<String> list = new ArrayList<>(Arrays.asList(inputArray));
        System.out.println("Original List: " + list);

        list.removeIf(s -> s.equals("''") || s.isEmpty());
        System.out.println("Modified List: " + list);
    }
}
