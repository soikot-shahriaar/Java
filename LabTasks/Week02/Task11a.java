// Write a program that calculates the factorial of a number using a while loop

class Task11a {

    public static void main(String[] args) {

        int number = 5;
        int factorial = 1;

        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("The factorial of " + number + " is " + factorial);
    }
}
