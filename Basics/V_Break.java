/*
The break Statement:
    The break statement is used to exit from a loop or switch statement before it has completed its normal sequence. When break is encountered inside a loop, the loop is terminated immediately, and the control resumes at the next statement following the loop. 
 */

 public class V_Break {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Exit the loop when i is 6
            }
            System.out.println(i);
        }
        System.out.println("Loop terminated.");
    }
}
