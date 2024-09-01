// Write a program that keeps asking the user for a number until they enter -1, then stops.

import java.util.Scanner;

class Task12a {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter a number (-1 to stop): ");
            number = sc.nextInt();
        } while (number != -1);

        System.out.println("Program terminated.");
        sc.close();
    }
}
