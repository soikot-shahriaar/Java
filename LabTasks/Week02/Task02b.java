// Print the full name by combining two string variables, firstName and lastName.

import java.util.Scanner;

public class Task02b {

    public static void main(String[] args) {

        String FirName, LstName;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        FirName = sc.nextLine();
        System.out.print("Enter last name: ");
        LstName = sc.nextLine();

        System.out.println("My name is: " + FirName + " " + LstName);
    }
}
