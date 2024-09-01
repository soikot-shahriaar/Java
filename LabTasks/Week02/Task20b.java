// Create a program to write the first 10 squares (1, 4, 9, ..., 100) to a file called "squares.txt", then read the file and print its content to the console.

import java.io.*;
import java.util.Scanner;

public class Task20b {

    public static void main(String[] args) {

        String fileName = "squares.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i <= 100; i++) {
                int square = i * i;
                writer.write(square + "\n");
            }
            System.out.println("Successfully wrote squares to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("\nContents of the file:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
