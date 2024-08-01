// Program to find out the day of the week by an user inputted number between 1 to 7

import java.util.Scanner;

public class Q_FindDayInWeek {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Enter a number between 1 to 7: ");
            int dayNumber = scanner.nextInt();

            String day;
            day = switch (dayNumber) {
                case 1 -> "Saturday";
                case 2 -> "Sunday";
                case 3 -> "Monday";
                case 4 -> "Tuesday";
                case 5 -> "Wednesday";
                case 6 -> "Thursday";
                case 7 -> "Friday";
                default -> "Invalid number!";
            };
            System.out.println("The day of the week is: " + day);
        }
    }
}
