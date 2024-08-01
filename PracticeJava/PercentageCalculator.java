// Calculate the percentage of the marks obtained in the subjects: Math, Physics, Chemistry, English, and ICT.

import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);) {
            
            int math, physics, chemistry, english, ict;

            System.out.println("Enter the obtained marks out of 100");

            System.out.print("Enter marks for Math: ");
            math = scanner.nextInt();
            System.out.print("Enter marks for Physics: ");
            physics = scanner.nextInt();
            System.out.print("Enter marks for Chemistry: ");
            chemistry = scanner.nextInt();
            System.out.print("Enter marks for English: ");
            english = scanner.nextInt();
            System.out.print("Enter marks for ICT: ");
            ict = scanner.nextInt();

            int totalMarks = math + physics + chemistry + english + ict;
            double percentage = (totalMarks / 5.0);

            System.out.println("Total marks: " + totalMarks + " out of 500");
            System.out.println("Percentage: " + percentage + "%");
        }
    }
}
