// Write a program to read a file named "input.txt" and print each line to the console.

import java.io.*;
import java.util.Scanner;

public class Task20a {

    public static void main(String[] args) {

        String fileName = "input.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
