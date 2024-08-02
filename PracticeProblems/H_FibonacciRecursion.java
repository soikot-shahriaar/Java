// Function to print the nth term of the Fibonacci series using recursion.

public class H_FibonacciRecursion {

    public static void main(String[] args) {
        int n = 11;
        int result = fib(n);
        System.out.println("The " + n + "th term of the Fibonacci series is: " + result);
    }

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
