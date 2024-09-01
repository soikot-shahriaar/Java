// Write a function named `max` that takes two numbers as arguments and returns the larger of them.

class Task18a {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = max(num1, num2);
        System.out.println("The larger number is: " + result);
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
