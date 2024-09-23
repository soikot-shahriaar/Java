/* Task A

Assume, you have been given two lists. 
[Your program should work for any two given lists; change the following lists and check whether your program works correctly for the code you have written]
list_one = [1, 2, 3, 4, 5, 6, 7, 8, 9]
list_two = [10, 11, 12, -13, -14,-15,-16

Write a Java program that creates a new list with all the even elements of both of the given lists and prints the new list.
Hint: You may create a third list to store the even elements of the given lists.
Output for the above lists: [2, 4, 6, 8, 10, 12, -14, -16]
 */

import java.util.*;

public class Task01 {

    public static void main(String[] args) {

        ArrayList<Integer> list_one = new ArrayList<>();
        ArrayList<Integer> list_two = new ArrayList<>();
        ArrayList<Integer> even_list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of list_one: ");
        int length1 = sc.nextInt();

        System.out.println("Enter numbers for list_one: ");
        for (int i = 0; i < length1; i++) {
            int number = sc.nextInt();
            list_one.add(number);
        }

        System.out.println("Enter length of list_two: ");
        int length2 = sc.nextInt();

        System.out.println("Enter numbers for list_two: ");
        for (int i = 0; i < length2; i++) {
            int number = sc.nextInt();
            list_one.add(number);
        }

        for (int num : list_one) {
            if (num % 2 == 0) {
                even_list.add(num);
            }
        }

        for (int num : list_two) {
            if (num % 2 == 0) {
                even_list.add(num);
            }
        }
        System.out.println("Even elements: " + even_list);
    }
}
