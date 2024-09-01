// Create an array of 6 integers, print them, reverse the array, then print it again.

class Task15a {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.println(number);
        }

        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        System.out.println("Reversed array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
