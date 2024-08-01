/*
The continue Statement:
    The continue statement is used to skip the current iteration of a loop and proceed to the next iteration. When continue is encountered, the rest of the code inside the loop for the current iteration is skipped, and the loop proceeds with the next iteration.  
 */

public class W_Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip the iteration when i is 5
            }
            System.out.println(i);
        }
        System.out.println("Loop completed.");
    }
}
