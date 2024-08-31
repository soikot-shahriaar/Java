// Write a program that prints your name followed by "starts coding in Java!".

import java.util.Scanner;

public class Task01b {

    public static void main(String[] args) {
		
        String Name;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        Name = sc.nextLine();

        System.out.println(Name + " starts coding in Java!");
    }
}
