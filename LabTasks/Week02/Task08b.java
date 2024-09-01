// Create a program that compares two numbers and prints which one is bigger or if they are equal.

class Task08b {

    public static void main(String[] args) {

        int num1 = 15;
        int num2 = 20;

        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else if (num1 < num2) {
            System.out.println(num2 + " is bigger");
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
