// Practice Problem: Recursive function to calculate the sum of first n natural numbers.

public class G_SumOfNumbers {

    public static void main(String[] args) {
        int number = 100;
        int result = sumRec(number);
        System.out.println("Sum of first " + number + " natural numbers is: " + result);
    }

    public static int sumRec(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRec(n - 1);
    }
}
