// if-else statement allows to execute certain parts of code based on specific conditions.

import java.util.Scanner;

public class N_Conditionals {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter marks: ");
            int score = scanner.nextInt();

            if (score == 100) {
                System.out.println("Grade: A+");
            } else if (score >= 90) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else {
                System.out.println("Grade: F");
            }
        }
    }
}
