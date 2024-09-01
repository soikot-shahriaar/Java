// Write a program that initializes an array with the first 10 even numbers and prints them.

class Task14b {

    public static void main(String[] args) {

        int[] evenNumbers = new int[10];

        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = (i + 1) * 2;
        }

        for (int number : evenNumbers) {
            System.out.println(number);
        }
    }
}
